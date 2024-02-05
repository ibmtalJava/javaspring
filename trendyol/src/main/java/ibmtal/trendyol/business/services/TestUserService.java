package ibmtal.trendyol.business.services;

import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dtos.TestUserAddDto;
import ibmtal.trendyol.entities.TestUser;

public interface TestUserService {
	Result<TestUser> addTestUser(TestUserAddDto testUserAddDto);
}
