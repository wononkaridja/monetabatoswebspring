package ci.digitalacademy.monetabatoswebspring.services.mapper;

import ci.digitalacademy.monetabatoswebspring.models.Absence;
import ci.digitalacademy.monetabatoswebspring.services.dto.AbsenceDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface AbsenceMapper extends EntityMapper<AbsenceDTO, Absence> {
}