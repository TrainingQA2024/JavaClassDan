package classDemo;

public class ClassDemo {
	
	public static void main(String[] args) {
		Student Danish= new Student();
		Danish.name = "Danish";
		Danish.age = 16;
		Danish.rollNumber=34;		
		Danish.play();
		Danish.study();
		
		Student Vikas = new Student();
		Vikas.name="Vikas";
		Vikas.age=18;
		Vikas.rollNumber=32;
		Vikas.study();
		Vikas.play();
	}
}

class Student{
	String name;
	int age;
	int rollNumber;
	
	public void study() {
		System.out.println(name+" ,whose age is "+age+", is studying.");
	}
	
	public void play() {
		System.out.println(name+" roll no."+rollNumber+" is playing in recess");
		 
	}
}