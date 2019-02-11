package com.epam.practise.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExerciseSolution8Lamda {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",60),
				new Person("Charlotte","Bronte",60),
				new Person("Mathew","Arnold",60));
		
			System.out.println("Persons sorted by lastname");
			printConditionally(persons,(p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
				
			
			System.out.println("Persons sorted by first name");
			printConditionally(persons,(p1,p2)->p1.getFirstName().compareTo(p2.getFirstName()));
			
			
			System.out.println("Persons sorted by age");
			printConditionally(persons,(p1,p2)->{
				if(p1.getAge()>p2.getAge())
					return 1;
				else if(p1.getAge()==p2.getAge())
					return 0;
				else return -1;
			});
				
			
			printConditionally(persons,new Comparator<Person>() {
				public int compare(Person o1,Person o2) {
					return o1.getLastName().compareTo(o2.getLastName());
			}
				
       });
	}		


	private static void printConditionally(List<Person> persons, Comparator<Person> comparator) {
		
		Collections.sort(persons,comparator);
		System.out.println(persons);
	}
}
