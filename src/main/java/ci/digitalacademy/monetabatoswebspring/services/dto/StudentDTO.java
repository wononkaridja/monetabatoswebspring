package ci.digitalacademy.monetabatoswebspring.services.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class StudentDTO extends PersonDTO{

    private String matricule;

    private String phoneNumberFather;


}
