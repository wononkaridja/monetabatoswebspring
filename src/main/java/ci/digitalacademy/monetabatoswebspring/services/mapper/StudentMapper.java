package ci.digitalacademy.monetabatoswebspring.services.mapper;

import ci.digitalacademy.monetabatoswebspring.models.Student;
import ci.digitalacademy.monetabatoswebspring.services.dto.StudentDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper extends EntityMapper<StudentDTO, Student>{
}