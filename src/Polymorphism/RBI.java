package Polymorphism;

/*
 * 1. Can we change the method signature while overriding the method in child class - No
 * 2. Can we change the access modifier while overriding the method in child class - Yes but we cannot reduce visibility of access modifier in child class method overriding
 * 		private>default>protected>public
 * 3. Can we change the method return type while overriding the method in the child class? - No - if the return type is primitive data type;(Primitive data type - int, long, short, double, float, boolean....)
 * int,boolean,long, short, byte, double, float ->Object
 *
 * */

public class RBI {
	
	public void personalLoan() {
		System.out.println("I am RBI PL - 8%");
	}
	
	public void homeloan() {
		System.out.println("I am RBI HL - 5%");
	}

}
