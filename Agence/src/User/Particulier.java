package User;

public class Particulier extends Client {
	
	private long cin;
	
	public Particulier(long code, String nom, String email, String adresse, long tel,long cin) {
		super(code, nom, email, adresse, tel);
		this.cin=cin;
	}

	public long getCin() {
		return cin;
	}

	public void setCin(long cin) {
		this.cin = cin;
	}

}
