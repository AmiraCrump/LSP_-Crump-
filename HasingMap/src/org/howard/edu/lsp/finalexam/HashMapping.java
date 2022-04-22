package org.howard.edu.lsp.finalexam;
import java.util.HashMap;

public class HashMapping {

	public static void main(String[] args) {
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap <String, String> map2 = new HashMap <String, String>();
		
		map1.put("FirstName", "John");
		map1.put("LastName", "Doe");
		map1.put("Age", "45");
		map1.put("Occupation", "Policeman");
		
		System.out.println(map1);
		
		map2.put("FirstName", "John");
		map2.put("LastName", "Doe");
		map2.put("Age","45");
		map2.put("Occupation", "Policeman");
		
		System.out.println(map2);
		
	}

}
