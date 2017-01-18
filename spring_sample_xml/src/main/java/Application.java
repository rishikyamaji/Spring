import Customer.service.CustomerSerivice;
import Customer.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  CustomerSerivice service =  new CustomerServiceImpl();
  System.out.println(service.findAll().get(0).getSecondName());
	}

}
