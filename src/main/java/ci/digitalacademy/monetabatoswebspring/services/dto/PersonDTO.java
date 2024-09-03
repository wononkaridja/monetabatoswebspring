package ci.digitalacademy.monetabatoswebspring.services.dto;

import ci.digitalacademy.monetabatoswebspring.models.enumeration.Gender;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class PersonDTO {

    private Long id;

    private Instant birthday;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String urlPicture;

    private Gender gender;
}
