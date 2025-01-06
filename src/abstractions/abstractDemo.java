package abstractions;
/*
  Abstraction  - hiding implementation of methods
  Encapsulation - data hiding (Variable, entire method)

  Abstraction consist of 
 1. Abstract class
 2. Interface 

  method type
  1. Abstract method - imaginary (does not exist)
  2. Concrete method - real (exist)

  Abstract class - it has both concrete and abstract methods. We can achieve 0 to 100% abstraction

  key feature
  1. We cannot create an object of abstract class or cannot instantiate  
  2. It contains abstract as well as concrete methods
  3. We can define constructors in abstract class

 //4 tyre, steering, seat 5;optional - music system, alloy wheel,interior
 * */
public class abstractDemo {

	public static void main(String[] args) {
		swift swDanish = new swift("Danish");
		swDanish.seat();
		swDanish.tyre();
		swDanish.steering();
		swDanish.alloywheel();
		swDanish.musicSystem();
		swDanish.interiorCustomized();

		swift swTariq= new swift("Tariq");
		swTariq.seat();
		swTariq.tyre();
		swTariq.steering();
		swTariq.musicSystem();
	}
}

abstract class Vehicle{
	String name;
	//Constructor
	Vehicle(String name){
		this.name= name;
		System.out.println("I am "+name+" Vehicle class constructor");
	}
	//mandatory
	abstract void tyre();//abstract method
	abstract void steering();
	abstract void seat();
	//optional
	public void musicSystem() {
		System.out.println("Music system installed in "+name+" car");
	}

	public void alloywheel() {
		System.out.println("Alloy wheel installed");
	}

	public void interiorCustomized() {
		System.out.println("Customized interior");
	}
}

class swift extends Vehicle{	
	swift(String name) {
		super(name);
	}

	@Override
	void tyre() {
		System.out.println("Ceat tyre installed");
	}

	@Override
	void steering() {
		System.out.println("Multimedia steering installed");
	}

	@Override
	void seat() {
		System.out.println("Premium quality seats added");		
	}	
}
