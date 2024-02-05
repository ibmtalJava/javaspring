package ibmtal.trendyol.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.trendyol.entities.TestUser;

public interface TestUserDao extends JpaRepository<TestUser, Integer> {

}
