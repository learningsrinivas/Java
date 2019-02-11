package com.epam.practise.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExerciseSolution {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",60),
				new Person("Charlotte","Bronte",60),
				new Person("Mathew","Arnold",60));
		
		persons.forEach(p->System.out.println(p));
		persons.forEach(System.out::println);
		
			Collections.sort(persons,new Comparator<Person>() {

				public int compare(Person o1, Person o2) {
					// TODO Auto-generated method stub
					return o1.getLastName().compareTo(o2.getLastName());
				}
				
			});
				
			System.out.println("All Persons without any condition");
			printConditionally(persons,new Condition() {
				public boolean test(Person p) {
					return true;
				}
			});
			
			
			System.out.println("Persons last name starting with C");
			printConditionally(persons,new Condition() {
				
				public boolean test(Person p) {
					 return p.getLastName().startsWith("C");
				}
			});
				
			System.out.println("Persons first name starting with C");
				printConditionally(persons,new Condition() {
					public boolean test(Person p) { 
						return p.getFirstName().startsWith("C");
					}
				});
				
				System.out.println("persons sorting according to last name");
				printConditonally(persons,new Comparator<Person>() {
					
					@Override
					public int compare(Person arg0, Person arg1) {
						return arg0.getLastName().compareTo(arg1.getLastName());
					}
				});
				
				System.out.println("persons sorted according to first name ");
				
				printConditonally(persons,new Comparator<Person>() {
					
					@Override
					public int compare(Person arg0, Person arg1) {
						return arg0.getFirstName().compareTo(arg1.getFirstName());
					}
				});
				
				System.out.println("persons sorted according to age");
				
          printConditonally(persons,new Comparator<Person>() {
					
					@Override
					public int compare(Person arg0, Person arg1) {
						if(arg0.getAge()>arg1.getAge())
							return 1;
						else if(arg0.getAge()==arg1.getAge())
							return 0;
						else return -1;
					
					}
});	
		
	}

	private static void printConditonally(List<Person> persons, Comparator comparator) {
		// TODO Auto-generated method stub
		
		Collections.sort(persons,comparator);
		System.out.println(persons);
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

interface Condition {
	public boolean test(Person p);
}