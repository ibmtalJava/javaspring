package ibmtal.trendyol.business.services;

import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.entities.City;

public interface CityService {
	public Result<City> getAll();
}
