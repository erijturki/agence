package commande;

import User.Entreprise;
import Voyage.Voyage;

public class Commande_org extends Commande{
	
	private Entreprise client;
	Voyage v;
	
	public Commande_org(int num, Voyage voyage, String date, Entreprise client, int nbplaces) {
		super(num, voyage, date, nbplaces);
		this.client = client;
	}

	public Entreprise getClient() {
		return client;
	}

	public void setClient(Entreprise client) {
		this.client = client;
	}

	@Override
	public float montant() {
		// TODO Auto-generated method stub
		
		return  getNbplaces()*v.getPrix();
	}

	@Override
	public void afficher_montant() {
		// TODO Auto-generated method stub
	System.out.println("Le prix total est" + montant())	;
	}
	
}
