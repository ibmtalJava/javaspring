package ibmtal.sahibinden.api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.sahibinden.business.services.ProductService;
import ibmtal.sahibinden.entity.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	private ProductService productService;
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	@GetMapping("/getAll")
	public ArrayList<Product> getAll(){
		return this.productService.getAll();
	}
	
}
