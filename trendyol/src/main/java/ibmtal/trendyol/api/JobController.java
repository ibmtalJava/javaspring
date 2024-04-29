package ibmtal.trendyol.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.trendyol.business.services.JobService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dtos.JobAddDto;
import ibmtal.trendyol.entities.Job;

@CrossOrigin(maxAge=3600)
@RestController
@RequestMapping("/api/job")
public class JobController {
	private JobService jobService;
	@Autowired
	public JobController(JobService jobService) {
		super();
		this.jobService = jobService;
	}
	@PostMapping("/add")
	@GetMapping
	public Result<Job> add(@RequestBody JobAddDto addDto){
		return this.jobService.addJob(addDto);
	}
	@PostMapping("/getBySector")
	@GetMapping
	public Result<Job> getBySector(@RequestParam int sectorid){
		return this.jobService.getBySector(sectorid);
		
	}
	
}
