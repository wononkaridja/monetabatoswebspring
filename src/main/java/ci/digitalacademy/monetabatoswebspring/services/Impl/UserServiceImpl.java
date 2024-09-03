package ci.digitalacademy.monetabatoswebspring.services.Impl;

import ci.digitalacademy.monetabatoswebspring.models.User;
import ci.digitalacademy.monetabatoswebspring.repositories.UserRepository;
import ci.digitalacademy.monetabatoswebspring.services.UserService;
import ci.digitalacademy.monetabatoswebspring.services.dto.UserDTO;
import ci.digitalacademy.monetabatoswebspring.services.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDTO save(UserDTO userDTO) {
        log.debug("Request to save user: {}", userDTO);
        User user = userMapper.toEntity(userDTO);
        user = userRepository.save(user);
        return userMapper.toDto(user);
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        log.debug("Request to update user: {}", userDTO);
        return findOne(userDTO.getId()).map(existingUser -> {
            existingUser.setPassword(existingUser.getPassword());
            existingUser.setPseudo(existingUser.getPseudo());
            return save(existingUser);
        }).orElseThrow(() -> new IllegalArgumentException());
    }

    @Override
    public Optional<UserDTO> findOne(Long id) {
        log.debug("Request to get User: {}", id);
        return userRepository.findById(id).map(user -> {
            return userMapper.toDto(user);
        });
    }

    @Override
    public List<UserDTO> findAll() {
        log.debug("Request to get all Users");
        return userRepository.findAll().stream().map(user -> {
            return userMapper.toDto(user);
        }).toList();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete User: {}", id);
        userRepository.deleteById(id);
    }
}
