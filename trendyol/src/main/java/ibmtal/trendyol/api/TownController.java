package ibmtal.trendyol.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.trendyol.business.services.TownService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dtos.TownAddDto;
import ibmtal.trendyol.entities.Town;
@CrossOrigin(maxAge=3600)
@RestController
@RequestMapping("/api/town")
public class TownController {
	private TownService townService;
	@Autowired
	public TownController(TownService townService) {
		super();
		this.townService = townService;
	}
	@GetMapping("/getAll")
	public Result<Town> getAll(){
		return this.townService.getAll();
	}
	@PostMapping("/add")
	@GetMapping
	public Result<Town> add(@RequestBody TownAddDto townAddDto){
		return this.townService.add(townAddDto);
	}
}
