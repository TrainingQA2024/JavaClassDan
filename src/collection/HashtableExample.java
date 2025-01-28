package collection;

import java.util.HashSet;
import java.util.Hashtable;

/*
Properties of Hashtable
1. It is a legacy class
2. This thread safe or synchronized
3. Key is unique but value can be duplicate
4. We can't store null value in either key or value
5. No order guarantee
6. It is slower than HashMap or linkedHashMap


default capacity  = 11 buckets
default loading factor = 0.75
Constructors
default constructor
capacity constructor - new Hashtable(capacity);
capacity and loading factor constructor - new Hashtable(int capacity, float loading factor);
ExistingMap = new Hashtable(map);


 * */

public class HashtableExample {

	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(1, "Apple");
		table.put(2, "Banana");
		System.out.println(table);	
		table.put(3, "Orange");
		table.put(4, "Fig");
		System.out.println(table.containsValue("Mango"));
		
		//task - find occurrence using hastable = "HisaabBaraber"	
		
	}
	
	public synchronized void gettotal() {
		
	}

}
