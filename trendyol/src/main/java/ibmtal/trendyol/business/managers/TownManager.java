package ibmtal.trendyol.business.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.trendyol.business.services.TownService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.database.CityDao;
import ibmtal.trendyol.database.TownDao;
import ibmtal.trendyol.dtos.TownAddDto;
import ibmtal.trendyol.entities.City;
import ibmtal.trendyol.entities.Town;
@Service
public class TownManager implements TownService {
	private TownDao townDao;
	private CityDao cityDao;


	@Autowired
	public TownManager(TownDao townDao, CityDao cityDao) {
		super();
		this.townDao = townDao;
		this.cityDao = cityDao;
	}
	@Override
	public Result<Town> getAll() {
		Result<Town> result=new Result<Town>();
		result.getData().addAll(this.townDao.findAll());
		return result;
	}
	@Override
	public Result<Town> add(TownAddDto addDto) {
		Result<Town> result=new Result<Town>();
		
		if(this.cityDao.findById(addDto.getCity()).isEmpty()) {
			result.addError("city", "Tanımsız");
		}
		if(result.isSuccess()) {
			Town town=new Town();
			town.setName(addDto.getName());
			town.setCity(this.cityDao.findById(addDto.getCity()).get());
			town=this.townDao.save(town);
			result.getData().add(town);
		}
		return result;
	}
	
	
}
