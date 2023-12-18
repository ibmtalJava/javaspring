package ibmtal.kariyernet.business.services;

import java.util.ArrayList;

import ibmtal.kariyernet.entities.UserType;



public interface UserTypeService {
	ArrayList<UserType> getAll();
	UserType add(UserType userType);
}
