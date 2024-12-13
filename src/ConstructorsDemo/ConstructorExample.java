package ConstructorsDemo;

public class ConstructorExample {
	//Constructor 
	/*
	 Rule
	 1. Class name and the constructor name should be the same.
	 2. No return type not even void
	 3. It gets automatically call when we create an object
	 
	 
	 When you don't create a constructor then java creates it. It is called default constructor
	 
	 Types of constructor
	 1. Default constructor
	 2. Non Parameterized constructor
	 3. Parameterized constructor
	 
	 * */

	//non parameterized constructor
//	 ConstructorExample(){
//	System.out.println("I am constructor");	
//	}
	
	ConstructorExample(String name){
		System.out.println("Hi "+name+"! You are being called from parameterized constructor");
	}
	
	public static void main(String[] args) {
		ConstructorExample ob= new ConstructorExample("Danish");//() is constructor arguments
	}
}
