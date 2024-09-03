package ci.digitalacademy.monetabatoswebspring.repositories;

import ci.digitalacademy.monetabatoswebspring.models.AppSetting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppSettingRepository extends JpaRepository<AppSetting, Long> {
    List<AppSetting> findBySmtpUsername(String smtpUsername);
}
