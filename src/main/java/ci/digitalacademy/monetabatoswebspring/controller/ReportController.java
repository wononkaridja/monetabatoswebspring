package ci.digitalacademy.monetabatoswebspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reports")
public class ReportController {

    @GetMapping
    public String showRapportPage() {
        return "report/default";
    }
}
