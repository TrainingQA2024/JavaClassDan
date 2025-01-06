package finalKeyword;

public class FinalClass {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.display();
		String ab= v.name+" 001";
//		System.out.println(v.name);
		
		System.out.println(ab);
	}
}

final class Vehicle{
	String name = "Gadi";
	void display() {
		System.out.println("This is a vehicle class");
	}
}

//class Car extends Vehicle{
//	
//}
