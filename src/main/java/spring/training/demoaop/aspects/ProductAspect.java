package spring.training.demoaop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.jmx.support.ObjectNameManager;

@Aspect // -aspectjweaver
public class ProductAspect {

	@Before("addProductAdvice()")
	public void beforeAddProduct() {
		System.out.println("Before adding product");
	}

	@After("addProductAdvice()")
	public void afterAddProduct() {
		System.out.println("After adding Product");
	}

	@Pointcut("execution(public * addProduct(*))")
	public void addProductAdvice() {
	}
	
	
	@AfterReturning(pointcut ="execution(* getProduct(*))", returning = "product")
	public void getProductAdvice(Object product) {
		System.out.println("Returned Object is "+ product);
	}
	
}
