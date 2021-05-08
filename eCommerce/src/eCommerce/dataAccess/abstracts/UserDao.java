package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserDao {
	void signIn(User user);
	void signUp(User user);
	//void delete(User user);
	//void update(User user);
	//User get(int id);
	//List<User> getAll();
}
	