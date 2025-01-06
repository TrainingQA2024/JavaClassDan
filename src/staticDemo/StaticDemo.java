package staticDemo;

public class StaticDemo {
	
	static int abc=9;
	
	/*
	 Static applies on following:
		1.variable
		2.Method
		3.Block
		
		Key-points related to Static keyword
		1. No need to create an object of static member.
		2. Static key word stores a single copy of that variable in the memory.
		3. Static members are allotted memory by class loader when loading the class.
		4. Static keyword holds the memory until the program is completely executed. 
		5. Static methods cannot access non static instance variable.
		6. Static methods cannot be overridden.
		7. Static methods can be overloaded but can't be overridden.


	 * */
//	public static void temp1() {
//		System.out.println("I am static method");
//	}
	
//	static String statictemp="abc";
	static public void main(String args[]) {//args =arguments
//		StaticDemo ob= new StaticDemo();
//		ob.temp
//		StaticDemo.temp1();
		
		College student1=new College(101);
		student1.showRollNumber();
		College student2=new College(102);
		student2.showRollNumber();
		
		College.collegeName="XYZU";
		student1.showRollNumber();
		student2.showRollNumber();
		
//		System.out.println(MathUtility.square(4));
		int result= MathUtility.square(4);
		System.out.println(result+5);
	}
}

class College{
	static String collegeName="ABCU";//ABC University
	int rollNumber;
	
	College(int rollNumber){
		this.rollNumber = rollNumber;
	}
	
	public void showRollNumber() {
		int account=34343443;
//		System.out.println("Roll Number: "+rollNumber+" College Name "+collegeName);
		System.out.println(collegeName+rollNumber);
		System.out.println(account);
	}	
}

class MathUtility{
	public static int square(int num) {//3
		int output=num*num;//9
		return output;//9
	}
}

