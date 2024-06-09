package com.streams.practiceb.examples;

import java.util.Arrays;
import java.util.Objects;

public class Employee { 
	
	private String firstName; 
	private String lastName; 
	private int age;
	private String department; 
	private long salary;
	private int bonus;
	
	public Employee(String firstName, String lastName, int age, String department, long salary, int bonus) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.bonus = bonus;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", department="
				+ department + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, department, firstName, lastName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(department, other.department)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& salary == other.salary;
	}
	
	// Present in Java In Object Class - Java.Lang, java.util
	 public static int hash(Object... values) {
	        return Arrays.hashCode(values);
	    }
	
	// Present in Java In Array Class - Java.Lang, java.util
	public static int hashCode(Object[] a) {
        if (a == null)
            return 0;

        int result = 1;

        for (Object element : a)
            result = 31 * result + (element == null ? 0 : element.hashCode());

        return result;
    }
	
	

}
