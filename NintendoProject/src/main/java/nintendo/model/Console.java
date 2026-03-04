package nintendo.model;

public abstract class Console {

	private String nom;
	private int prix;
	private LocalDate release;

	public Console(String nom, int prix, LocalDate release) {
		this.nom = nom;
		this.prix = prix;
		this.release = release;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public LocalDate getRelease() {
		return release;
	}

	public void setRelease(LocalDate release) {
		this.release = release;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}
	
	
}
