package ci.digitalacademy.monetabatoswebspring.services.mapper;

import ci.digitalacademy.monetabatoswebspring.models.AppSetting;

import ci.digitalacademy.monetabatoswebspring.services.dto.AppSettingDTO;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring" )
public interface AppSettingMapper extends EntityMapper<AppSettingDTO, AppSetting> {

}