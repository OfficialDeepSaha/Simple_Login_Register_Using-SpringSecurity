package Login_Register_System_UsingSpringSecurity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		
		return "home";
	}
	
	
	
	@GetMapping("/login")
	public String ShowLoginForm() {
		
		return "login";
	}
	
	
	
	@GetMapping("/register")
	public String registerForm(Model model) {
		
		User user = new User();
		model.addAttribute("user", user);
		
		return "register";
		
	}
	
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute("user") User user) {
		
		userService.createUser(user);
		
		return "login";
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	

}
