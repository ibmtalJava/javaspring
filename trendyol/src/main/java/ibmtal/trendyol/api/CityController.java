package ibmtal.trendyol.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.trendyol.business.services.CityService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.entities.City;
@CrossOrigin(maxAge=3600)
@RestController
@RequestMapping("/api/city")
public class CityController {
	private CityService cityService;
	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	@GetMapping("/getAll")
	public Result<City> getAll(){
		return cityService.getAll();
	}
	
}
