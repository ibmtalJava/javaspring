package ibmtal.trendyol.business.services;

import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dtos.TownAddDto;
import ibmtal.trendyol.entities.Town;

public interface TownService {
	public Result<Town> getAll();
	public Result<Town> add(TownAddDto addDto);
}
