package ci.digitalacademy.monetabatoswebspring.services.mapper;

import ci.digitalacademy.monetabatoswebspring.models.School;
import ci.digitalacademy.monetabatoswebspring.services.dto.SchoolDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface SchoolMapper extends EntityMapper<SchoolDTO, School> {
}