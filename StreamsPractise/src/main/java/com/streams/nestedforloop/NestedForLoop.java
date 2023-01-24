package com.streams.nestedforloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NestedForLoop {
	public static void main(String[] args) {

		List<List<String>> lists = new ArrayList<>();
		List<String> strings = new ArrayList<String>();
		strings.add("1 2");
		strings.add("3 4");
		lists.add(strings);

		for (List<String> list9 : lists) {
			for (String string : list9) {
				for (String stringElement : string.split(" ")) {
					List<String> newelement = new ArrayList<String>();
					boolean add = newelement.add(stringElement);
					System.out.println(add);
				}
			}

			lists.stream().map(
					l -> l.stream().flatMap(string -> Arrays.stream(string.split(" "))).collect(Collectors.toList()))
					.forEach(x -> System.out.println(x));
		}
	}
}