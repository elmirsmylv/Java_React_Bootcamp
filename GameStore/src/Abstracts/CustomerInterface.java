package Abstracts;

import Entities.Customer;

public interface CustomerInterface {
	
	public void add(Customer customer) throws Exception;
	public void update(Customer customer);
	public void delete(Customer customer);
	

}
