package DBConnect;

import java.util.HashMap;
import java.util.Map;

import Model.Users;

public class DBModel {
	
	private static Map<Long, Users> us = new HashMap<>();

	
	public static Map<Long, Users> getDBUsers(){
		
		return us;
		
	}
}
