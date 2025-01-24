package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	/*

		Map - Interface
		Java.util.Map 
		Key-value
		Key-Unique
		
		HashMap - It is a class.We use it when we need fast data retrieval.
		
		Properties
		1. HashMap has unique keys.
		2. It might have duplicate values.
		3. It allows single null value in key but duplicate null values in value
		4. No order guarantee.
		5. No thread safe
		6. Underlying data structure is HashTable
		7. It has 16 initial capacity and 0.75 loading factor by default
		
		
		
		Constructors
		1. default - no argument
		2. new HashMap<String, Integer>(50);//CAPACITY - Int
		3. new HashMap<String, Integer>(Capacity, loading factor);
		4. new HashMap<String, Integer>(Map);
		
		pair of key-value is called entry
	 * */
	
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Maths", 45);
		map.put("English", 70);
		map.put("Science", 70);
		map.put(null, null);
		map.put("Home Science", null);		
		System.out.println(map);
		
//		HashMap<String, Integer> map2 = new HashMap<String, Integer>(map);
//		System.out.println(map2);
		
/*		for(Entry<String, Integer> entry:map.entrySet()) {//entry = Value=>Key
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
			System.out.println(entry.getValue()+"=>"+entry.getKey());			
		}

		
		for(String key:map.keySet()) {
			System.out.println(map.get(key)+"=>"+key);
		}
		
	
		
			Iterator<Entry <String, Integer>> it= map.entrySet().iterator();
			
			while(it.hasNext()) {
				Entry<String,Integer> entry= it.next();
				System.out.println(entry.getKey()+": "+entry.getValue());
			}
*/		
		
		
		System.out.println(map.get("English"));
		map.remove(null);
		System.out.println(map);
//		System.out.println(map.containsKey("English"));
//		System.out.println(map.containsValue(78));
		
//		System.out.println(map.getOrDefault("English1", 100));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.size());
		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());
	}
	
//Hi Danish this is Danish
}
