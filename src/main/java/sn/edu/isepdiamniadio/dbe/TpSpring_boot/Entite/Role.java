package sn.edu.isepdiamniadio.dbe.TpSpring_boot.Entite;

import jakarta.persistence.*;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.DTO.ProfesseurDTO;

import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nom", nullable = false)
    private String nomRole;
    @ManyToMany(mappedBy = "roles")
    private List<Utilisateur> utilisateurs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public String getNomRole() {
        return nomRole;
    }

    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }
}
