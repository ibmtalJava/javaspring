package ibmtal.trendyol.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.trendyol.business.services.SectorService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dtos.SectorAddDto;
import ibmtal.trendyol.entities.Sector;

@CrossOrigin(maxAge=3600)
@RestController
@RequestMapping("/api/sector")
public class SectorController {
	private SectorService sectorService;
	@Autowired
	public SectorController(SectorService sectorService) {
		super();
		this.sectorService = sectorService;
	}
	
	@PostMapping("/add")
	@GetMapping
	Result<Sector> add(@RequestBody SectorAddDto addDto){
		return this.sectorService.add(addDto);
	}
	@GetMapping
	Result<Sector> getAll(){
		
		return this.sectorService.getAll();
	}
}
