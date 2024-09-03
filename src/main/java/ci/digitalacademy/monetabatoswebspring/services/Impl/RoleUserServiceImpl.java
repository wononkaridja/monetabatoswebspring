package ci.digitalacademy.monetabatoswebspring.services.Impl;

import ci.digitalacademy.monetabatoswebspring.models.RoleUser;
import ci.digitalacademy.monetabatoswebspring.repositories.RoleUserRepository;
import ci.digitalacademy.monetabatoswebspring.services.RoleUserService;
import ci.digitalacademy.monetabatoswebspring.services.dto.RoleUserDTO;
import ci.digitalacademy.monetabatoswebspring.services.mapper.RoleUserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class RoleUserServiceImpl implements RoleUserService {

    private final RoleUserRepository roleUserRepository;
    private final RoleUserMapper roleUserMapper;

    @Override
    public RoleUserDTO save(RoleUserDTO roleUserDTO) {
        log.debug("Request to save role user: {}", roleUserDTO);
        RoleUser roleUser = roleUserMapper.toEntity(roleUserDTO);
        roleUser = roleUserRepository.save(roleUser);
        return roleUserMapper.toDto(roleUser);
    }

    @Override
    public RoleUserDTO update(RoleUserDTO roleUserDTO) {
        log.debug("Request to update role user: {}", roleUserDTO);
        return findOne(roleUserDTO.getId()).map(existingRoleUser -> {
            existingRoleUser.setRole(roleUserDTO.getRole());
            return save(existingRoleUser);
        }).orElseThrow(() -> new IllegalArgumentException());
    }

    @Override
    public Optional<RoleUserDTO> findOne(Long id) {
        log.debug("Request to get role user: {}", id);
        return roleUserRepository.findById(id).map(roleUser -> {
            return roleUserMapper.toDto(roleUser);
        });
    }

    @Override
    public List<RoleUserDTO> findAll() {
        log.debug("Request to get all role users");
        return roleUserRepository.findAll().stream().map(roleUser -> {
            return roleUserMapper.toDto(roleUser);
        }).toList();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete role user: {}", id);
        roleUserRepository.deleteById(id);
    }
}
