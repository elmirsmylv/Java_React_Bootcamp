import java.rmi.RemoteException;
import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

    public static void main(String[] args) throws Exception{
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Fatih");
        customer1.setLastName("Deniz");
        customer1.setDataOfBirth(1986);
        customer1.setNationalityId(16807467380L);
         
        customerManager.Save(customer1);
        

    }
}
  