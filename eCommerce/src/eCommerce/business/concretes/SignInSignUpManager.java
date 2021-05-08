package eCommerce.business.concretes;

import eCommerce.business.abstracts.SignInSignUpService;
import eCommerce.core.abstracts.CheckServices;
import eCommerce.core.abstracts.EmailVerificationService;
import eCommerce.core.abstracts.GoogleAuthService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class SignInSignUpManager implements SignInSignUpService {
	
	private CheckServices checkService;
	private UserDao userDao;
	private EmailVerificationService emailVerify;
	private GoogleAuthService googleAuthService;
	
	public SignInSignUpManager(UserDao userDao, CheckServices checkService, EmailVerificationService emailVerify,  GoogleAuthService googleAuthService) {
		this.checkService = checkService;
		this.userDao = userDao;
		this.emailVerify = emailVerify;
		this.googleAuthService = googleAuthService;
	}



	@Override
	public void register(User user) {
		
		if(!checkService.checkFields(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword())) {
			return;
		}
		else if(!emailVerify.isVerified(user.getEmail())) {
			return;
		}
		
		
		userDao.signUp(user);
	}

	@Override
	public void login(String email, String password) {
		googleAuthService.signInWithGoogle(email, password);
	}
	
}
