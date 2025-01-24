package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {

	/*
		TreeSet = It inherits set interface -> NavigableSet and SortedSet. it saves unique in sorting order
		By default - ascending order
		It doesn't allow duplicate elements.
		
		Red-Black Tree underline data structure

		Properties
		1. It stores data in sorting order.
		2. It stores unique values
		3. It does not allow null value.
		4. not thread-safe/not synchronized

		
		Constructor
		1. default
		2. TreeSet(Comparator)
		3. TreeSet(Collection)
		4. TreeSet(SortedSet)
	 * */
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(45);
		set.add(67);
		set.add(23);
		set.add(89);
		set.add(15);
		set.add(41);
		System.out.println("TreeSet"+set);
		
//		System.out.println("Higher: "+set.higher(67));
//		System.out.println("Lower: "+set.lower(67));
//		System.out.println("Ceiling: "+set.ceiling(67));
//		System.out.println("Floor: "+set.floor(66));
		

//		System.out.println(set.pollFirst());
//		System.out.println(set);
//		System.out.println(set.pollLast());
//		System.out.println(set);
		
//		System.out.println(set.headSet(67));
//		System.out.println(set.tailSet(67));
		
//		System.out.println(set.subSet(20, 50));
		
		ArrayList<Integer> num= new ArrayList<Integer>(set);
		System.out.println("ArrayList: "+set);
		
		Collections.reverse(num);
		System.out.println("Reversed: "+num);
		
		
		
/*		TreeSet<String> names = new TreeSet<String>(Collections.reverseOrder());
		names.add("Ajeet");
		names.add("ajeet");
		names.add("Agarkar");
		names.add("Sunil");
		names.add("sunil");
		names.add("Sachin");
//		names.add(null);
		
		System.out.println(names);
		System.out.println(names.first());
		System.out.println(names.last());
		
*/		
	}
}
