package ci.digitalacademy.monetabatoswebspring.services;

import ci.digitalacademy.monetabatoswebspring.services.dto.AbsenceDTO;

import java.util.List;
import java.util.Optional;

public interface AbsenceService {

    AbsenceDTO save(AbsenceDTO absenceDTO);

    AbsenceDTO update(AbsenceDTO absenceDTO);

    Optional<AbsenceDTO> findOne(Long id);

    List<AbsenceDTO> findAll();

    void delete(Long id);
}
