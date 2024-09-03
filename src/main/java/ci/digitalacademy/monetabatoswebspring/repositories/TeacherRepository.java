package ci.digitalacademy.monetabatoswebspring.repositories;

import ci.digitalacademy.monetabatoswebspring.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
