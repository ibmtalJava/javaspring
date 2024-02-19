package ibmtal.trendyol.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.trendyol.entities.UserType;

public interface UserTypeDao extends JpaRepository<UserType, Integer> {

}
