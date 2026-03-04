package sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Service.UtilisateurService;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.DTO.UtilisateurDTO;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping
    public List<UtilisateurDTO> getUtilisateurs() {
        return utilisateurService.getAllUtilisateurs();
    }
}
