package ci.digitalacademy.monetabatoswebspring.repositories;

import ci.digitalacademy.monetabatoswebspring.models.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
