package Voyage;

public class Voyage {
	 protected long reference;
	 protected String destination;
	 protected String date_depart;
	 protected String date_retour;
	 protected String description;
	 protected float prix; 
	 
	public Voyage(long reference, String destination, String date_depart, String date_retour, String description,
			float prix) {
		this.reference = reference;
		this.destination = destination;
		this.date_depart = date_depart;
		this.date_retour = date_retour;
		this.description = description;
		this.prix = prix;
	}
	public long getReference() {
		return reference;
	}
	public void setReference(long reference) {
		this.reference = reference;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate_depart() {
		return date_depart;
	}
	public void setDate_depart(String date_depart) {
		this.date_depart = date_depart;
	}
	public String getDate_retour() {
		return date_retour;
	}
	public void setDate_retour(String date_retour) {
		this.date_retour = date_retour;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	 
	 
}
