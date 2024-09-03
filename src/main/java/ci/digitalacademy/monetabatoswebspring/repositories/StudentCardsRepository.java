package ci.digitalacademy.monetabatoswebspring.repositories;

import ci.digitalacademy.monetabatoswebspring.models.StudentCards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCardsRepository extends JpaRepository<StudentCards, Long> {
}
