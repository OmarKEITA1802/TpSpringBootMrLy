package sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.DTO;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Entite.Utilisateur;

import java.util.List;

public class RoleDTO {

    private String nom;
    private List<Utilisateur> utilisateurs;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
}
