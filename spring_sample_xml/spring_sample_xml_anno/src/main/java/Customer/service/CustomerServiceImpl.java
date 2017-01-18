package Customer.service;

import java.util.List;

import sample_repository.CustomerRepository;
import sample_repository.HibernateCustomerRepositoryImpl;
import spring_sample_model.Customer;

public class CustomerServiceImpl implements CustomerSerivice {

	
	private	CustomerRepository cstmrepo = new HibernateCustomerRepositoryImpl();
			
	 /* (non-Javadoc)
	 * @see Customer.service.CustomerSerivice#findAll()
	 */
	@Override
	public	List<Customer> findAll()
		{
			return   cstmrepo. findAll();
		}
	

}
