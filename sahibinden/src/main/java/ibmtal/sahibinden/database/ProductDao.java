package ibmtal.sahibinden.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.sahibinden.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
