package eCommerce.core.concretes;
import java.util.regex.Pattern;

import eCommerce.core.abstracts.CheckServices;

public class CheckServiceManager implements CheckServices{
	
	public boolean checkFields (String firstName, String lastName, String email, String password ) {
		//EMAIL CHECK
		if(email == null || email.isEmpty()) {
			System.out.println("Email Gecersiz");
			return false;
		}
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		
		Pattern pattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
		
		if(!pattern.matcher(email).matches()) {
			System.out.println("Email gecersiz.");
			return false;
		}
		
		
		//PASSWORD CHECK
		if(password == null || password.isEmpty()) {
			System.out.println("Sifre gecersiz");
			return false;
		}
		
		if(password.length() < 6) {
			System.out.println("Sifre en az 6 karakterli olmalidir.");
			return false;
		}
		
		//CHECK FIRSTNAME
		if(firstName.length() <= 2) {
			System.out.println("Isim gecersiz");
			return false;
		}
		
		//CHECK LASTNAME
		if(lastName.length() <= 2) {
			System.out.println("Soyisim gecersiz");
			return false;
		}
		
		
		return true;
	}
	
	
	}
	

