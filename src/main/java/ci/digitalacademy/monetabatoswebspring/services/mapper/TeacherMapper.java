package ci.digitalacademy.monetabatoswebspring.services.mapper;

import ci.digitalacademy.monetabatoswebspring.models.Teacher;
import ci.digitalacademy.monetabatoswebspring.services.dto.TeacherDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface TeacherMapper extends EntityMapper<TeacherDTO, Teacher> {
}