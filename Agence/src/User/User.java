package User;

import java.util.Scanner;

public class User {
	protected String email;
	 protected String password;

	 public User() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Veuillez saisir votre email");
			this.email=sc.nextLine();
			System.out.println("Veuillez saisir votre password");
			this.password=sc.nextLine();
	 }
	 
	 public User(String email, String password) {
		this.email = email;
		this.password = password;
	}


	public User connexion () {
		User U= new User();
		if((U.email.equals(email))&&(U.password.equals(password))){
			return U;
			}
		return null;
	}



	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	 
	 
}
