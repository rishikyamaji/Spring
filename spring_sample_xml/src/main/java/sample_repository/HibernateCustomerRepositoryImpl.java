package sample_repository;

import java.util.ArrayList;
import java.util.List;

import spring_sample_model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
/* (non-Javadoc)
 * @see sample_repository.CustomerRepository#getAll()
 */
@Override
public 	List<Customer> findAll()
{
	List<Customer>  customers= new ArrayList<>();
	Customer customer = new Customer();
	customer.setFirstName("rishi");
	customer.setSecondName("kyamaji");
	customers.add(customer);
	return customers;
	
}



}
