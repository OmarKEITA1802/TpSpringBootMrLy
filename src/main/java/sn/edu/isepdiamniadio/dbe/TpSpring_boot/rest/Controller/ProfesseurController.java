package sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.Controller;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Entite.Professeur;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Service.ProfesseurService;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.DTO.ProfesseurDTO;

import java.util.Collections;
import java.util.List;

@Controller
@RestController
@RequestMapping("/api/professeurs")
public class ProfesseurController {

    private ProfesseurService professeurService;
    public ProfesseurController(ProfesseurService professeurService) {
        this.professeurService = professeurService;
    }
    @GetMapping
    public List<ProfesseurDTO> getProfesseurs() {
        return professeurService.getProfesseurs();
    }

    @GetMapping("/page")
    public Page<Professeur> listProfesseurs(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {
        return professeurService.getPageProfesseurs(page, size);
    }
}
