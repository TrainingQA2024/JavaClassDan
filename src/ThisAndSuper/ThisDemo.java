package ThisAndSuper;

public class ThisDemo extends SuperDemo{	
	/*
		This refers to current class object.
		Current class - variable, method
	 * */
	
	
//	public ThisDemo() {
//		System.out.println("I am this class constructor");
//	}
	
	public ThisDemo(int num) {
//		this();
		super(num);
		System.out.println(num);		
	}
	
	public void method2() {
		
		this.age=15;
		this.methodThis();
	}
	
	int age=10;
	public void methodThis() {
		System.out.println("I am from the This Demo class");
	}
	
	public static void main(String[] args) {
		ThisDemo ob= new ThisDemo(56);
	}


}

class SuperDemo{
	
	int num;
	
	SuperDemo(int num){
		this.num= num;
	}
	public void methodSuper() {
		System.out.println("I am parent class method and I have got this number from child "+num);
	}
	
	
	//class - age, name, standard - 
	
}
