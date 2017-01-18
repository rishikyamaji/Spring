import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Customer.service.CustomerSerivice;
import Customer.service.CustomerServiceImpl;
import sample_repository.CustomerRepository;
import sample_repository.HibernateCustomerRepositoryImpl;

@Configuration
public class AppConfig {
	@Bean(name="customerService")
	public CustomerSerivice getCustomerService()
	{
		CustomerServiceImpl customerService =new CustomerServiceImpl();
		customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository()
	{
		return new HibernateCustomerRepositoryImpl();
	}
	

}
