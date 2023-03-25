package Login_Register_System_UsingSpringSecurity;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String firstName;
	
	
	private String lastName;
	
	@Column(nullable = false , unique = true )
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL , fetch= FetchType.EAGER)
	@JoinTable(name="user_role" ,
    joinColumns = @JoinColumn(name="USER_ID", referencedColumnName="ID"),
       inverseJoinColumns= @JoinColumn (name="ROLE_ID",referencedColumnName= "ID" ))
	private List<Role> roles;
	

	public User() {
		
	}


	public User(Long id, String firstName, String lastName, String email, String password, List<Role> roles) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", roles=" + roles + "]";
	}

	

	
	
	
	
	
	
	
	
	
	

}
