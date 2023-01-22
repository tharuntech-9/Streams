package com.streams.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class peek {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("tharun tharun");
		list.add("prakash");
		list.add("tharun kumar");
		list.add("srinivas");
		list.add("tharun raju");
		list.add("tharun");

		long string = list.stream().filter(l -> l.length()>8).peek(l -> System.out.println("peek element : " + l)).count();
		System.out.println(string);
	}
}
