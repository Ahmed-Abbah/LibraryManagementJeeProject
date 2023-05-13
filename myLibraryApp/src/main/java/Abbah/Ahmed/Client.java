package Abbah.Ahmed;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="utilisateur")
public class Client implements ClientInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    private String prenom;

    private String email;

    private String mot_de_passe;

    private String numTel;
    
    public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	public Client(String nom, String prenom, String email, String mot_de_passe, String numTel, boolean membre) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mot_de_passe = mot_de_passe;
		this.numTel = numTel;
		this.membre = membre;
	}
	private boolean membre;
    
    private enum Statut{
        bloque,nonBloque;
    }
    @Enumerated(EnumType.STRING)
    private Statut statut;
    
    private int isAdmin;
    public Client() {
    }

    public Client(String nom) {
        this.nom = nom;
    }

    public Client(int idClient, String nom) {
        this.id = idClient;
        this.nom = nom;
    }

    public Client(String nom, String prenom, String numTel) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public Statut getStatut() {
        return statut;
    }
    

    public void setStatutBloque() {
        this.statut = Statut.bloque;
    }
    
    public void setStatut(Statut statut) {
        this.statut = Statut.nonBloque;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", mot_de_passe="
                + mot_de_passe + ", numTel=" + numTel + ", statut=" + statut + "]";
    }

	public void setMembre(boolean b) {
		this.membre=b;
	}
	public boolean getMembre() {
		return this.membre;
	}

}
