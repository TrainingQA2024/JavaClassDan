package ThisAndSuper;

public class ClassExample {

	int age;
	String name;
	String standard;
	
	public ClassExample(int age, String name, String standard){
		this.age= age;
		this.name=name;
		this.standard=standard;
	}
	
	public void info() {
		System.out.println(name+", whose age is "+age+", studies in class "+standard);
	}
	
	public static void main(String[] args) {
		ClassExample st1= new ClassExample(8, "Sohan", "2nd");
		st1.info();
		ClassExample st2= new ClassExample(9, "Rohan", "2nd");
		st2.info();
	}
}
