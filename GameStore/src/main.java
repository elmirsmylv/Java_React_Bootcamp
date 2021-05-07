import Concrete.CustomerCheckManager;
import Concrete.CustomerManager;
import Concrete.SalesManager;
import Entities.Customer;
import Entities.Game;

public class main {

	public static void main(String[] args) throws Exception {
		
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager());
		Customer customer1 = new Customer(1,"ELmir", "Ismayilov", 1998, "128438722311");
		Customer customer2 = new Customer();
		customer2.setFirstName("Ferhan");
		customerManager.add(customer1);
		
		
		
		Game GTA = new Game(1,"GTA", 59.90);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sell(customer1, GTA);
		
		
	}

}