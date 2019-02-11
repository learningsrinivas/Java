package com.epam.streams;

import java.util.Arrays;
import java.util.List;

public class streams3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
			System.out.println("printing even numbers");
			l.stream().filter(e -> e % 2 ==0).forEach(System.out::println);
			System.out.println("double the even the numbers and total them");
			System.out.println(l.stream().filter(e -> e %2 == 0).map(e -> e * 2).reduce(Integer::sum));
			System.out.println(l.stream().filter(e -> e %2 == 0).map(e -> e * 2).reduce(0,Integer::sum));
			System.out.println(l.stream().filter(e -> e %2 == 0).mapToInt(e -> e * 2).sum());
			System.out.println(l.stream().filter(e -> e %2 == 0).mapToInt(e -> e * 2).sum());
			
			System.out.println("no gurantee for the type of output in streams");
			System.out.println("input type is integer but output is double");
			l.stream().map(e-> e*2.0).forEach(System.out::println);
			
			System.out.println("filtering even numbers and then doubling the numbers and converting to double and adding them");
			System.out.println(l.stream().filter(e -> e %2 == 0).map(e -> e * 2.0).reduce(0.0,(a,b)->a+b));
			
			System.out.println(l.stream().filter(e -> e %2 == 0).mapToDouble(e -> e * 2.0).reduce(0.0,(a,b)->a+b));
			System.out.println(l.stream().filter(e -> e %2 == 0).mapToDouble(e -> e).reduce(0.0,(a,b)->a+b));
			System.out.println(l.stream().filter(e -> e %2 == 0).mapToInt(e -> e * 2).sum());
			System.out.println(l.stream().filter(e -> e %2 == 0).mapToDouble(e -> e * 2).sum());
	}

}
