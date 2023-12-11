package ibmtal.n11.business.managers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.n11.business.services.ProductService;
import ibmtal.n11.database.ProductDao;
import ibmtal.n11.entity.Product;
@Service
public class ProductManager implements ProductService {
	private ProductDao productDao;
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public ArrayList<Product> allRecords() {
		// TODO Auto-generated method stub
		return (ArrayList<Product>) this.productDao.findAll();
	}
	
}
