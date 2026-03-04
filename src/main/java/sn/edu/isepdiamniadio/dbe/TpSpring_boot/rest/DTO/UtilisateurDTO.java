package sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.DTO;

import jakarta.persistence.Column;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Entite.Professeur;

public class UtilisateurDTO {

    private String login;
    private String password;
    private Professeur professeur;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
}
