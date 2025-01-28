package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaCollections {

	/*
		It is a class which has static methods which are used as a utility.
		Java.util

		Collections vs collection
		1. Collection is an interface which represent List, set and queue
		2.Collections is a utility class which as static methods which are used to provide help to collection
	 * */

	public static void main(String[] args) {
		/*
		List<String> name = new ArrayList<String>();
		name.add("Aman");
		name.add("Chaman");
		name.add("Raman");
		name.add("Chaman");
		Collections.sort(name);
		System.out.println(name);

		Collections.sort(name,Collections.reverseOrder());
		System.out.println(name);*/

		/*
		List<Integer> numbers= new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			numbers.add((int)(Math.random()*10));
		}
		System.out.println("Before Shuffle: "+numbers);
		Collections.shuffle(numbers);
		System.out.println("After shuffle: "+numbers);
		System.out.println(numbers.get((int)(Math.random()*10)));*/
/*
		List<Integer> numbers= new ArrayList<Integer>();
		numbers.add(34);
		numbers.add(17);
		numbers.add(23);
		numbers.add(76);

//		Collections.sort(numbers);
//		
//		int index= Collections.binarySearch(numbers, 23);
//		System.out.println(index);
		
		System.out.println("Max: "+Collections.max(numbers));
		System.out.println("Min: "+Collections.min(numbers));*/
	/*	
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Potato");		
		
		int count= Collections.frequency(fruits, "Orange");
		System.out.println(count);
		
		List<String> veggies = new ArrayList<String>();
		
		veggies.add("Potato");
		veggies.add("Tomato");
		veggies.add("Chilli");			
		Collections.addAll(veggies, "Brinjal","Cabbage", "Beat Root");
		System.out.println(veggies);
		System.out.println(fruits);
		
		System.out.println(Collections.disjoint(fruits, veggies));*/
		
//		List<Integer> numbers= new ArrayList<Integer>();
//		numbers.add(1);
//		numbers.add(2);
//		numbers.add(3);
//		numbers.add(4);
//		
//		System.out.println(numbers);
//		Collections.rotate(numbers, 2);
//		System.out.println(numbers);
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Potato");		
		Collections.replaceAll(fruits, "Apple", "Mango");		
		System.out.println(fruits);				
	}



}
