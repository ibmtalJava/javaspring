package ibmtal.kariyernet.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.kariyernet.entities.UserType;

public interface UserTypeDao extends JpaRepository<UserType, Integer> {

}
