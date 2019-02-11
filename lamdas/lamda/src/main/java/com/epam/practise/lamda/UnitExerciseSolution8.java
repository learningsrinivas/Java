package com.epam.practise.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExerciseSolution8 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",60),
				new Person("Charlotte","Bronte",60),
				new Person("Mathew","Arnold",60));
		
			Collections.sort(persons,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
			
			
			
			System.out.println("All Persons without any condition");
			printConditionally(persons,p->true);
		
			
			
			System.out.println("Persons last name starting with C");
			printConditionally(persons,p->p.getLastName().startsWith("C"));
		
			System.out.println("Persons first name starting with C");
				printConditionally(persons,p->p.getFirstName().startsWith("C"));
					
	}


	private static void printConditionally(List<Person> persons, Condition condition) {
		// TODO Auto-generated method stub
		for(Person p : persons) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
		
	}
}