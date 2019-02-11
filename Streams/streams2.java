package com.epam.streams;

import java.util.Arrays;
import java.util.List;

public class streams2 {
	
	public static void main(String[] args) {
		List<String> al = Arrays.asList("10","20","30","40","50");
		
		System.out.println(al.getClass().getName());
		System.out.println("finding first");
		System.out.println(al.stream().findFirst());
		System.out.println("finding any");
		System.out.println(al.stream().findAny());
		System.out.println("map function converting to integer and adding \"2\" to each number");
		al.stream().map(Integer::parseInt).map(p->p+2).forEach(System.out::println);
		System.out.println("using reduce function to sum the stream elements");
		System.out.println(al.stream().map(Integer::parseInt).reduce((a,b)->a+b));
		System.out.println("sequential ");
		al.stream().sequential().forEach(System.out::println);
		System.out.println("reduce with method reference to sum the stream");
		System.out.println(al.stream().map(Integer::parseInt).reduce(0,Integer::sum));
		
	
	}

}
