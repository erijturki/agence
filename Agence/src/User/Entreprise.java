package User;

public class Entreprise extends Client {

	private String matricule;
	private String registre;
	
	public Entreprise(long code, String nom, String email, String adresse, long tel,String matricule,String registre) {
		super(code, nom, email, adresse, tel);
		this.matricule=matricule;
		this.registre=registre;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getRegistre() {
		return registre;
	}

	public void setRegistre(String registre) {
		this.registre = registre;
	}
}
