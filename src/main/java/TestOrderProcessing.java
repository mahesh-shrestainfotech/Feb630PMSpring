import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mtc.app.service.ProductService;
import com.mtc.app.vo.Order;

public class TestOrderProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		
		ProductService productService = applicationContext.getBean(ProductService.class);
		
		Order order = new Order(11111,101,30,"Urgent Delivery");
		
		boolean flag = productService.processOrder(order);
		
		if(flag) {
			System.out.println("Order Placed Succesffully");
		}else {
			System.out.println("Order couldn't placed");
		}

	}

}
