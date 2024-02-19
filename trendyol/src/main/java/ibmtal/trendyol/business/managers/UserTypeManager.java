package ibmtal.trendyol.business.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.trendyol.business.services.UserTypeService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.database.UserTypeDao;
import ibmtal.trendyol.entities.UserType;

@Service
public class UserTypeManager implements UserTypeService {
	private UserTypeDao userTypeDao;
	@Autowired
	public UserTypeManager(UserTypeDao userTypeDao) {
		super();
		this.userTypeDao = userTypeDao;
	}
	@Override
	public Result<UserType> getAll() {
		Result<UserType> result=new Result<UserType>();
		result.getData().addAll(userTypeDao.findAll());
		return result;
	}
	
	
	
	
}
