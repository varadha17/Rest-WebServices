package DBConnect;

import java.util.HashMap;
import java.util.Map;

import Model.Products;
import Model.Users;

public class DBModel {
	
	private static Map<Long, Users> us = new HashMap<>();
	private static Map<Long, Products> pc = new HashMap<>();

	
	public static Map<Long, Users> getDBUsers(){
		
		return us;
		
	}
	
	public static Map<Long, Products> getDBProducts(){
		
		return pc;
		
	}
}
