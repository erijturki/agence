package Agence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import User.Client;
import User.Entreprise;
import User.Particulier;
import Voyage.Voyage_org;
import Voyage.Voyage_per;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int choix,ch,choix1,choix2,choix3,choix4;
				Agence ag = new Agence();
				do{  
			        System.out.println(" | 1 | Gérer Clients ");
			        System.out.println(" | 2 | Gérer Packs Voyage");
			        System.out.println(" | 3 | Gérer Réservations ");
			        System.out.println(" | 4 | Gérer Achats ");
			        System.out.println(" | 5 | Quitter");
			        do {
			        	System.out.print(" Veuillez saisir votre choix : ");
			        	choix=sc.nextInt();
			        }while(choix<1 || choix >5);
			        
			         if (choix==1) {
			        	 System.out.println(" | 1 | Ajouter Particulier ");
			        	 System.out.println(" | 2 | Ajouter Entreprise ");
			 	         System.out.println(" | 3 | Chercher Particulier");
			 	         System.out.println(" | 4 | Chercher Entreprise");
			 	         System.out.println(" | 5 | Afficher Liste Clients");
			 	        do {
				        	System.out.print(" Veuillez saisir votre choix : ");
				        	choix1=sc.nextInt();
				        }while(choix1<1 || choix1 >5);
			 	        
			 	       if (choix1==1) {
			 	    	   ag.ajouter_particulier();
			 	       }
			 	      if (choix1==2) {
			 	    	  ag.ajouter_entreprise();
				 	  }
			 	      if (choix1==3) {
			 	    	 System.out.print(" Veuillez saisir un CIN ");
			 	    	 int cin = sc.nextInt();
			 	    	 Particulier cl=ag.Recherche_particulier(cin);
			 	    	 if(cl!=null)
			 	    		ag.afficher_particulier(cl);
			 	    	 else
			 	    		System.out.println("Client introuvable");
			 	       }
			 	     if (choix1==4) {
			 	    	 System.out.print("Veuillez saisir une matricule");
			 	    	 String mat=sc.next();
						 Entreprise cl= ag.Recherche_entreprise( mat);
						 if(cl!=null)
				 	    		ag.afficher_entreprise(cl);
				 	    	 else
				 	    		System.out.println("Client introuvable");
			 	       }
			 	     if (choix1==5) {
			 	    	System.out.println("LISTE PARTICULIERS :");
			 	    	ag.afficher_particuliers();
			 	    	System.out.println("LISTE ENTREPRISES :");
			 	    	ag.afficher_entreprises();
			 	       }
			         }
			         
			         else if (choix==2) {
			        	 System.out.println(" | 1 | Ajouter Voyage Organisé ");
			        	 System.out.println(" | 2 | Ajouter Voyage Personalisé");
			        	 System.out.println(" | 3 | Chercher Voyage Organisé ");
			        	 System.out.println(" | 4 | Chercher Voyage Personalisé");
			 	         System.out.println(" | 5 | Afficher Liste Voyages  ");
			 	         System.out.println(" | 6 | Afficher Liste Clients par Voyage organisé  ");
			 	         System.out.println(" | 7 | Afficher Liste Clients par Voyage personalisé  ");
			 	        do {
				        	System.out.print(" Veuillez saisir votre choix : ");
				        	choix2=sc.nextInt();
				        }while(choix2<1 || choix2 >7);
			 	        
			 	       if (choix2==1) {
			 	    	   ag.ajouter_voyage_org();
			 	       }
			 	       else if (choix2==2) {
			 	    	   ag.ajouter_voyage_per();
			 	       }
			 	       else if (choix2==3) {
			 	    	 System.out.println(" Entrer reference du voyage");
			 	    	 long ref=sc.nextLong();
			 	    	 Voyage_org v=ag.Recherche_voyage_org(ref);
			 	    	 if(v!=null)
			 	    		ag.afficher_voyage_org(v);
			 	    	 else
			 	    		System.out.println(" Voyage introuvable!");
			 	       
			 	      }
			 	       else if (choix2==4) {
			 	    	 System.out.println(" Entrer reference du voyage");
				 			long ref=sc.nextLong();
				 			Voyage_per v=ag.Recherche_voyage_per(ref);
				 			if(v!=null)
				 	    		ag.afficher_voyage_per(v);
				 	    	 else
				 	    		System.out.println(" Voyage introuvable!");
			 	       }
			 	       else if (choix2==5) {
			 	    	System.out.println("LISTE VOYAGES ORGANISES :");
			 	    	ag.afficher_voyages_org();
			 	    	System.out.println("LISTE VOYAGES PERSONALISES :");
			 	    	ag.afficher_voyages_per();
			 	       }
			        	
			 	       else if (choix2==6) {
			 	    	ag.afficher_clients_voyagesorg();
			 	    }
			 	   if (choix2==7) {
			 	    	ag.afficher_clients_voyagesper();
			 	    }
			         }
			         
			         else if (choix==3) {
			        	 System.out.println(" | 1 | Réserver un pack organisé en tant que un particulier");
			        	 System.out.println(" | 2 | Réserver un pack organisé en tant que une entreprise");
			        	 System.out.println(" | 3 | Réserver un pack personalisé en tant que un particulier");
			        	 System.out.println(" | 4 | Réserver un pack personalisé en tant que une entreprise");
			    
			        	 do{
			        		 System.out.print(" Veuillez saisir votre choix : ");
			        	      choix3=sc.nextInt(); 
			        	      }while(choix3<1 || choix3 >4);
			        	 if (choix3==1) {
			        		ag.reserver_voyage_vorg_cpar(); 
			        	 }
			        	 if (choix3==2) {
			        		 ag.reserver_voyage_vorg_cent();
			        	 }
			        	 if (choix3==3) {
			        		 ag.reserver_voyage_vper_cpar();
			        	 }
			        	 if(choix3==4) {
			        		 ag.reserver_voyage_vper_cent();
			        	 
			         }
			         }
			         else if (choix==4) { 
			        	 System.out.println(" | 1 | Liste achats particuliers");
			        	 System.out.println(" | 2 | Liste achats entreprises");
			        	 do{
			        		 System.out.print(" Veuillez saisir votre choix : ");
			        	      choix4=sc.nextInt(); 
			        	      }while(choix4<1 || choix4 >2);
			        	 if (choix4==1) {
			        		ag.historique_particulier();
			        	 }
			        	 else if (choix4==2) {
			        		 ag.historique_entreprise();
			        	 }
			         }
			        
			         else if (choix==5) { 
			        	 
			         }
			        
			        do {
			        	System.out.println(" Voulez vous retourner au menu principale ?");
			        	System.out.println(" Veuillez tapez 1 si Oui , 2 si Non  ");
			        	ch=sc.nextInt();
			        }while(ch<1 ||ch>2);
			        
			    }  while(ch==1);
				}
	}
				

			
	


