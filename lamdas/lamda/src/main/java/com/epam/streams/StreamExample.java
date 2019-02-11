package com.epam.streams;

import java.util.Arrays;
import java.util.List;

import com.epam.practise.lamda.Person;

public class StreamExample {
	public static void main(String[] args) {
	
	List<Person> persons = Arrays.asList(new Person("Charles","Dickens",60),
			new Person("Lewis","Carroll",60),
			new Person("Charlotte","Bronte",60),
			new Person("Mathew","Arnold",60),
			new Person("Srinivas","Chintakindhi",23));

	long count = persons.stream().filter(p->p.getLastName().startsWith("C")).count();
	
	System.out.println("No of persons whose last name starting with C : "+count);
}

}