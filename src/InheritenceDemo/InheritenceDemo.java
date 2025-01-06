package InheritenceDemo;

public class InheritenceDemo extends parent{
	
	/*
	 Parent/Super	- variable, methods - extends
	 Child/Subclass	- 	
	 
	  Types of Inheritance
	  1. Single level Inheritance - Parent->Child
	  2. Multi-level Inheritance - GrandParent>Parent->Child
	  3. Hierarchical Inheritance->parent>child1, parent>child2
	  4. Multiple level Inheritance - not possible with class in java
	  5. Hybrid Inheritance - 
	  
	  GrandParent>Parent>childa, childb
	 * */

	public static void main(String[] args) {
		InheritenceDemo ob= new InheritenceDemo();
		System.out.println(ob.x);
		ob.test1();
		ob.gp();
	}	
}

class parent extends GrandParent{
	int x=10;
	public void test1() {
		System.out.println("I am in parent class");
	}
}

class GrandParent{
	public void gp() {
		System.out.println("I am grand parent");
	}
}