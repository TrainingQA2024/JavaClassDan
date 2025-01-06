package Polymorphism;

public class MethodOverloading {
	
	static int name=3434;
	
	//train - search
	/*
	train(train#),
	origin destination, 
	time, station
	
	//Rule
	 * Method overloading is also known as Compile time polymorphism, and static polymorphism
	 * 1. method name should be same.
	 * 2a. method parameters should be different.
	 * 2b. types of parameters should be different.
	 * 2c. Sequence of parameters should be different.
	 * 
	 * Signature should be different (with the same name) in each method is called polymorphism
	 * */
	
	public static void deposit(int cash) {
	//code
		System.out.println("I am cash deposit");
	}
	
	public static String deposit1(int cash) {
	//code
		System.out.println("I am cash deposit");
		return "abc";
	}
	
	public void deposit(double amount,int chequeNum) {
	//code
		System.out.println("I am check deposit");
	}
	public void deposit(double amount) {//online
		//code
		System.out.println("I am online deposit");
	}
	
	public static void main(String[] args) {
		
//		MethodOverloading ob = new MethodOverloading();
//		ob.deposit(4545454,345.00);
		MethodOverloading.deposit(4545);
		int x= MethodOverloading.name;
	}
	
	public void deposit(int chequeNum,double amount) {
	//code
		System.out.println("I am different siquence of check deposit");
	}
}
