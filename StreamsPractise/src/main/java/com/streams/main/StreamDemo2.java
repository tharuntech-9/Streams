package com.streams.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class StreamDemo2 {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("e");
		List<String> collect = arrayList.stream().filter(l -> l.equals("D")).collect(Collectors.toList());
		String b = collect.remove(0);
		System.out.println(b);
		
		System.out.println("\n");
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(110);
		numbers.add(120);
		numbers.add(150);

		List<Integer> newlist = numbers.stream().filter(n -> n > 110).collect(Collectors.toList());
		System.out.println(newlist);
		System.out.println("\n");
		Vector<Integer> integers = new Vector<>();
		for (int i = 0; i <= 10; i++) {
			integers.addElement(i);
		}

		integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()).forEach(x -> System.out.println(x));
		
		System.out.println("\n" + "multiplication of numbers ");
		
		List<Integer> list = Arrays.asList(12, 45, 67, 19, 87, 2, 9);
		list.stream().map(number -> number * 2).forEach(System.out::println);
		
		System.out.println("\n"+ "iterator -> foreachremaining():");
		
		list.stream().filter(x -> x > 10).iterator().forEachRemaining(x -> System.out.println(x));
		
		System.out.println("\n" + "spliterator -> foreachremaining():");
		arrayList.stream().map(x -> x .concat("09")).spliterator().forEachRemaining(x -> System.out.println(x));
	}
}
