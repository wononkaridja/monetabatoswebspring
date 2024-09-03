package ci.digitalacademy.monetabatoswebspring.services;

import ci.digitalacademy.monetabatoswebspring.services.dto.TeacherDTO;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    TeacherDTO save(TeacherDTO teacherDTO);

    TeacherDTO update(TeacherDTO teacherDTO);

    Optional<TeacherDTO> findOne(Long id);

    List<TeacherDTO> findAll();

    void delete(Long id);
}
