package core;
import java.util.*;
public class P15_3 {
	public static void main(String[] args) {
		
		//Create a HashMap
		HashMap<String,Integer>hashMap = new HashMap<>();
		//Added elements to hashMap
		hashMap.put("John", 20);
		hashMap.put("Jani", 21);
		hashMap.put("Janardhan", 24);
		//Iterate through the HashMap
		for(Map.Entry<String, Integer>entry :hashMap.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		
	}
}
