package ci.digitalacademy.monetabatoswebspring.services.mapper;

import ci.digitalacademy.monetabatoswebspring.models.RoleUser;
import ci.digitalacademy.monetabatoswebspring.services.dto.RoleUserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface RoleUserMapper extends EntityMapper<RoleUserDTO, RoleUser> {
}