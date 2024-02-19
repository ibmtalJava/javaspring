package ibmtal.trendyol.business.services;

import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.entities.UserType;

public interface UserTypeService {
	Result<UserType> getAll();
}
