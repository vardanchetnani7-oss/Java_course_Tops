package core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class P15_2 {
public static void main(String[] args) {
	
	//making the collection object
	Collection<String>collection = new ArrayList<>();
	
	//adding the elements to the collection
	
	collection.add("vardan");
	collection.add("chetnani");
	collection.add("nirma");
	collection.add("university");
	collection.add("university");
	collection.add("2024");
	
	// Displaying the collections elements 
	
	System.out.println("displaying the initial collection");
	System.out.println(collection);
	
	
	//Hashset for deleting the duplicates enteries
	
	HashSet<String>hashSet = new HashSet<>(collection);
	
	System.out.println("\nDisplaying the HashSet\n");
	System.out.println(hashSet);
}
}
