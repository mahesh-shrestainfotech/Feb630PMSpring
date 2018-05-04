import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mtc.app.ExampleService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/META-INF/spring/app-context.xml");
		
		ExampleService exampleService = applicationContext.getBean(ExampleService.class);
		
		System.out.println(exampleService.getMessage());
		
	}

}
