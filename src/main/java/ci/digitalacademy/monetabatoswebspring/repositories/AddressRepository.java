package ci.digitalacademy.monetabatoswebspring.repositories;

import ci.digitalacademy.monetabatoswebspring.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
