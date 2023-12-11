package ibmtal.n11.api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.n11.business.services.ProductService;
import ibmtal.n11.entity.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	private ProductService productService;
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	@GetMapping("/tumKayitlar")
	public ArrayList<Product> getAll(){
		return this.productService.allRecords();
	}
}
