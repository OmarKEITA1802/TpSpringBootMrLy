package sn.edu.isepdiamniadio.dbe.TpSpring_boot.Service;

import org.springframework.stereotype.Service;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Entite.Utilisateur;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Ripository.UtilisateurRipository;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.DTO.UtilisateurDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class UtilisateurService {
    private final UtilisateurRipository utilisateurRipository;

    public UtilisateurService(UtilisateurRipository utilisateurRipository) {
        this.utilisateurRipository = utilisateurRipository;
    }

    public UtilisateurRipository getUtilisateurRipository() {
        return utilisateurRipository;
    }

    public List<UtilisateurDTO> getAllUtilisateurs() {
        List<Utilisateur> utilisateurDTO = utilisateurRipository.findAll();
        List<UtilisateurDTO> dtoList = new ArrayList<>();
        for (Utilisateur utilisateur : utilisateurDTO) {
            UtilisateurDTO dto = new UtilisateurDTO();
            dto.setLogin(utilisateur.getLogin());
            dto.setPassword(utilisateur.getPassword());
            dto.setProfesseur(utilisateur.getProfesseur());
            dtoList.add(dto);
        }
        return dtoList;
    }
}
