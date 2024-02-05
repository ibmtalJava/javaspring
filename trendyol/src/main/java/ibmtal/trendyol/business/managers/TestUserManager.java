package ibmtal.trendyol.business.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.trendyol.business.services.TestUserService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.database.TestUserDao;
import ibmtal.trendyol.dtos.TestUserAddDto;
import ibmtal.trendyol.entities.TestUser;

@Service
public class TestUserManager implements TestUserService {
	private TestUserDao testUserDao;
	@Autowired
	public TestUserManager(TestUserDao testUserDao) {
		super();
		this.testUserDao = testUserDao;
	}
	@Override
	public Result<TestUser> addTestUser(TestUserAddDto testUserAddDto) {
		Result<TestUser> result= new Result<>();
		if(testUserAddDto.getName().length()<3) {
			result.addError("name","En az 3 karakter olmalı");
		}
		if(testUserAddDto.getName().length()>20) {
			result.addError("name","Max 20 Karakter");
		}
		
		
		if(result.isSuccess()) {
			TestUser newUser= new TestUser();
			newUser.setName(testUserAddDto.getName());
			newUser.setSurname(testUserAddDto.getSurname());
			newUser.setGrade(testUserAddDto.getGrade());
			this.testUserDao.save(newUser);
			result.getData().add(newUser);
		}
		return result;
		
		
		
	}
	
}
