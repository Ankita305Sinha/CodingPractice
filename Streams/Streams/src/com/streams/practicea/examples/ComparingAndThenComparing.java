package com.streams.practicea.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

///Read more: https://javarevisited.blogspot.com/2021/09/comparator-comparing-thenComparing-example-java-.html#ixzz8X1jOtd1B	

public class ComparingAndThenComparing {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();

		books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY, 200));
		books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL, 300));
		books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER, 400));
		books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY, 100));
		books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY, 250));
		books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL, 340));
		books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL, 260));

		// sort the list of books by authors again but this time using
		// Comparator.comparing()

	// Sort Using Collectios.sort() method
		List<Book> newList = new ArrayList<>(books);
		newList.sort(Comparator.comparing((Book b) -> b.getAuthor()));

		System.out.println("list of books after sorting using comparing() method: " + books);

		// OR
		List<Book> newList1 = new ArrayList<>(books);
		newList1.sort(Comparator.comparing(Book::getAuthor)); // using method reference

		List<Book> newList2 = new ArrayList<>(books);
		newList2.sort(Comparator.comparing((Book b) -> b.getAuthor())
								.thenComparing((Book b) -> b.getPrice()));

		ArrayList<Student> listOfStudents = new ArrayList<>();
		listOfStudents.add(new Student("Lokesh", "Gupta", 21));
		listOfStudents.add(new Student("Alex", "Gussin", 11));
		listOfStudents.add(new Student("Brian", "Sux", 41));
		listOfStudents.add(new Student("Neon", "Piper", 51));
		listOfStudents.add(new Student("David", "Beckham", 31));
		listOfStudents.add(new Student("Alex", "Beckham", 71));
		listOfStudents.add(new Student("Brian", "Suxena", 61));

		// to use multiple comparators in Streams first creater the comparator that we need and 
		// then add the comparator in the sorted(<comparator>) method

		Comparator<Student> firstNameComparator = Comparator.comparing(Student::getFirstName);

		Comparator<Student> fullNameComparator = Comparator.comparing(Student::getFirstName)
															.thenComparing(Student::getLastName);
		//Creating Comparators
		Comparator<Student> fullNameAndAgeComparator = Comparator.comparing(Student::getFirstName)
															.thenComparing(Student::getLastName)
															.thenComparing(Student::getAge, Comparator.reverseOrder());
		
		Comparator<Student> firstNameAndAgeComparator = Comparator.comparing(Student::getFirstName)
															.thenComparing(Student::getAge, Comparator.reverseOrder());
		
		// Using Comparators in streams
		List<Student> sortedbyFirstName = listOfStudents.stream().sorted(firstNameComparator)
				.collect(Collectors.toList());
		
		List<Student> sortedbyFirstName2 = listOfStudents.stream()
														 .sorted(Comparator.comparing(Student::getFirstName)
																 .thenComparing(Student::getLastName)
																 .thenComparing(Student::getAge, Comparator.reverseOrder()))
														  .collect(Collectors.toList());

		System.out.println(sortedbyFirstName);

		List<Student> sortedByFullName = listOfStudents.stream().sorted(fullNameComparator)
				.collect(Collectors.toList());

		System.out.println(sortedByFullName);

		List<Student> sortedByFullNameAndAgeInReverse = listOfStudents.stream().sorted(fullNameAndAgeComparator)
				.collect(Collectors.toList());

		System.out.println(sortedByFullNameAndAgeInReverse);

	}

}
