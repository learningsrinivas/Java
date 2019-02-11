package com.epam.practise.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;                                                              
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumer {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",60),
				new Person("Charlotte","Bronte",60),
				new Person("Mathew","Arnold",60));
		
			Collections.sort(persons,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
			
			
			
			System.out.println("All Persons without any condition");
			performConditionally(persons,p->true,p -> System.out.println(p));
		
			
			 
			System.out.println("Persons last name starting with C");
			performConditionally(persons,p->p.getLastName().startsWith("C"),p -> System.out.println(p.getFirstName()));
		
			System.out.println("Persons first name starting with C");
				performConditionally(persons,p->p.getFirstName().startsWith("C"),p -> System.out.println(p.getLastName()));
		
	}


	private static void performConditionally(List<Person> persons, Predicate<Person> predicate,Consumer<Person> consumer) {
		// TODO Auto-generated method stub
		for(Person p : persons) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
		
	}
}