package com.streams.beans;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,40,50,60,10,30,59,60);
		Set<Integer> set=new HashSet<>();
		Set<Integer> collect = list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet());
		collect.forEach(x->System.out.println(x));
		
		String string="welcome to my home , and thanks for coming to my home";
		List<String> list2=Arrays.asList(string.split(" "));
		Map<String, Long> collect2 = list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect2);
	}
}
