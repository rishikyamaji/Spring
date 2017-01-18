import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Customer.service.CustomerSerivice;

public class Application {

	public static void main(String[] args) {
   ApplicationContext appContext= new AnnotationConfigApplicationContext(AppConfig.class);
		//CustomerSerivice service =  new CustomerServiceImpl();
   CustomerSerivice service =appContext.getBean("customerService",CustomerSerivice.class);
  System.out.println(service.findAll().get(0).getSecondName());
	}

}
