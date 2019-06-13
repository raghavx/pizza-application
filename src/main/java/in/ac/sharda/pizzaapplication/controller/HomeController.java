package in.ac.sharda.pizzaapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.ac.sharda.pizzaapplication.data.Products;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("products", Products.getInstance().getProducts().values());
		return "home";
	}

	@GetMapping("/web/product/detail/{id}")
	public String detail(@PathVariable("id") int id, 
			Model model) {
		model.addAttribute("product", 
				Products.getInstance()
				.getProducts().get(id));
		return "productdetail";
	}
}
