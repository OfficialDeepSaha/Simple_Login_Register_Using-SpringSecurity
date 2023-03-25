package Login_Register_System_UsingSpringSecurity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {
	
	
	private User user;
	
	
	
	

	public CustomUserDetails(User user) {
		super();
		
		this.user = user;
		
	}

	@Override
	public List<GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authority = new ArrayList<>();
		
		user.getRoles().forEach(role -> {
			authority.add(new SimpleGrantedAuthority(role.getName()));
			
			
		});
		
		return authority;
	}
	
	
	
	
	public String getFirstName() {
		
		return user.getFirstName();
		}
	
	
	public String getLastName() {
		
		return user.getLastName();
		
	}
	
	
	

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
