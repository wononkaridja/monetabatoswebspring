package ci.digitalacademy.monetabatoswebspring.services.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class AbsenceDTO {

    private Long id;

    private Instant absenceDate;

    private Integer absenceNumber;
}
