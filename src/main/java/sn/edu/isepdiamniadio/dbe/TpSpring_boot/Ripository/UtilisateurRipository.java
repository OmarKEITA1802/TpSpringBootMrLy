package sn.edu.isepdiamniadio.dbe.TpSpring_boot.Ripository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Entite.Utilisateur;

public interface UtilisateurRipository extends JpaRepository<Utilisateur, Integer> {
}
