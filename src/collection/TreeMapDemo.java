package collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	/*
		Map Interface 
		Red-Black Tree - data structure
		
		Properties
		1. Sorting order maintain - ascending (Key, value)-Key-based sorting - ascending order default
		2. It has unique keys
		3. It does not allow null value in key
		4. It allows null values in Value
		5. not thread safe/not synchronized
		
		
		Constructor
		1. Default
		2. new TreeMap(Comparator)
		3. new TreeMap(Map)	
		
		
	
	 * */
	
	public static void main(String[] args) {
		
/*		TreeMap<Integer, String> map = new TreeMap();//Comparator.reverseOrder()
		map.put(3,"Three");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(4, null);
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		System.out.println(map);
		System.out.println(map.get(4));
		System.out.println(map.remove(3));//return value in string and remove
		System.out.println("After removal 3: "+map);
//		System.out.println(map.firstKey()+":"+map.get(map.firstKey()));
//		System.out.println(map.firstEntry());
		System.out.println(map.lastKey());
		System.out.println(map.lastEntry());

//		System.out.println(map.subMap(4, 8));
		System.out.println(map.headMap(5));
		System.out.println(map.tailMap(5));		
*/
		
		//marks - name
		
		//descending order - name marks
		
		TreeMap<Integer, String> studentsMarks = new TreeMap<Integer, String>(Comparator.reverseOrder());
		studentsMarks.put(85, "Jatin");
		studentsMarks.put(95, "Rohit");
		studentsMarks.put(87, "Sachin");
		studentsMarks.put(75, "Virat");
		
		System.out.println(studentsMarks);
		
		for(Map.Entry<Integer, String> entry:studentsMarks.entrySet()) {
			System.out.println(entry.getValue()+": "+entry.getKey());
		}
		
		System.out.println(studentsMarks.headMap(80));
		
	}

}
