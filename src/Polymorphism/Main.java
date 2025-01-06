package Polymorphism;

public class Main {
	
	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println(parent.getObject());
		
		Child child = (Child) parent;
		child.childmethod();
	}
}

class Parent{
	public Number getObject() {
		return 9.7;//double
	}
}

class Child extends Parent{
	
	public Integer getObject() {//int->Wrapper class - Integer, float - Float, double -Double
		return 9;//int
	}
	
	public void childmethod() {
		System.out.println("I am child class method");
	}
	
	//class Parent{
//	public Object getObject() {
//		return "Parent Object";//string
//	}
//}
//
//class Child extends Parent{
//	
//	public String getObject() {
//		return "Child Object";
//	}
//}
}
