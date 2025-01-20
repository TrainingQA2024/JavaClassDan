package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	
	/*
	Set Interface - It only allows unique values or it does not allow duplicate values.
	to store Unique elements.
	It does not have indexing

	Classes of Set
	1. HashSet
	2. LinkedHashSet
	3. TreeSet
	
	HashSet : It implements set interface. It stores unique elements. It follows hashing mechanism.It does not maintain any order
	
	Properties of HashSet
	1. Duplicate values not allowed
	2. Single null value can be stored only.
	3. Unordered collection
	4. Thread safety is not guaranteed
	5. Default capacity - 16 buckets
	6. Loading factor 75% - it doubles its size 0.75
	
	Constructor
	1. Default - capacity 16, loading factor 0.75
	2. HashSet(int Capacity);
	3. HashSet (int Capacity, float loadingFactor);
	4. HashSet(Collection);

	 * */
	
	public static void main(String[] args) {
		/*
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		HashSet <Integer>set = new HashSet<Integer>(list);
		set.add(45);
		set.add(67);
		set.add(23);
		set.add(null);
		set.add(45);
		set.add(null);
		
		System.out.println(set);
		set.remove(45);
		System.out.println(set);*/
		//find unique values
		int[] num= {1,2,3,1,4,5,45,34,34,23,35,56,745,34,34};
		HashSet<Integer> unique= new HashSet<Integer>();
		for(int x:num) {
			unique.add(x);
		}
		
		System.out.println(unique);
		
		//find common values from 2 arrays
		int[] num1= {1,2,3,4,5,6,7,8};//set1
		int[] num2= {3,4,5,6,9,10};
		
		LinkedHashSet<Integer> set1= new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> common= new LinkedHashSet<Integer>();
		for(int x:num1) {
			set1.add(x);
		}
		for(int x:num2) {
			if(set1.contains(x)) {
				common.add(x);
			}
		}
		
		System.out.println(common);
	}

}
