package nintendo.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<Jeu> listeAchats;
	
	
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.listeAchats = new ArrayList<>();
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
	public List<Jeu> getListeAchats() {
		return listeAchats;
	}
	
	public void ajouterAchat(Jeu jeu) {
        listeAchats.add(jeu);
    }

    public void afficherAchats() {
        System.out.println("Liste d'achats de " + nom + " :");
        for (Jeu jeu : listeAchats) {
            System.out.println("- " + jeu);
        }
    }
	
	public void setListeAchats(List<Jeu> listeAchats) {
		this.listeAchats = listeAchats;
	}
	
	
}
