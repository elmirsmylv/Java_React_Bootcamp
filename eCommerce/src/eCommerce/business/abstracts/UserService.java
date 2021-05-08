package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {
	void signIn(User user);
	void signUp(User user) throws Exception;
}
