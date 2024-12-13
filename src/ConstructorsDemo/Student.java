package ConstructorsDemo;

public class Student {
	String name;
	int age;
	Student(String StudentName,int StudentAge){
		name= StudentName;
		age=StudentAge;
	}
	Student(String section,String standard){
		System.out.println("Section: "+section+", Standard: "+standard);
	}
	Student(int marks, String subject){
		System.out.println(subject+": "+marks);
	}
	
	Student(){
		System.out.println("I am non-params constructor");
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age "+age);		
	}
	
	public static void main(String[] args) {
		Student st1= new Student("Tariq",33);
		st1.display();
		Student st2= new Student("Aman",30);
		st2.display();
		
		Student st3= new Student("A","3rd");
		Student st4=new Student(34,"English");
	}
	
	//train
	/*
	name, train number, origin destination, station arrival, 
	
	 * */
	
	//constructor - method(), this(), super()
}
