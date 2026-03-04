package sn.edu.isepdiamniadio.dbe.TpSpring_boot.Ripository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Entite.Ecole;

import java.util.Optional;

public interface EcoleRipository extends JpaRepository<Ecole , Integer> {
    Optional<Ecole> findByAdresse(String adresse);
}
