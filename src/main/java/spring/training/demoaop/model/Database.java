package spring.training.demoaop.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Database {
	private static List<Product> products = new ArrayList<Product>();

	public static List<Product> getProducts() {
		return products;
	}

	public static void setProducts(List<Product> products) {
		Database.products = products;
	}

}
