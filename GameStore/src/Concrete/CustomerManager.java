package Concrete;



import Abstracts.CustomerCheckService;
import Abstracts.CustomerInterface;
import Entities.Customer;
public class CustomerManager implements CustomerInterface{
	
	private CustomerCheckService customerCheckService;
	
	
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	public CustomerManager() {}
	
	@Override
	public void add(Customer customer) throws Exception {
		
 		if(customerCheckService.CheckIfRealPerson(customer)){
			System.out.println(customer.getFirstName() + " isimli musteri eklendi..");
		}else {
			System.out.println("Bilgiler yanlış!"); 
		}
				
		
	}
	
	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+ " isimli musteri guncellendi..");
	}
	
	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " isimli musteri silindi..");
	}

}
