package ibmtal.trendyol.business.services;

import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dtos.JobAddDto;
import ibmtal.trendyol.entities.Job;

public interface JobService {
	public Result<Job> addJob(JobAddDto addDto);
	public Result<Job> getBySector(int sectorid);
}
