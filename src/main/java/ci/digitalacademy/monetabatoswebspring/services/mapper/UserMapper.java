package ci.digitalacademy.monetabatoswebspring.services.mapper;

import ci.digitalacademy.monetabatoswebspring.models.User;
import ci.digitalacademy.monetabatoswebspring.services.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface UserMapper extends EntityMapper<UserDTO, User> {
}