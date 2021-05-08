package eCommerce.core.adapters;

import eCommerce.core.abstracts.GoogleAuthService;
import eCommerce.googleAuthenticator.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService {

	@Override
	public void signInWithGoogle(String firstName, String lastName) {
		
		GoogleAuthManager manager = new GoogleAuthManager();
		manager.signIn(firstName, lastName);
		
	}
	
}
