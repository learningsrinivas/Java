package com.epam.practise.lamda;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	

}
