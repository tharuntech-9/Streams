package com.streams.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("java");
		list.add("c");
		list.add("c++");
		list.add(".net");

		List<String> collect = list.stream().filter(l -> l.length() < 4).collect(Collectors.toList());
		System.out.println("Based on length : " + collect);

		List<String> list2 = list.stream().filter(l -> l.equals(".net")).collect(Collectors.toList());
		System.out.println(list2.remove(0));
		System.out.println(list2);

		boolean replaceAll = Collections.replaceAll(list, "java", "object oriented programming language");
		System.out.println(replaceAll);
		System.out.println(list);

		System.out.println("----------------------");
		List<String> str = Arrays.asList("durga", "software", "solutions", "durga");
		str.stream().forEach(System.out::println);

		System.out.println("----------------------");

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		myList.stream().sorted().forEach(System.out::println);

		myList.stream().iterator().forEachRemaining(x -> System.out.println("iterator " + x));
		
		boolean removeIf = list.removeIf(x -> list.contains(".net"));
		// myList.forEach(x->System.out.println(x));
		System.out.println(removeIf);
		System.out.println(list);
		
		
		
		
		
		    
	}
	}


