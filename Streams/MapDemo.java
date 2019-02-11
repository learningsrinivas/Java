package com.epam.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Person> people = createPeople();
			Map<String,Person> persons = people.stream().collect(toMap(person  -> person.getName() + "-" + person.getAge(),person -> person));
			System.out.println(persons);
			
			
			
			
			Map<String, List<Integer>> domething = people.stream().collect(groupingBy(Person::getName,mapping(Person::getAge,toList())));
			System.out.println(domething);
//			List<String> names = Arrays.asList("srinivas","pawan kalyan","dhoni","srinivas");
//			names.stream().collect(toMap(groupingBy(Person::getName)));
	}
	
	public static List<Person> createPeople(){
		return Arrays.asList(new Person("srinivas",23,"male"),
							 new Person("surya",22,"male"),
							 new Person("sita",203,"female"),
							 new Person("unknown",23,"dontknow"),
							 new Person("srinivas",22,"male"));
	}

}
