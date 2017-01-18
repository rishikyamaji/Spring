import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Customer.service.CustomerSerivice;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //CustomerSerivice service =  new CustomerServiceImpl();
		@SuppressWarnings("resource")
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerSerivice service=appcontext.getBean("customerService", CustomerSerivice.class);
        System.out.println(service.findAll().get(0).getSecondName());
	}

}
