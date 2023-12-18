package ibmtal.kariyernet.business.managers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.kariyernet.business.services.UserTypeService;
import ibmtal.kariyernet.database.UserTypeDao;
import ibmtal.kariyernet.entities.UserType;

@Service
public class UserTypeManager implements UserTypeService {
	private UserTypeDao userTypeDao;
	@Autowired
	public UserTypeManager(UserTypeDao userTypeDao) {
		super();
		this.userTypeDao = userTypeDao;
	}
	@Override
	public ArrayList<UserType> getAll() {
		
		return (ArrayList<UserType>) this.userTypeDao.findAll();
	}
	@Override
	public UserType add(UserType userType) {
		// TODO Auto-generated method stub
		UserType newUserType=new UserType();
		newUserType.setAccessLevel(userType.getAccessLevel());
		newUserType.setName(userType.getName());
		newUserType.setStatus(userType.isStatus());
		this.userTypeDao.save(newUserType);
		return newUserType;
	}
	
}
