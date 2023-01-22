package com.streams.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ShortCircuitOperations {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("tharun tharun");
		list.add("prakash");
		list.add("tharun kumar");
		list.add("srinivas");
		list.add("tharun raju");
		list.add("tharun");

		String string = list.stream().findFirst().get();
		System.out.println(string);

		Optional<String> findAny = list.stream().findAny();
		System.out.println(findAny);

		boolean allMatch = list.stream().allMatch(s -> s.contains("tharun"));
		System.out.println("allmatch() :" + allMatch);

		boolean anyMatch = list.stream().anyMatch(s -> s.contains("tharun"));
		System.out.println("anymatch() :" + anyMatch);

		boolean noneMatch = list.stream().noneMatch(s -> s.contains("pavan"));
		System.out.println("nonematch() : " + noneMatch);

		boolean anyMatch2 = list.stream().limit(4).anyMatch(t -> t.contains("srini"));
		System.out.println("anymatch(): " + anyMatch2);

		List<Integer> myList = Arrays.asList(10, 15, 25, 35, 25, 98, 12);
		myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		System.out.println("finding first element ------- ");

		List<Integer> myList2 = Arrays.asList(9, 18, 8, 29, 97, 98, 98);
		myList2.stream().findFirst().ifPresent(System.out::println);

	}
}
