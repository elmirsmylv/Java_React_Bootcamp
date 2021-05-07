package Concrete;

import Abstracts.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		if(customer.getNationalityId().length() > 11) {
			return true;
		}else {
			return false;
		}
		
	}

}
