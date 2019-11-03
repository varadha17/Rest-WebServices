package Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import DBConnect.DBModel;
import Model.Users;

public class userService {
	
	public userService() {
		
		userDemo.put(1L, new Users(1,"Badri", "Narayanan", "Badri@gmail.com", "male", "inactive"));
	}
	
	private Map<Long, Users> userDemo = DBModel.getDBUsers();
	
	public List<Users> getAllUser(){
		
		return new ArrayList<Users>(userDemo.values());
		
	}
	/*
	public List<Users> getUserfordate(int date){
		
		List<Users> userdate = new ArrayList<>();
		Calendar cl = Calendar.getInstance();
		for(Users us: userDemo.values()) {
			
			cl.setTime(us.getDate());
			
			if(cl.get(Calendar.YEAR) == date) {
				
				userdate.add(us);
				
			}
		}
		
		return userdate;
	}*/
	
	//FirstName
	public List<Users> getUserwithFirstName(String first){
		
		List<Users> userdata = new ArrayList<>();
		
		for(Users us: userDemo.values()) {
			
			String user = us.getFirstName();
			
			if(user.equalsIgnoreCase(first)) {
				
				userdata.add(us);
			}
		}
		
		return userdata;

	}
	
	//LastName
	public List<Users> getUserWithLastName(String last){
		
		List<Users> userdata = new ArrayList<>();
		
		for(Users us: userDemo.values()) {
			
			String user = us.getLastName();
			
			if(user.equalsIgnoreCase(last)) {
				
				userdata.add(us);
			}
		}
		
		return userdata;
	}
	
	//Email
	public List<Users> getUserWithEmailId(String email){
		
		List<Users> userdata = new ArrayList<>();
		
		for(Users us: userDemo.values()) {
			
			String user = us.getEmail();
			
			if(user.equalsIgnoreCase(email)) {
				
				userdata.add(us);
			}
		}
		
		return userdata;
	}
	
	//status
	public List<Users> getUserStatus(String status) {
		
		List<Users> userstatus = new ArrayList<>();
		
		for(Users us : userDemo.values()) {
			
			String user = us.getStatus();
			
			if(user.equalsIgnoreCase(status)) {
				
				userstatus.add(us);
				
			}
		}
		
		return userstatus;
		
	}
	
	//Gender
	public List<Users> getUserGender(String gender){
		
		List<Users> usergender = new ArrayList<>();
		
		for(Users us : userDemo.values()) {
			
			String user = us.getGender();
			
			if(user.equalsIgnoreCase(gender)) {
				
				usergender.add(us);
			}
		}
		
		return usergender;
	}
	
	public Users getUserID(long id) {
		
		return userDemo.get(id);
		
	}
	
	public Users addUser(Users add) {
		
		add.setId(userDemo.size()+1);
		userDemo.put(add.getId(), add);
		return add;
	}
	
	public Users updateUser(Users add) {
		
		if(add.getId() <= 0) {
			
			return null;
		}
		userDemo.put(add.getId(), add);
		return add;
	}

	public Users DeleteUser(long id) {
		
		return userDemo.remove(id);
	}
}
