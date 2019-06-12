package in.ac.sharda.pizzaapplication.data;

import java.util.HashMap;
import java.util.Map;

import in.ac.sharda.pizzaapplication.domain.Product;

public class Products {
	private Map<Integer, Product> products = new HashMap<>();
	private static final Products instance = new Products();

	private Products() {

		products.put(1, new Product(1, 10, "Peppy Paneer Pizza",
				"Description of topping - Dried Green Olive, Chees, Indian Cheese, Etc ", 100));
	
		products.put(2, new Product(1, 10, "Tandoori Paneer Pizza",
				"Description of topping - Dried Green Olive, Chees, Indian Cheese, Etc ", 100));
		products.put(1, new Product(1, 10, "Chicken Pizza",
				"Description of topping - Dried Green Olive, Chees, Indian Cheese, Etc ", 100));
	}

	public static Products getInstance() {
		return instance;
	}

	public Map<Integer, Product> getProducts() {
		return products;
	}

}
