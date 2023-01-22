package com.streams.main;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		set.add(2);
		set.add(4);
		set.add(6);
		set.add(8);
		set.add(10);
		set.add(12);

		set.stream().forEach(elem -> System.out.print(elem + " "));
		System.out.println(" \n ");
		Stream<String> stream = Stream.of("a", "b", "c", "d");

		Set<String> set1 = stream.collect(Collectors.toSet());
		set1.forEach(a -> System.out.print(a));
		System.out.println(" \n ");
		
		TreeSet<String> myTreeSet = Stream.of("c", "java", ".net", "python").collect(Collectors.toCollection(TreeSet::new));
		System.out.println(myTreeSet);

	}
}
