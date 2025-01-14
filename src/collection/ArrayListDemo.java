package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		/*		ArrayList list= new ArrayList();

		list.add(45);
		list.add(45.6);
		list.add("String");
		System.out.println(list);
		list.add(2,50);

//		list.remove("String");
		list.remove(3);
		System.out.println(list);		
		ArrayList list2= new ArrayList();
		list2.add(67);
		list2.addAll(list);
		System.out.println(list2);
		list2.removeAll(list);

		list2.set(0, 76);

//		list2.clear();
		System.out.println(list2.size());
		System.out.println(list2.isEmpty());

//		list.addFirst(90);
		list.addLast(80);
		System.out.println(list);
		 */
		//mandatory							not mandatory
		ArrayList <Object>list= new ArrayList<Object>();
		list.add("Alpha");
		list.add("Beta");
		list.add(5);
		list.add(456.54);

		ArrayList <Integer> newList= new ArrayList<Integer>(34);//10 - initial capacity
		newList.add(45);
		newList.add(178);
		newList.add(15);
		newList.add(null);
		newList.add(null);
		System.out.println(newList);
//iteration 1
//		for(Integer x:newList) {//Condition - (DataType x:newList)
//			System.out.println(x);
//		}
		
//Iteration 2
//		for(int i=0;i<newList.size();i++) {
//			System.out.println(newList.get(i));//array[i]
//		}
		
		//Iterator 3
		
		Iterator<Integer> i= newList.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}		
	}
}
