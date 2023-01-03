package commande;

import Voyage.Voyage;

public abstract class Commande {
	private int num;
	private Voyage voyage;
	private String date;
	private int nbplaces;
	
	public Commande(int num, Voyage voyage,String date, int nbplaces) {
		super();
		this.num = num;
		this.voyage = voyage;
		this.date=date;
		this.nbplaces=nbplaces;
	}

	public abstract float montant() ;
	public abstract void afficher_montant();
	
	public Commande() {
		super();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Voyage getVoyage() {
		return voyage;
	}

	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNbplaces() {
		return nbplaces;
	}

	public void setNbplaces(int nbplaces) {
		this.nbplaces = nbplaces;
	}
	
}
