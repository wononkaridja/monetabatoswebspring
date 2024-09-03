package ci.digitalacademy.monetabatoswebspring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student extends Person {

    @Column(unique=true, nullable=false)
    private String matricule;

    @Column(name = "phonr_number_father", nullable = false)
    private String phoneNumberFather;

    @OneToMany(mappedBy = "student")
    private Set<Absence> absences;
}
