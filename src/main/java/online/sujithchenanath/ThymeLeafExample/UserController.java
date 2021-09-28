package online.sujithchenanath.ThymeLeafExample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/if-unless")
	public String user(Model model) {
		List<User> users=new ArrayList<>();
		users.add(new User("sujiAdmin","ss@gmail.com","ADMIN"));
		users.add(new User("sujiUser","ss@gmail.com","USER"));
		users.add(new User("sujiAdmin","ss@gmail.com","ADMIN"));
		users.add(new User("sujiUser","ss@gmail.com","USER"));
		model.addAttribute("users", users);
		return "ifUnlessExample";
	}
	
	@GetMapping("/switch-case")
	public String switchCase(Model model) {
		
		User user=new User("sujiAdmin","ss@gmail.com","ADMIN");
		model.addAttribute("user", user);
		return "switch-case";
	}
	

}
