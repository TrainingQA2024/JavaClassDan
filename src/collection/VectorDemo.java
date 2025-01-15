package collection;

import java.util.Vector;

public class VectorDemo {

	/*
	Vector is a legacy class. JDK1.0 - Vector, Stack, Hashtable
	JDK1.2- Collection Framework - Modification -> legacy class
	
	All legacy classes are synchronized.
	Package - Java.util
	
	Vector - Properties
	
	1. Vector is an index-based data structure.
	2. It can store heterogeneous data
	3. It allows duplicate value.
	4. It follows Insertion order.
	5. We can store multiple null values.
	6. Vector is synchronized/Thread-safe.
	
	ArrayList vs Vector
	1. ArrayList was introduced in JDK1.2 but vector was introduced in JDK1.0
	2. ArrayList is not a legacy class but Vector is a legacy class.
	3. ArrayList is not thread-safe/synchronized but Vector is thread-safe/synchronized.
	4. In case of speed, ArrayList is faster than vector.
	5. ArrayList does not guarantee for data accuracy but Vector does.
	6. ArrayList increases its capacity new capacity = (Old Capacity x 3/2)+1 but Vector increases its capacity 2X.
	7. ArrayList does not provide any method to find the capacity but Vector does.
	
	addElement(Object obj) - add object
	firstElement()

	 * */
	
	public static void main(String[] args) {
/*		Vector v= new Vector();
		v.addElement(2);
		v.addElement(15);
		v.addElement(75);
		v.addElement(60);
		v.addElement(2);
		v.addElement(15);
		v.addElement(75);
		v.addElement(60);
		v.addElement(2);
		v.addElement(15);
		v.addElement(75);
//		System.out.println(v.firstElement());
//		System.out.println(v.lastElement());
//		v.removeElement(45);
		System.out.println(v.indexOf(2));
		v.remove(v.indexOf(2));
		v.setElementAt(34, 3);
		System.out.println(v);
		System.out.println(v.capacity());
*/	
	Vector<String> students= new Vector<String>();
	students.add("Aman");
	students.add("Rahul");
	students.add("Danish");
	
	System.out.println(students);
	
	students.addElement("Tariq");
	students.addElement("Tarun");
	System.out.println(students);
	
	students.remove("Rahul");
	
//	System.out.println(students.contains("Rahul"));
	if(students.contains("Rahul")) {
		System.out.println("Student is available in class");
	}else {
		System.out.println("Student is unavailable in class");
	}
	
	System.out.println(students.size());
	}
	
	/*
	Shopping cart
	Add items - print added items
	Remove any item - check if item exist or not
	print Available items
	
	 * */
}
