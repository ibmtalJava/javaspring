package ibmtal.kariyernet.api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.kariyernet.business.services.UserTypeService;
import ibmtal.kariyernet.entities.UserType;

@RestController
@RequestMapping("/api/UserType")
public class UserTypeController {
	private UserTypeService userTypeService;
	@Autowired
	public UserTypeController(UserTypeService userTypeService) {
		super();
		this.userTypeService = userTypeService;
	}
	@GetMapping("/getAll")
	public ArrayList<UserType> getAll(){
		return this.userTypeService.getAll();
	}
	@PostMapping("/add")
	@GetMapping
	public UserType add(@RequestBody UserType userType) {
		return this.userTypeService.add(userType);
	}
	
}
