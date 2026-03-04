package sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Service.EcoleService;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.DTO.EcoleDTO;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/api/ecoles")
public class EcoleController {

    private EcoleService ecoleService;
    public EcoleController(EcoleService ecoleService) {
        this.ecoleService = ecoleService;
    }

    @GetMapping
    public List<EcoleDTO> getAll() {
        return ecoleService.getAllEcoleDTO();
    }

    @GetMapping("/{adresse}")
    public ResponseEntity<?> trouverUneEcoleParAdresse(@PathVariable String adresse) {
        Optional<EcoleDTO> opEcole = ecoleService.findEcoleByAdresse(adresse);
        if (opEcole.isPresent()) {
            return ResponseEntity.ok(opEcole.get());
        }else {
            return ResponseEntity.status(404).body("Aucune école trouvée avec par son adresse " + adresse);
        }
    }
}
