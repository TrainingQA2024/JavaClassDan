package collection;

import java.util.LinkedList;

public class LinkedListDemo {
	
public static void main(String[] args) {
/*	LinkedList <String>li = new LinkedList<String>();	
	li.add("India");
	li.add("Pakistan");
	li.add("China");
	li.add("Japan");
	li.addFirst("Indonesia");
	
	System.out.println(li);
*/
	
	LinkedList<String> train = new LinkedList<String>();
	train.add("Engine");
	train.add("Sleeper");
	train.add("AC Coach");
	train.add("Canteen");
	train.add("General coach");
	
	System.out.println("Train consists of "+train);
	
	train.addFirst("Luggage coach");
	train.addFirst("Guard coach");
	train.addFirst("General coach");
	
	System.out.println("Updated Train consists of "+train);
	train.remove("AC Coach");
	
	if(train.contains("AC Coach")) {
		System.out.println("AC Coach available");
	}else {
		System.out.println("AC Coach unavailable");
	}
	
	System.out.println(train.getFirst());
	System.out.println(train.getLast());
}

}
