package ibmtal.trendyol.database;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.trendyol.entities.Job;

public interface JobDao extends JpaRepository<Job, Integer> {
	ArrayList<Job> findByName(String name);  
}
