package sn.edu.isepdiamniadio.dbe.TpSpring_boot.Entite;

import jakarta.persistence.*;

@Entity
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProfesseur;
    @Column(name = "nom", nullable = false)
    private String nom;
    private String prenom;
    private String adresse;
    private String age;
    private String matiere;

    public Integer getIdProfesseur() {
        return idProfesseur;
    }

    public void setIdProfesseur(Integer idProfesseur) {
        this.idProfesseur = idProfesseur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
}
