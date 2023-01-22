package com.streams.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
 public static void main(String[] args) {
	List<Employee> employees=new ArrayList<Employee>();
	employees.add(new Employee(1, 50000));
	employees.add(new Employee(2, 60000));
	employees.add(new Employee(3, 45000));
	
	List<Employee> collect = employees.stream().sorted((s1,s2) -> s2.getSalary()-s1.getSalary()).collect(Collectors.toList());
	collect.forEach(s -> System.out.println(s));
}
}
