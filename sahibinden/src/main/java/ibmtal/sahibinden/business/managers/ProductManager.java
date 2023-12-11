package ibmtal.sahibinden.business.managers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.sahibinden.business.services.ProductService;
import ibmtal.sahibinden.database.ProductDao;
import ibmtal.sahibinden.entity.Product;

@Service
public class ProductManager implements ProductService {
	private ProductDao productDao;
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public ArrayList<Product> getAll() {
		// TODO Auto-generated method stub
		return (ArrayList<Product>) this.productDao.findAll();
	}
}
