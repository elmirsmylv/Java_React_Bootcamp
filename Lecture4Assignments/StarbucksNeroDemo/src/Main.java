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
        customer1.setFirstName("Elmir");
        customer1.setLastName("Ismayilov");
        customer1.setDataOfBirth(new Date(1998,11,05));
        customer1.setNationalityId(4783398219L);
         
        customerManager.Save(customer1);
        

    }
}
  