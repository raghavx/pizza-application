package in.ac.sharda.pizzaapplication.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import in.ac.sharda.pizzaapplication.domain.Product;

@Service
public class ProductServiceImpl 
				implements ProductService{
	private Map<Integer,Product>
			products = new HashMap<>();
	
	public Product getProductById(int id){
		return products.get(id);
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
