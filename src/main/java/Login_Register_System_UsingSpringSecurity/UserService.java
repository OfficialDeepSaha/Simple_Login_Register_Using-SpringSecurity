package Login_Register_System_UsingSpringSecurity;

import java.util.List;

public interface UserService {

	
	List<User> getallUsers();
	
	User createUser(User user);
	
	
	
}
