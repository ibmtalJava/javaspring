package ibmtal.trendyol.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.trendyol.business.services.UserTypeService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.entities.UserType;

@RestController
@RequestMapping("/api/userType")
public class UserTypeController {
	private UserTypeService userTypeService;
	@Autowired
	public UserTypeController(UserTypeService userTypeService) {
		super();
		this.userTypeService = userTypeService;
	}
	@GetMapping("/getAll")
	public Result<UserType> getAll(){
		return this.userTypeService.getAll();
	}
	
}
