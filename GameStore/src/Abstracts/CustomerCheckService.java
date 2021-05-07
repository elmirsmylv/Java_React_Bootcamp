package Abstracts;


import Entities.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws Exception;
}
