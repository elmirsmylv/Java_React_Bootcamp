package Concrete;

import Abstracts.SalesInterface;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements SalesInterface {
	
	@Override
	public void sell(Customer customer, Game game) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli kullanıcı " + game.getName() + " oyunu aldi.");
	}

}
