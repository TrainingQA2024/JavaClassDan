package CastingDemo;

public class ReferenceCasting {
	
	public static void main(String[] args) {
		//upcasting
		Dog d = new Dog();
		Animal a= d;
		a.sound();	
		
		//downcasting
		Animal an = new Animal();
		Dog dg= (Dog) an;
		dg.bark();
		dg.sound();
	}
}

class Animal{
	void sound() {
		System.out.println("Animal sound");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("dog barks");
	}
}
