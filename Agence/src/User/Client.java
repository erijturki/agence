package User;

public class Client {
	private long code;
	private String nom;
	private String email;
	private String adresse;
	private long tel;

public Client(long code, String nom, String email, String adresse, long tel) {
		super();
		this.code = code;
		this.nom = nom;
		this.email = email;
		this.adresse = adresse;
		this.tel = tel;
	}

public long getCode() {
	return code;
}

public void setCode(long code) {
	this.code = code;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public long getTel() {
	return tel;
}

public void setTel(long tel) {
	this.tel = tel;
}

 
}
