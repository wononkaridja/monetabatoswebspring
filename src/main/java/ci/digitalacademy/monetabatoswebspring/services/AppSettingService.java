package ci.digitalacademy.monetabatoswebspring.services;

import ci.digitalacademy.monetabatoswebspring.services.dto.AppSettingDTO;

import java.util.List;
import java.util.Optional;

public interface AppSettingService {

    AppSettingDTO save(AppSettingDTO appSettingDTO);

    AppSettingDTO update(AppSettingDTO appSettingDTO);

    Optional<AppSettingDTO> findOne(Long id);

    List<AppSettingDTO> findAll();

    void delete(Long id);

    List<AppSettingDTO> findAllBySmtpUsername(String smtpUsername);
}
