package Voyage;

import java.util.ArrayList;
import java.util.List;

public class Voyage_org extends Voyage{
	private int nbj;
	private List<Jour> itineraire = new ArrayList<Jour>();
	private int nbplaces;
	private String date_fin;
	
	
	public Voyage_org(long reference, String destination, String date_depart, String date_retour, String description,
			float prix,int nbj,List<Jour> itineraire,int nbplaces,String date_fin) {
		super( reference,  destination,  date_depart,  date_retour,  description,prix);
		this.nbj=nbj;
		this.itineraire = itineraire;
		this.nbplaces=nbplaces;
		this.date_fin=date_fin;
		
	}


	public int getNbj() {
		return nbj;
	}


	public void setNbj(int nbj) {
		this.nbj = nbj;
	}


	public List<Jour> getItineraire() {
		return itineraire;
	}


	public void setItineraire(List<Jour> itineraire) {
		this.itineraire = itineraire;
	}


	public int getNbplaces() {
		return nbplaces;
	}


	public void setNbplaces(int nbplaces) {
		this.nbplaces = nbplaces;
	}


	public String getDate_fin() {
		return date_fin;
	}


	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}


}
