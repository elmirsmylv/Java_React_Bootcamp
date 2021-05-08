package eCommerce.core.concretes;

import java.util.Scanner;

import eCommerce.core.abstracts.EmailVerificationService;

public class EmailVerificationManager implements EmailVerificationService{
	@Override
	public boolean isVerified(String email) {
		
		Scanner verify = new Scanner(System.in);
		System.out.println(email + " adresine dogrulama istegi gonderildi. Dogrulamak icin 'EVET' yazin.");
		String entry = verify.next();
		entry.toLowerCase();
		
		if(entry.equals("evet")) {
			System.out.println("Dogrulama basarili.");
			return true;
		}else {
			System.out.println("Dogrulama basarisiz.");
			return false;
		}
		
		
		
	}
}
