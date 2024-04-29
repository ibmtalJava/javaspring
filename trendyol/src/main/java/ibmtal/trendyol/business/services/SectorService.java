package ibmtal.trendyol.business.services;

import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dtos.SectorAddDto;
import ibmtal.trendyol.entities.Sector;

public interface SectorService {
	Result<Sector> add(SectorAddDto addDto);
	boolean checkById(int id);
	Sector getById(int id);
	Result<Sector> getAll();
}
