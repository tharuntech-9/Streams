package com.streams.main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpecialIteratorDemo {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Tirupati", "vizag", "chittoor", "banglore");
		Spliterator<String> spliterator2 = list.spliterator();

		Stream<String> stream = Stream.of("Tirupati", "vizag", "chittoor", "banglore", "pune", "hyderabad");
		long spliterator = stream.spliterator().estimateSize();

		System.out.println(spliterator);

		List<String> languageList = Arrays.asList("Java", "C", "C++", "Python", ".net");
		Spliterator<String> languageSpliterator = languageList.spliterator();
		Spliterator<String> anotherLanguageSpliterator = languageSpliterator.trySplit();

		System.out.println("From 1st Spliterator");

		languageSpliterator.forEachRemaining(System.out::println);

		System.out.println("From 2nd Spliterator");

		anotherLanguageSpliterator.forEachRemaining(System.out::println);

		List<String> list2 = Arrays.asList("Java", "C", "C++", "Python", ".net");
		Spliterator<String> spliterator3 = list2.spliterator();
		System.out.println(spliterator3.characteristics());


	}
}
