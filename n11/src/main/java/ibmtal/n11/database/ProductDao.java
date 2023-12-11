package ibmtal.n11.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.n11.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
