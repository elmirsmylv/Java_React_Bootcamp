package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface SignInSignUpService {
	void register(User user) throws Exception;
	void login(String email, String password);
}
