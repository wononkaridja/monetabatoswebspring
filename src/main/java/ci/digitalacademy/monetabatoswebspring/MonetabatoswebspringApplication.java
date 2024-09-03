package ci.digitalacademy.monetabatoswebspring;

import ci.digitalacademy.monetabatoswebspring.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MonetabatoswebspringApplication implements CommandLineRunner {



    public static void main(String[] args) {
        SpringApplication.run(MonetabatoswebspringApplication.class, args);
    }

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private UserService userService;

    @Autowired
    private RoleUserService roleUserService;

    @Autowired
    private AbsenceService absenceService;
    @Override
    public void run(String... args) throws Exception {

    }
}
