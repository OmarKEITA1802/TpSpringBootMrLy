package sn.edu.isepdiamniadio.dbe.TpSpring_boot.Service;

import org.springframework.stereotype.Service;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Entite.Ecole;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Ripository.EcoleRipository;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.DTO.EcoleDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EcoleService {
    private final EcoleRipository ecoleRipository;

    public EcoleService(EcoleRipository ecoleRipository) {

        this.ecoleRipository = ecoleRipository;
    }

    public List<EcoleDTO> getAllEcoleDTO(){
        List<Ecole> listEcole = ecoleRipository.findAll();
        List<EcoleDTO> dtoList = new ArrayList<>();
        for (Ecole ecole : listEcole) {
            EcoleDTO dto = new EcoleDTO();
            dto.setNom(ecole.getNom());
            dto.setAdresse(ecole.getAdresse());
            dtoList.add(dto);
        }
        return dtoList;
    }

    public Optional<EcoleDTO> findEcoleByAdresse(String adresse) {

        Optional<Ecole> optionalEcole = ecoleRipository.findByAdresse(adresse);

        if (optionalEcole.isPresent()) {
            Ecole ecole = optionalEcole.get();

            // Crée un DTO et renseigne ses valeurs
            EcoleDTO dto = new EcoleDTO();
            dto.setAdresse(adresse);
            dto.setNom(ecole.getNom());
            return Optional.of(dto);
        } else {
            return Optional.empty();
        }
    }
}
