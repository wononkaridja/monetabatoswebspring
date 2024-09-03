package ci.digitalacademy.monetabatoswebspring.services.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {

    private Long id;

    private String street;

    private String city;

    private String country;
}
