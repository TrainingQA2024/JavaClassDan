package ConstructorsDemo;

public class ConstructorChaining {

	public static void main(String[] args) {

//		Employees emp1=new Employees("Shahrukh",54,"Accounts");//3 params
//		Employees emp1=new Employees("Salman",56);//2 params
		Employees emp1 = new Employees();
		emp1.display();
	}
}

class Employees {

	String name;
	int age;
	String dept;

	// Constructor 1
	Employees(String name, int age, String dept) {
		this.name = name;// This keywords refers to the current class instance/global variable
		this.age = age;
		this.dept = dept;
	}

	// Constructor 2
	Employees(String name, int age) {
		this(name, age, "Not defined");
	}

	// constructor3
	Employees() {
		this("unknown", 0);
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Dept: " + dept);
	}
}