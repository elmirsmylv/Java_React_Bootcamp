package eCommerce.business.concretes;

import eCommerce.business.abstracts.SignInSignUpService;
import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService{
	
	private SignInSignUpService signInSignUpService;
	

	public UserManager(SignInSignUpService signInSignUpService) {
		super();
		this.signInSignUpService = signInSignUpService;
	}
 

	@Override
	public void signUp(User user) throws Exception {
		signInSignUpService.register(user);
		
	}
	
	@Override
	public void signIn(User user) {
		
		signInSignUpService.login(user.getFirstName(), user.getLastName());
		
	}
	

}
