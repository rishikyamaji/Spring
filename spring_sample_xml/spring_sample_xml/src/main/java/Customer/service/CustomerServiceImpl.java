package Customer.service;

import java.util.List;

import sample_repository.CustomerRepository;
import spring_sample_model.Customer;

public class CustomerServiceImpl implements CustomerSerivice {
	
	private	CustomerRepository customerRepository ;
	public CustomerServiceImpl()
	{
		
	}
	 public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository=customerRepository;
	}
	
	@Override
	public	List<Customer> findAll()
	{
		return   customerRepository. findAll();
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
