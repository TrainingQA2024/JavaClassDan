package abstractions;

public class InterfaceDemo {
	/*
	 
	 Through Interface we can achieve 100% abstraction.
	 
	 regulatory - bill format - same - awn#, gst#, licence#
	 dtdc, firstflight, delhivery 
	 
	 1. Multiple Inheritance - 
	 class to class - extends
	 class to interface - implements
	 interface to interface - extends
	 
	 2. Contract-based design
	 3. decoupling/loose coupling- tight coupling
	 
	 Feature
	 1. All methods in interface are by default public and abstract.
	 2. All instance variables are constants in interface by default. public static final
	 3. Upto java 7 - you can not make any concrete method in interface but after java 8 we can create default and static concrete method
	 4. Constructor not allowed.
	 5. Supports multiple inheritance
	 
	  
	  													Interface vs 				Abstract class
	  1. Methods - Abstract+concrete after java 8, default and static method only - abstract + concrete  
	  2. Instance variable - 					not allowed (only constant allowed) - allowed
	  3. Constructor 							not allowed							- allowed
	  4. Inheritance							multiple inheritance				- 	single level inheritance
	   	
	 * */
	public static void main(String[] args) {
		
	}

}

interface parent1{	
	int num=45;//public ,static, final
	void method1();//public, abstract
	default void method2(){
		
	}
}

interface parent2{
	
}

class child implements parent1,parent2{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}
