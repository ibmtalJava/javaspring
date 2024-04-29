package ibmtal.trendyol.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.trendyol.entities.Sector;

public interface SectorDao extends JpaRepository<Sector, Integer> {
	Sector getByName(String name);
	Sector getByRating(double rating);

}
