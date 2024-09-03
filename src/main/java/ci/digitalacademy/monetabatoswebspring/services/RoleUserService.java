package ci.digitalacademy.monetabatoswebspring.services;

import ci.digitalacademy.monetabatoswebspring.services.dto.RoleUserDTO;

import java.util.List;
import java.util.Optional;

public interface RoleUserService {

    RoleUserDTO save(RoleUserDTO roleUserDTO);

    RoleUserDTO update(RoleUserDTO roleUserDTO);

    Optional<RoleUserDTO> findOne(Long id);

    List<RoleUserDTO> findAll();

    void delete(Long id);
}
