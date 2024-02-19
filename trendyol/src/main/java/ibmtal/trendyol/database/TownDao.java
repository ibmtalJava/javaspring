package ibmtal.trendyol.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.trendyol.entities.Town;

public interface TownDao extends JpaRepository<Town, Integer> {

}
