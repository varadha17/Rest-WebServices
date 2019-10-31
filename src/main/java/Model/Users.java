package Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Users {
	
	private long id;
	private String firstName;
	private String lastName;
	private String Email;
	private String gender;
	private String status;

	
	//no-arg constructor
	public Users() {
		
	}
	
	public Users(long id, String firstName,String lastName, String Email, String gender, String status) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Email = Email;
		this.gender = gender;
		this.status = status;
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
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
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
