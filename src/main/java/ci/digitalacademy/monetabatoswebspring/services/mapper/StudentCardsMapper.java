package ci.digitalacademy.monetabatoswebspring.services.mapper;

import ci.digitalacademy.monetabatoswebspring.models.StudentCards;
import ci.digitalacademy.monetabatoswebspring.services.dto.StudentCardsDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface StudentCardsMapper extends EntityMapper<StudentCardsDTO, StudentCards> {
}