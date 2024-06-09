package com.streams.practiceb.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

///Read more: https://javarevisited.blogspot.com/2021/09/comparator-comparing-thenComparing-example-java-.html#ixzz8X1jOtd1B	

public class ComparingAndThenComparing {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Lokesh", "Gupta", 21, "HR", 10000, 500));
		employees.add(new Employee("Alex", "Gussin", 11, "HR", 20000, 600));
		employees.add(new Employee("Brian", "Sux", 41, "HR", 30000, 1000));
		employees.add(new Employee("Neon", "Piper", 51, "HR", 10000, 800));
		employees.add(new Employee("David", "Beckham", 31, "IT", 10000, 700));
		employees.add(new Employee("Alex", "Beckham", 71, "IT", 20000, 900));
		employees.add(new Employee("Brian", "Suxena", 61, "IT", 40000, 1200));
		
// group each employee by department
		Map<String, List<Employee>> map0 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
//		To find Max Salary for each Department and collect as Map
		
		Map<String, Optional<Employee>> map3 = 
					employees.stream()
	              			 .collect(Collectors.groupingBy(Employee::getDepartment,
	               										Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		
		
//		To find Max Salary for each Department and collect as Map
		Map<String, Object> map = employees.stream()
							               .collect(Collectors.groupingBy(Employee::getDepartment,
							                       Collectors.collectingAndThen(
							                               Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)
							                                       ), Optional::get)));
		
		// Sort employee  on salary in descending order and get the name for 2nd highest salary
		String name = employees.stream()
				.sorted((emp1, emp2) -> Long.compare(emp2.getSalary(),emp1.getSalary()))
				.skip(1).findFirst()
				.map(Employee::getFirstName).get();

		System.out.println("name = " + name);
		
		// Sort employee in descending order on Bonus and get the name for 2nd highest salary
		String name2 = employees.stream()
				.sorted((emp1, emp2) -> emp2.getBonus() - emp1.getBonus())
				.skip(1)
				.findFirst()
				.map(Employee::getFirstName).get();

		System.out.println("name2 = " + name2);
		
		// sort employee on salary in descending order and then in ascending order with age and then get name
		
		String name3 = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getAge))
				.skip(1)
				.findFirst()
				.map(Employee::getFirstName).get();

		System.out.println("name3 = " + name3);
		
		Map<String, Optional<Employee>> map2 = employees.stream()
	               .collect(Collectors.groupingBy(Employee::getDepartment,
	            		   							Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)))
	            		   					
	                                       ));
		
		List<Object> list = map.values().stream().collect(Collectors.toList());
		

		
//		List<Employee> list1 = map.values().stream().collect(Collectors.toList());
//		
//		Map<Object, Object> myMap = list1.stream().collect(Collectors.toMap(Employee::getFirstName, Employee::getSalary));

		Comparator<Employee> firstNameComparator = Comparator.comparing(Employee::getFirstName);

	//	Comparator<Employee> fullNameComparator = Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName);
		//Creating Comparators
		Comparator<Employee> fullNameAndAgeComparator = Comparator.comparing(Employee::getFirstName)
																	.thenComparing(Employee::getLastName)
																	.thenComparing(Employee::getAge, Comparator.reverseOrder());
		
		Comparator<Employee> fullNameComparator = Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName);
		
		// Using Comparators in streams
		List<Employee> sortedbyFirstName = employees.stream().sorted(firstNameComparator)
				.collect(Collectors.toList());

		System.out.println(sortedbyFirstName);

		List<Employee> sortedByFullName = employees.stream().sorted(fullNameComparator)
				.collect(Collectors.toList());

		System.out.println(sortedByFullName);

		List<Employee> sortedByFullNameAndAgeInReverse = employees.stream().sorted(fullNameAndAgeComparator)
				.collect(Collectors.toList());
		
		System.out.println(sortedByFullNameAndAgeInReverse);
		
		


	//	System.out.println(sortedByFullNameAndAgeInReverse);

	}

}
