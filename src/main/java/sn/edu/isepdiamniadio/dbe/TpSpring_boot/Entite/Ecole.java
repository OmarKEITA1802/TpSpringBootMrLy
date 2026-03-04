package sn.edu.isepdiamniadio.dbe.TpSpring_boot.Entite;

import jakarta.persistence.*;

@Entity
public class Ecole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEcole;
    @Column(name = "nom" , nullable = false)
    private String nom;
    private String adresse;

    public Integer getIdEcole() {
        return idEcole;
    }

    public void setIdEcole(Integer idEcole) {
        this.idEcole = idEcole;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
