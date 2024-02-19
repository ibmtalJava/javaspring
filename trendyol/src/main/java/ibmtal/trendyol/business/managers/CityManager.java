package ibmtal.trendyol.business.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.trendyol.business.services.CityService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.database.CityDao;
import ibmtal.trendyol.entities.City;

@Service
public class CityManager implements CityService {
	private CityDao cityDao;
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}
	@Override
	public Result<City> getAll() {
		Result<City> result=new Result<City>();
		result.getData().addAll(cityDao.findAll());
		return result;
	}
	
}
