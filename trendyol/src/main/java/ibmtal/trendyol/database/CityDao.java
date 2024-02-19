package ibmtal.trendyol.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.trendyol.entities.City;

public interface CityDao extends JpaRepository<City, Integer> {
	
}
