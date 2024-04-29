package ibmtal.trendyol.business.managers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.trendyol.business.services.JobService;
import ibmtal.trendyol.business.services.SectorService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.database.JobDao;
import ibmtal.trendyol.dtos.JobAddDto;
import ibmtal.trendyol.entities.Job;

@Service
public class JobManager implements JobService {
	private JobDao jobDao;
	private SectorService sectorService;
	@Autowired
	public JobManager(JobDao jobDao, SectorService sectorService) {
		super();
		this.jobDao = jobDao;
		this.sectorService = sectorService;
	}
	@Override
	public Result<Job> addJob(JobAddDto addDto) {
		Result<Job> result=new Result<Job>();
		if(addDto.getName().isBlank()) {
			result.addError("name", "Boş Geçilemez");
		}
		
		if(this.sectorService.checkById(addDto.getSector())==false) {
			result.addError("sector", "Tanımsız");
		}
		ArrayList<Job> searchJobs=this.jobDao.findByName(addDto.getName());
		for(Job j:searchJobs) {
			if(j.getSector().getId()==addDto.getSector()) {
				result.addError("name", "Aynı Sektörde kayıt mevcut");
			}
		}
		if(result.isSuccess()) {
			Job job=new Job();
			job.setName(addDto.getName());
			job.setSector(this.sectorService.getById(addDto.getSector()));
			job.setDescription(addDto.getDescription());
			this.jobDao.save(job);
			result.getData().add(job);
		}
		return result;
	}
	@Override
	public Result<Job> getBySector(int sectorid) {
		Result<Job> result=new Result<Job>();
		for(Job j:this.jobDao.findAll()) {
			if(j.getSector()!=null) {
				if(j.getSector().getId()==sectorid) {
					result.getData().add(j);
				}
			}
		}		
		return result;
	}
	
}
