package com.streams.practiceb.examples;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateUsingStreams {

	public static void main(String[] args) {

		// Initial stream 
        Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34); 
  
        // Print the found duplicate elements 
        System.out.println(findDuplicateInStream(stream)); 
	}
	
	 public static <T> Set<T> findDuplicateInStream(Stream<T> stream) { 
	        
	        Set<T> items = new HashSet<>(); // Set to store the duplicate elements 
	  
	        // Return the set of duplicate elements 
	        return stream
	            // Set.add() returns false if the element was already present in the set. 
	            // Hence filter such elements 
	            .filter(n -> !items.add(n)) 
	            .collect(Collectors.toSet()); // Collect duplicate elements in the set 
	            
	    } 

}
