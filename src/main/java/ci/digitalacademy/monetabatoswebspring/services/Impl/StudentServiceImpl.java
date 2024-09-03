package ci.digitalacademy.monetabatoswebspring.services.Impl;

import ci.digitalacademy.monetabatoswebspring.models.Student;
import ci.digitalacademy.monetabatoswebspring.repositories.StudentRepository;
import ci.digitalacademy.monetabatoswebspring.services.StudentService;
import ci.digitalacademy.monetabatoswebspring.services.dto.StudentDTO;
import ci.digitalacademy.monetabatoswebspring.services.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public StudentDTO save(StudentDTO studentDTO) {
        log.debug("Request to save Student : {}", studentDTO);
        Student student = studentMapper.toEntity(studentDTO);
        student = studentRepository.save(student);
        return studentMapper.toDto(student);
    }

    @Override
    public StudentDTO update(StudentDTO studentDTO) {
        log.debug("Request to update Student : {}", studentDTO);
        return findOne(studentDTO.getId()).map(existingStudent -> {
            existingStudent.setLastName(studentDTO.getLastName());
            existingStudent.setFirstName(studentDTO.getFirstName());
            existingStudent.setMatricule(studentDTO.getMatricule());
            existingStudent.setPhoneNumberFather(studentDTO.getPhoneNumberFather());
            existingStudent.setBirthday(studentDTO.getBirthday());
            existingStudent.setGender(studentDTO.getGender());
            existingStudent.setPhoneNumber(studentDTO.getPhoneNumber());
            return save(existingStudent);
        }).orElseThrow(() -> new IllegalArgumentException());
    }

    @Override
    public List<StudentDTO> findAll() {
        log.debug("Request to get all Students");
        return studentRepository.findAll().stream().map(student -> {
            return studentMapper.toDto(student);
        }).toList();
    }

    @Override
    public Optional<StudentDTO> findOne(Long id) {
        log.debug("Request to get Student : {}", id);
        return studentRepository.findById(id).map(student -> {
            return studentMapper.toDto(student);
        });
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Student : {}", id);
        studentRepository.deleteById(id);
    }
}
