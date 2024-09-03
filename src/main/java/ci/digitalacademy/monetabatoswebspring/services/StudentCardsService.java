package ci.digitalacademy.monetabatoswebspring.services;

import ci.digitalacademy.monetabatoswebspring.services.dto.StudentCardsDTO;

import java.util.List;
import java.util.Optional;

public interface StudentCardsService {

    StudentCardsDTO save(StudentCardsDTO studentCardsDTO);

    StudentCardsDTO update(StudentCardsDTO studentCardsDTO);

    Optional<StudentCardsDTO> findOne(Long id);

    List<StudentCardsDTO> findAll();

    void delete(Long id);
}
