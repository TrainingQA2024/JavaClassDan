package collection;

import java.util.Stack;

public class StackDemo {
	
	/*
	
	Stack is a legacy class.
	LIFO - Container or Box / close from a side
	FIFO - Pipe - Queue - open from both side.
	
	Stack Constructor- default
	
	Properties
	1. Stack has been designed on LIFO basis by default.
	2. It is an index-based data structure.
	
	Methods
	Push() - replacement of add()
	pop() - to remove()
	Peak() - to show top element
	Search(Object) - find out from the list
	Empty() - to check whether empty or not.
	

	 * */
	
	public static void main(String[] args) {
/*		Stack<Object> s= new Stack<Object>();
		s.push("Hindi");
		s.push("English");
		s.push("Math");
		s.add("Science");
//		s.remove("Hindi");
		System.out.println(s.search("Hindi"));
//		System.out.println(s.peek());
//		s.pop();//pick the top book
//		System.out.println(s.peek());
		System.out.println(s);*/
		
	//undo-redo
/*		
		Stack<String> undo = new Stack<String>();
		Stack<String> redo = new Stack<String>();
		
		undo.push("Hindi");
		undo.push("Urdu");
		undo.push("English");
		
		System.out.println("Undo: "+undo);
//		System.out.println(undo.pop());
		
		while(!undo.empty()) {//
			redo.push(undo.pop());
		}
//		redo.push(undo.pop());
//		redo.push(undo.pop());
		System.out.println("Redo:"+redo);
		System.out.println("Undo: "+undo);
		
		while(!redo.empty()) {//
			undo.push(redo.pop());
		}
		System.out.println("Redo:"+redo);
		System.out.println("Undo: "+undo);*/
		
		//reverse string
		
		String input = "Maths";
		Stack<Character> stack = new Stack<Character>();
		for(char ch:input.toCharArray()) {
			stack.push(ch);
		}
//		StringBuilder reversed = new StringBuilder();
		String reversed="";
		while(!stack.isEmpty()) {
			reversed= reversed+stack.pop(); 
		}
		
		System.out.println(reversed);
	}

}
