package sn.edu.isepdiamniadio.dbe.TpSpring_boot.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Entite.Professeur;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Ripository.ProfesseurRipository;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.DTO.ProfesseurDTO;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfesseurService {
    private  ProfesseurRipository professeurRipository;

    public ProfesseurService(ProfesseurRipository professeurRipository){
        this.professeurRipository = professeurRipository;
    }

    public List<ProfesseurDTO> getProfesseurs() {
        List<Professeur> listProfesseur = professeurRipository.findAll();
        List<ProfesseurDTO> listProfesseurDTO = new ArrayList<>();
        for (Professeur professeur : listProfesseur) {
            ProfesseurDTO dto = new ProfesseurDTO();
            dto.setNom(professeur.getNom());
            dto.setPrenom(professeur.getPrenom());
            dto.setAdresse(professeur.getAdresse());
            dto.setAge(professeur.getAge());
            dto.setMatiere(professeur.getMatiere());
            listProfesseurDTO.add(dto);
        }
        return listProfesseurDTO;
    }

    public Page<Professeur> getPageProfesseurs(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("nom").ascending());
        return professeurRipository.findAll(pageable);
    }
}
