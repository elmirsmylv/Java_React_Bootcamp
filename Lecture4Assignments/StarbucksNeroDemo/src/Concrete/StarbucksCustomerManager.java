package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    CustomerCheckService _customerCheckService;
    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        _customerCheckService = customerCheckService;
    }

    public StarbucksCustomerManager() {

    }

    @Override
    public void Save(Customer customer) throws RemoteException {
        if (_customerCheckService.CheckIfRealPerson(customer )) {
            Save(customer);
        }else{
            System.out.println("Not a valid person");
        }

    }

}
