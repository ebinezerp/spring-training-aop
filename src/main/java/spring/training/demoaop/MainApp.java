package spring.training.demoaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.training.demoaop.model.Product;
import spring.training.demoaop.service.ProductService;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ProductService productService = context.getBean("productService", ProductService.class);
		
		Product product = new Product(101, "mobile", 10000F);
		
		productService.addProduct(product);
		
		productService.getProduct(101);
		
		//System.out.println(productService.getProducts());
		

	}

}
