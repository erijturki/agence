package commande;

import User.Particulier;
import Voyage.Voyage;

public class Commande_par extends Commande{
	private Particulier client;
    Voyage v ;
	public Commande_par(int num, Voyage voyage, String date, Particulier client,int nbplaces) {
		super(num, voyage, date, nbplaces);
		this.client = client;
	}

	public Particulier getClient() {
		return client;
	}

	public void setClient(Particulier client) {
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
		
	}
}
