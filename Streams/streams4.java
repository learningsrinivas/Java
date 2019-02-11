package com.epam.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class streams4 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,1,2,3,4,5);
		
		List<Integer> doubleOfEven = l.stream().filter(e -> e % 2 == 0).map(e -> e * 2).collect(toList());
		System.out.println(doubleOfEven);
		
		
		Set<Integer> doubleOfEvenSet = l.stream().filter(e -> e % 2 == 0).map(e -> e * 2).collect(toSet());
		System.out.println(doubleOfEvenSet);
		
		Set<Integer> temp = l.stream().filter(e->e%2==0).map(e -> e * 2).collect(toSet());
		System.out.println(temp);
		
	}

}
