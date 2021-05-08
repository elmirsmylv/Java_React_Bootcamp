package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.SignInSignUpManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.adapters.GoogleAuthManagerAdapter;
import eCommerce.core.concretes.CheckServiceManager;
import eCommerce.core.concretes.EmailVerificationManager;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) throws Exception {
		User user1 = new User(1,"Albert", "King", "albert@gmail.com" , "1234678");
		User user2 = new User(2,"David", "Gilmour", "david@gmail.com", "qwerty");
		
		UserService userService = new UserManager(new SignInSignUpManager(new HibernateUserDao(), new CheckServiceManager(), new EmailVerificationManager(),new GoogleAuthManagerAdapter()));
		
		//userService.signUp(user2);
		userService.signIn(user1);
			
	}

}
