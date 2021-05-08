package eCommerce.dataAccess.concretes;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void signIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanici giris yapti..");
	}
	
	public void signUp(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanici basarili bir sekilde kayit oldu..");

	}
	
}
