package ci.digitalacademy.monetabatoswebspring.services;


import ci.digitalacademy.monetabatoswebspring.services.dto.AddressDTO;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    AddressDTO save(AddressDTO addressDTO);
    Optional<AddressDTO> findOne(Long id);
    AddressDTO update(AddressDTO addressDTO);
    List<AddressDTO> findAll();
    void delete(Long id);
}

