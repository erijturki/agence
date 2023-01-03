package Agence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import User.Entreprise;
import User.Particulier;
import Voyage.Jour;
import Voyage.Voyage_org;
import Voyage.Voyage_per;
import commande.Commande_org;
import commande.Commande_par;

public class Agence {

	private ArrayList<Particulier>LParticulier;
	private ArrayList<Entreprise>LEntreprise;
	private ArrayList<Voyage_org>LVoyageo;
	private ArrayList<Voyage_per>LVoyagep;
	private ArrayList<Commande_org>LCommandeo;
	private ArrayList<Commande_par>LCommandep;

	public Agence() {
		super();
		LParticulier= new ArrayList<Particulier>();
		LEntreprise= new ArrayList<Entreprise>();
 		LVoyageo= new ArrayList<Voyage_org>();
 		LVoyagep= new ArrayList<Voyage_per>();
 		LCommandeo=new ArrayList<Commande_org>();
 		LCommandep=new ArrayList<Commande_par>();
	}

	public Particulier Recherche_particulier(long Cin) {
		for(int i=0;i<LParticulier.size();i++)
			if(LParticulier.get(i).getCin()==(Cin)) {
				return LParticulier.get(i);
			}
		return null;
		}
	
	public Entreprise Recherche_entreprise(String matricule) {
		for(int i=0;i<LEntreprise.size();i++)
			if(LEntreprise.get(i).getMatricule().equals(matricule)) {
				return LEntreprise.get(i);
			}
		return null;
		}

	public void ajouter_particulier() {
		Scanner sc = new Scanner (System.in);
		long code=1;
		System.out.print(" Entrer cin ");
		long cin=sc.nextLong();
		if(Recherche_particulier(cin)==null) {
			System.out.print(" Entrer le nom ");
			String nom = sc.next();
			System.out.print(" Entrer l'email ");
			String email = sc.next();
			System.out.print(" Entrer l'adresse ");
			String adresse = sc.next();
			System.out.print(" Entrer le num ");
			long tel = sc.nextLong();
			LParticulier.add(new Particulier(code,nom,email,adresse,tel,cin));
			code++;
			System.out.println(" Ajout avec sucèes");
		}
		else {
			System.out.println(" Echec d'ajout le particulier existe déja !");
			}
		}
	public void ajouter_entreprise() {
	Scanner sc = new Scanner (System.in);
	long code=1000;
	System.out.print(" Entrer matricule ");
	String mat=sc.next();
	if(Recherche_entreprise(mat)==null) {
		System.out.print(" Entrer le nom ");
		String nom = sc.next();
		System.out.print(" Entrer l'email ");
		String email = sc.next();
		System.out.print(" Entrer l'adresse ");
		String adresse = sc.next();
		System.out.print(" Entrer le num ");
		long tel = sc.nextLong();
		System.out.print(" Entrer le registre fiscale ");
		String registre=sc.next();
		LEntreprise.add(new Entreprise(code,nom,email,adresse,tel,mat,registre));
		code++;
		System.out.println(" Ajout avec sucèes");
	}
	else {
		System.out.println(" Echec d'ajout l'entreprise existe déja !");
		}

	}
	
	public void afficher_particulier(Particulier p) {
		System.out.println(" Code : "+p.getCode());
		System.out.println(" CIN : "+p.getCin()+"        Nom : " +p.getNom());
		System.out.println(" Email : "+p.getEmail()+"        Tel : "+p.getTel());
		System.out.println(" Adresse : "+p.getAdresse());
	}
	
	public void afficher_particuliers() {
		for(int i=0;i<LParticulier.size();i++) {
			System.out.println(" Code : "+LParticulier.get(i).getCode());
			System.out.println(" CIN : "+LParticulier.get(i).getCin()+"        Nom : " +LParticulier.get(i).getNom());
			System.out.println(" Email : "+LParticulier.get(i).getEmail()+"        Tel : "+LParticulier.get(i).getTel());
			System.out.println(" Adresse : "+LParticulier.get(i).getAdresse());
		}
	}
	public void afficher_entreprise(Entreprise e) {
		System.out.println(" Code : "+e.getCode());
		System.out.println(" Matricule : "+e.getMatricule()+"        Registre fiscale : "+e.getRegistre());
		System.out.println(" Nom : " +e.getNom()+"        Adresse : "+e.getAdresse());
		System.out.println(" Email : "+e.getEmail()+"        Tel : "+e.getTel());
	}
	public void afficher_entreprises() {
		for(int i=0;i<LEntreprise.size();i++) {
			System.out.println(" Code : "+LEntreprise.get(i).getCode());
			System.out.println(" Matricule : "+LEntreprise.get(i).getMatricule()+"        Registre fiscale : "+LEntreprise.get(i).getRegistre());
			System.out.println(" Nom : " +LEntreprise.get(i).getNom()+"        Adresse : "+LEntreprise.get(i).getAdresse());
			System.out.println(" Email : "+LEntreprise.get(i).getEmail()+"        Tel : "+LEntreprise.get(i).getTel());
		}
	}
	
	public void afficher_clients_voyagesorg() {
		Voyage_org v;
		boolean test=true;
		
		while(test) {
			System.out.println(" Entrer reference du voyage ");
			Scanner sc = new Scanner (System.in);
			long ref=sc.nextLong();
			v=Recherche_voyage_org(ref);
			if( v!=null ) {
            	test =false;
            	System.out.println(" Les Entreprises :");
            	for(int i=0;i<LCommandeo.size();i++) {
        			if(LCommandeo.get(i).getVoyage()==v) {
        				System.out.println(" Code : "+LCommandeo.get(i).getClient().getCode());
        				System.out.println(" Matricule : "+LCommandeo.get(i).getClient().getMatricule()+"        Registre fiscale : "+LCommandeo.get(i).getClient().getRegistre());
        				System.out.println(" Nom : " +LCommandeo.get(i).getClient().getNom()+"        Adresse : "+LCommandeo.get(i).getClient().getAdresse());
        				System.out.println(" Email : "+LCommandeo.get(i).getClient().getEmail()+"        Tel : "+LCommandeo.get(i).getClient().getTel());
        			}
        		}
            	System.out.println(" Les Particuliers :");
            	for(int j=0;j<LCommandep.size();j++) {
            		if(LCommandep.get(j).getVoyage()==v) {
            			System.out.println(" Code : "+LCommandep.get(j).getClient().getCode());
            			System.out.println(" CIN : "+LCommandep.get(j).getClient().getCin()+"        Nom : " +LCommandep.get(j).getClient().getNom());
            			System.out.println(" Email : "+LCommandep.get(j).getClient().getEmail()+"        Tel : "+LCommandep.get(j).getClient().getTel());
            			System.out.println(" Adresse : "+LCommandep.get(j).getClient().getAdresse());
            		}
            	}
			}
		}	
	}
	
	public void afficher_clients_voyagesper() {
		Voyage_per v;
		boolean test=true;
		
		while(test) {
			System.out.print(" Entrer reference du voyage ");
			Scanner sc = new Scanner (System.in);
			long ref=sc.nextLong();
			v=Recherche_voyage_per(ref);
			if( v!=null ) {
            	test =false;
            	System.out.println(" Les Entreprises :");
            	for(int i=0;i<LCommandeo.size();i++) {
        			if(LCommandeo.get(i).getVoyage()==v) {
        				System.out.println(" Code : "+LCommandeo.get(i).getClient().getCode());
        				System.out.println(" Matricule : "+LCommandeo.get(i).getClient().getMatricule()+"        Registre fiscale : "+LCommandeo.get(i).getClient().getRegistre());
        				System.out.println(" Nom : " +LCommandeo.get(i).getClient().getNom()+"        Adresse : "+LCommandeo.get(i).getClient().getAdresse());
        				System.out.println(" Email : "+LCommandeo.get(i).getClient().getEmail()+"        Tel : "+LCommandeo.get(i).getClient().getTel());
        			}
        		}
            	System.out.println(" Les Particuliers :");
            	for(int j=0;j<LCommandep.size();j++) {
            		if(LCommandep.get(j).getVoyage()==v) {
            			System.out.println(" Code : "+LCommandep.get(j).getClient().getCode());
            			System.out.println(" CIN : "+LCommandep.get(j).getClient().getCin()+"        Nom : " +LCommandep.get(j).getClient().getNom());
            			System.out.println(" Email : "+LCommandep.get(j).getClient().getEmail()+"        Tel : "+LCommandep.get(j).getClient().getTel());
            			System.out.println(" Adresse : "+LCommandep.get(j).getClient().getAdresse());
            		}
            	}
			}
		}	
	}
	
	public void historique_particulier() {
		Particulier cl;
		boolean test=true;
		
		while(test) {
			Scanner sc = new Scanner (System.in);
			System.out.print(" Entrer CIN du client");
			long cin=sc.nextInt();
			cl=Recherche_particulier(cin);
			if( cl!=null ) {
            	test =false;
            	for(int i=0;i<LCommandep.size();i++) {
            		if(LCommandep.get(i).getClient()==cl) {
            			System.out.println(" Voyage N°"+(i+1)+"     Référence : "+LCommandep.get(i).getVoyage().getReference());
            			System.out.println(" Destination : "+LCommandep.get(i).getVoyage().getDestination()+"     A "+LCommandep.get(i).getVoyage().getPrix()+" DT");
            			System.out.println(" Date départ : "+LCommandep.get(i).getVoyage().getDescription());
            			System.out.println(" Date départ : "+LCommandep.get(i).getVoyage().getDate_depart()+"         Date retour : "+LCommandep.get(i).getVoyage().getDate_retour());
            			
            		}
            	}
			}
		}
	}
	
	public void historique_entreprise() {
		Entreprise cl;
		boolean test=true;
		
		while(test) {
			Scanner sc = new Scanner (System.in);
			System.out.print(" Entrer matricule entreprise ");
			String mat=sc.next();
			cl= Recherche_entreprise( mat);
			if( cl!=null ) {
            	test =false;
            	for(int i=0;i<LCommandeo.size();i++) {
            		if(LCommandeo.get(i).getClient()==cl) {
            			System.out.println(" Voyage N°"+(i+1)+"     Référence : "+LCommandeo.get(i).getVoyage().getReference());
            			System.out.println(" Destination : "+LCommandeo.get(i).getVoyage().getDestination()+"     A "+LCommandeo.get(i).getVoyage().getPrix()+" DT");
            			System.out.println(" Date départ : "+LCommandeo.get(i).getVoyage().getDescription());
            			System.out.println(" Date départ : "+LCommandeo.get(i).getVoyage().getDate_depart()+"         Date retour : "+LCommandeo.get(i).getVoyage().getDate_retour());
            			
            		}
            	}
			}
		}
	}

	public Voyage_org Recherche_voyage_org(long ref) {
		for(int i=0;i<LVoyageo.size();i++)
			if(LVoyageo.get(i).getReference()==ref) {
				return LVoyageo.get(i);
			}
		return null;
	}
	
	public Voyage_per Recherche_voyage_per(long ref) {
		for(int i=0;i<LVoyagep.size();i++)
			if(LVoyagep.get(i).getReference()==ref) {
				return LVoyagep.get(i);
			}
		return null;
		}
	
	public void ajouter_voyage_org() {
		Scanner sc = new Scanner (System.in);
		System.out.print(" Entrer la référence du voyage ");
		long reference = sc.nextLong();
		if(Recherche_voyage_org(reference)==null) {
		System.out.print(" Entrer la destination du voyage ");
		String destination = sc.next();
		System.out.print(" Entrer la date du départ sous format YYYY-MM-DD ");
		String date_depart = sc.next();
		System.out.print(" Entrer la date du retour sous format YYYY-MM-DD ");
		String date_retour = sc.next();
		System.out.print(" Entrer la description du voyage ");
		String description = sc.next();
		System.out.print(" Entrer le prix du voyage ");
		float prix = sc.nextFloat();
		System.out.print(" Entrer le nombre des jours du voyage ");
		int nbj = sc.nextInt();
		List<Jour> itineraire = new ArrayList<Jour>();
		for(int i=0;i<nbj;i++) {
			System.out.print(" Entrer la description du jour N°"+(i+1));
			String desc = sc.next();
			Jour j =new Jour((i+1),desc);
			itineraire.add(j);
		}
		System.out.print(" Entrer le nombre des places pour le voyage ");
		int nbp = sc.nextInt();
		System.out.print(" Entrer la date limite pour les inscriptions sous format YYYY-MM-DD ");
		String date_fin = sc.next();
		LVoyageo.add(new Voyage_org(reference,destination,date_depart,date_retour,description,prix,nbj,itineraire,nbp,date_fin));
	}
		else {
			System.out.println(" Echec d'ajout la référence existe déja !!");
			}
	}
	
	public void ajouter_voyage_per() {
		Scanner sc = new Scanner (System.in);
		System.out.print(" Entrer la référence du voyage ");
		long reference = sc.nextLong();
		if(Recherche_voyage_org(reference)==null) {
		System.out.print(" Entrer la destination du voyage ");
		String destination = sc.next();
		System.out.print(" Entrer la date du départ sous format YYYY-MM-DD ");
		String date_depart = sc.next();
		System.out.print(" Entrer la date du retour sous format YYYY-MM-DD ");
		String date_retour = sc.next();
		System.out.print(" Entrer la description du voyage ");
		String description = sc.next();
		System.out.print(" Entrer le prix du voyage ");
		float prix = sc.nextFloat();
		LVoyagep.add(new Voyage_per(reference,destination,date_depart,date_retour,description,prix));
	}
		else {
			System.out.println(" Echec d'ajout la référence existe déja !!");
			}
	} 
	
	public void afficher_voyages_org(){
		for(int i=0;i<LVoyageo.size();i++) {
			System.out.println(" Voyage N°"+(i+1)+"     Référence : "+LVoyageo.get(i).getReference());
			System.out.println(" Destination : "+LVoyageo.get(i).getDestination()+"     A "+LVoyageo.get(i).getPrix()+" DT");
			System.out.println(" Date départ : "+LVoyageo.get(i).getDescription());
			System.out.println(" Date départ : "+LVoyageo.get(i).getDate_depart()+"         Date retour : "+LVoyageo.get(i).getDate_retour());
			System.out.println(" Programme : ");
			for(int j=0;j<LVoyageo.get(i).getNbj();j++) {
				System.out.println(" Jour N°"+(j+1)+" : "+LVoyageo.get(i).getItineraire().get(j).getDescription());
			}
			System.out.println(" Places disponibles : "+LVoyageo.get(i).getNbplaces());
			System.out.println(" Réserver avant "+LVoyageo.get(i).getDate_fin());
		}
	}
	
	public void afficher_voyage_org(Voyage_org v){
		System.out.println(" Référence : "+v.getReference());
		System.out.println(" Destination : "+v.getDestination()+"     A "+v.getPrix()+" DT");
		System.out.println(" Date départ : "+v.getDescription());
		System.out.println(" Date départ : "+v.getDate_depart()+"         Date retour : "+v.getDate_retour());
		System.out.println(" Programme : ");
		for(int j=0;j<v.getNbj();j++) {
			System.out.println(" Jour N°"+(j+1)+" : "+v.getItineraire().get(j).getDescription());
		}
		System.out.println(" Places disponibles : "+v.getNbplaces());
		System.out.println(" Réserver avant "+v.getDate_fin());
	}
	
	public void afficher_voyages_per(){
		for(int i=0;i<LVoyageo.size();i++) {
			System.out.println(" Voyage N°"+(i+1)+"     Référence : "+LVoyagep.get(i).getReference());
			System.out.println(" Destination : "+LVoyagep.get(i).getDestination()+"     A "+LVoyagep.get(i).getPrix()+" DT");
			System.out.println(" Date départ : "+LVoyagep.get(i).getDescription());
			System.out.println(" Date départ : "+LVoyagep.get(i).getDate_depart()+"         Date retour : "+LVoyagep.get(i).getDate_retour());
		}
	}
	
	public void afficher_voyage_per(Voyage_per v){
		System.out.println(" Référence : "+v.getReference());
		System.out.println(" Destination : "+v.getDestination()+"     A "+v.getPrix()+" DT");
		System.out.println(" Date départ : "+v.getDescription());
		System.out.println(" Date départ : "+v.getDate_depart()+"         Date retour : "+v.getDate_retour());
	}
	public void reserver_voyage_vorg_cpar() {
		Scanner sc = new Scanner (System.in);
		Particulier cl; 
		Voyage_org v;
		
		int cpt=1,nbp;
		boolean test=true,test1=true,test2=true;
		
		while(test) {
			System.out.print(" Entrer reference du voyage ");
			long ref=sc.nextLong();
			v=Recherche_voyage_org(ref);
			if( v!=null ) {
            	test =false;
				try {
					
	                SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
	                Date date1 = dateFormat.parse(v.getDate_fin());
	                System.out.println(date1);
	                Date date2 = dateFormat.parse(LocalDate.now().toString());
	             
	                if(date1.after(date2)){
	    				while(test1) {
	    					System.out.print(" Entrer CIN du client ");
	    					long cin=sc.nextInt();
	    					cl= Recherche_particulier(cin);
	    					if( cl!=null ) {
	    						test1 =false;
	    						while(test2) {
		    						do {
		    							System.out.print(" Entrer nombre de personne ");
				    					 nbp=sc.nextInt();
		    						} while(nbp<1);
		    						if (nbp<= v.getNbplaces()) {
		    							test2=false;
	    						LCommandep.add( new Commande_par(cpt,v,LocalDate.now().toString(),cl, nbp));
	    						v.setNbplaces(v.getNbplaces()-1);
	    						System.out.println(" Réservation avec succès ");
	    						
	    						System.out.print(" Nombre des places restant "+v.getNbplaces());
	    					}
		    						else 
		    							System.out.println(" Désolé Places Insuffisants ! Il reste "+v.getNbplaces()+" places");
	    				    }
	    					}	
	    					else 
	    						System.out.println(" Client n'existe pas !");
	    				}  
	                 } 
	                else 
	                	System.out.println(" Date inscription a expiré !! ");
	             } catch (ParseException ex) {
	             }
				
			}
			else 
				System.out.println("Référence n'existe pas");
		}
	}
	
	public void reserver_voyage_vorg_cent() {
		Scanner sc = new Scanner (System.in);
		Entreprise cl; 
		Voyage_org v;
		int cpt=1,nbp;
		boolean test=true,test1=true,test2=true;
		
		while(test) {
			System.out.print(" Entrer reference du voyage ");
			long ref=sc.nextLong();
			v=Recherche_voyage_org(ref);
			if( v!=null ) {
            	test =false;
				try {
					
	                SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
	                Date date1 = dateFormat.parse(v.getDate_fin());
	                System.out.println(date1);
	                Date date2 = dateFormat.parse(LocalDate.now().toString());
	             
	                if(date1.after(date2)){
	    				while(test1) {
	    					System.out.print(" Entrer matricule entreprise ");
	    					String mat=sc.next();
	    					cl= Recherche_entreprise( mat);
	    					if( cl!=null ) {
	    						test1 =false;
	    						while(test2) {
	    						do {
	    							System.out.print(" Entrer nombre de personne ");
			    					 nbp=sc.nextInt();
	    						} while(nbp<1);
	    						if (nbp<= v.getNbplaces()) {
	    							test2=false;
	    							LCommandeo.add( new Commande_org(cpt,v,LocalDate.now().toString(),cl,nbp));
		    						v.setNbplaces(v.getNbplaces()-1);
		    						System.out.println(" Réservation avec succès ");
		    						
		    						System.out.print(" Nombre des places restant "+v.getNbplaces());
	    						}
	    						else 
	    							System.out.println(" Désolé Places Insuffisants ! Il reste "+v.getNbplaces()+" places");
	    						}
	    					}
	    					else 
	    						System.out.println(" Client n'existe pas !");
	    				}  
	                 } 
	                else 
	                	System.out.println(" Date inscription a expiré !! ");
	             } catch (ParseException ex) {
	             }
				
			}
			else 
				System.out.println("Référence n'existe pas");
		}
	}

	public void reserver_voyage_vper_cpar() {
		Scanner sc = new Scanner (System.in);
		Particulier cl; 
		Voyage_per v;
		int cpt=1;
		boolean test=true,test1=true;
		
		while(test) {
			int nbp;
			System.out.print(" Entrer reference du voyage ");
			long ref=sc.nextLong();
			v=Recherche_voyage_per(ref);
			if( v!=null ) {
            	test =false;
				while(test1) {
					System.out.print(" Entrer CIN du client ");
	    			long cin=sc.nextInt();
	    			cl= Recherche_particulier(cin);
	    			if( cl!=null ) {
	    				test1 =false; 
	    				do {
							System.out.print(" Entrer nombre de personne ");
	    					 nbp=sc.nextInt();
						} while(nbp<1);
	    				LCommandep.add( new Commande_par(cpt,v,LocalDate.now().toString(),cl, nbp));
	    				System.out.println(" Réservation avec succès ");
	    			}
	    			else 
	    				System.out.println(" Client n'existe pas !");
	    		}  	
			}
			else 
				System.out.println("Référence n'existe pas");
		}
	}
	
	public void reserver_voyage_vper_cent() {
		Scanner sc = new Scanner (System.in);
		Entreprise cl; 
		Voyage_per v;
		int cpt=1,nbp;
		boolean test=true,test1=true;
		
		while(test) {
			System.out.print(" Entrer reference du voyage ");
			long ref=sc.nextLong();
			v=Recherche_voyage_per(ref);
			if( v!=null ) {
            	test =false;
	    		while(test1) {
	    			System.out.print(" Entrer matricule entreprise ");
	    			String mat=sc.next();
	    			cl= Recherche_entreprise( mat);
	    			if( cl!=null ) {
	    				test1 =false;
	    				do {
	    					System.out.print(" Entrer nombre de personne ");
			    			nbp=sc.nextInt();
	    				} while(nbp<1);
	    				LCommandeo.add( new Commande_org(cpt,v,LocalDate.now().toString(),cl,nbp));
		    			System.out.println(" Réservation avec succès ");	    				
	    			}
	    			else 
	    				System.out.println(" Client n'existe pas !");
	    		}  
			}
			else 
				System.out.println("Référence n'existe pas");
		}
	}
}
