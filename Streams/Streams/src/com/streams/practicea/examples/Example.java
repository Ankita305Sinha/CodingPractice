package com.streams.practicea.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {

	public static void main(String[] args) {
		// create a list
		List<Student> lt = new ArrayList<Student>();

		// add the member of list
		lt.add(new Student(1, "Geeks"));
		lt.add(new Student(2, "For"));
		lt.add(new Student(3, "Geeks"));

		// create map with the help of
		// Object (stu) method
		// create object of Map class
		Map<Integer, String> map = new HashMap<>();

		// put every value list to Map
		for (Student stu : lt) {
			map.put(stu.getId(), stu.getName());
		}

		// print map
		System.out.println("Map  : " + map);
		
		
	}
}
