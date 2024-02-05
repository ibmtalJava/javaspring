package ibmtal.trendyol.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.trendyol.business.services.TestUserService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dtos.TestUserAddDto;
import ibmtal.trendyol.entities.TestUser;

@RestController
@RequestMapping("/api/testUser")
public class TestUserController {
	private TestUserService testUserService;
	@Autowired
	public TestUserController(TestUserService testUserService) {
		super();
		this.testUserService = testUserService;
	}
	@PostMapping("/add")
	@GetMapping
	public Result<TestUser> add(@RequestBody TestUserAddDto testUserAddDto){
		return this.testUserService.addTestUser(testUserAddDto);
	}
	
}
