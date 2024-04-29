package ibmtal.trendyol.business.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.trendyol.business.services.SectorService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.database.SectorDao;
import ibmtal.trendyol.dtos.SectorAddDto;
import ibmtal.trendyol.entities.Sector;

@Service
public class SectorManager implements SectorService {
	private SectorDao dao;
	@Autowired
	public SectorManager(SectorDao dao) {
		super();
		this.dao = dao;
	}
	@Override
	public Result<Sector> add(SectorAddDto addDto) {
		Result<Sector> result=new Result<Sector>();
		Sector sector=new Sector();
		sector.setName(addDto.getName());
		sector.setRating(addDto.getRating());
		result.getData().add(sector);
		if(sector.getName().isEmpty()) {
			result.addError("name","Boş geçilemez");
		}
		if(this.dao.getByName(sector.getName())!=null) {
			result.addError("name","Sectör kaydı mevcut");
		}
		if(sector.getRating()>10) {
			result.addError("rating","Puan 10 dan büyük olamaz");
		}
		if(result.isSuccess()) {
			this.dao.save(sector);
		}
		
		return result;
	}
	@Override
	public boolean checkById(int id) {
		if(id==0) return false;
		if(this.dao.findById(id).isEmpty()) return false;
		return true;
	}
	@Override
	public Sector getById(int id) {
		if(this.checkById(id)==false) {
			return null;
		}
		
		return this.dao.getById(id);
	}
	@Override
	public Result<Sector> getAll() {
		// TODO Auto-generated method stub
		Result<Sector> result=new Result<Sector>();
		result.getData().addAll(this.dao.findAll());
		return result;
	}
}
