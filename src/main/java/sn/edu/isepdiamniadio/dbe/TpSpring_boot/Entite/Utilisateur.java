package sn.edu.isepdiamniadio.dbe.TpSpring_boot.Entite;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUtilisateur;

    @Column(name = "nom", nullable = false)
    private String login;

    private String password;

    @OneToOne
    @JoinColumn(name = "idProfesseur")
    private Professeur professeur;

    @ManyToMany
    @JoinTable(
            name = "utilisateur_roles",
            joinColumns = @JoinColumn(name = "idUtilisateur"),
            inverseJoinColumns = @JoinColumn(name = "idRole")
    )
    private Set<Role> roles = new HashSet<>();

    // ------------------- Getters & Setters -------------------

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    // ------------------- Méthodes utilitaires -------------------
    public void addRole(Role role) {
        this.roles.add(role);
    }

    public void removeRole(Role role) {
        this.roles.remove(role);
    }
}