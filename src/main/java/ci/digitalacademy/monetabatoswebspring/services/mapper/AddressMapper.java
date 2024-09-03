package ci.digitalacademy.monetabatoswebspring.services.mapper;

import ci.digitalacademy.monetabatoswebspring.models.Address;
import ci.digitalacademy.monetabatoswebspring.services.dto.AddressDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface AddressMapper extends EntityMapper<AddressDTO, Address> {
}