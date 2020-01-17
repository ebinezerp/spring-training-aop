package spring.training.demoaop.service;

import java.util.List;

import org.springframework.core.ExceptionDepthComparator;
import org.springframework.stereotype.Component;

import spring.training.demoaop.model.Database;
import spring.training.demoaop.model.Product;

@Component
public class ProductService {

	private List<Product> products;

	public ProductService() {
		products = Database.getProducts();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void updateProduct(Product product) {
		try {
			products.set(getIndex(product.getId()), product);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int getIndex(Integer productId) {
		for (int index = 0; index < products.size(); index++) {
			if (products.get(index).getId() == productId) {
				return index;
			}
		}
		return -1;
	}

	public List<Product> getProducts() {
		return products;
	}

	public Product getProduct(Integer id) {
		for (Product product : products) {
			if (product.getId() == id) {
				return product;
			}
		}
		return null;
	}

}
