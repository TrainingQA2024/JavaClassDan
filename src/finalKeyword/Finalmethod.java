package finalKeyword;

/*
 	Final method cannot be overridden in child class
 * */

public class Finalmethod {

	final public void main(String[] args) {
		Child ch= new Child();
		ch.rule();
	}
}

class Parent{
	final void rule() {
		System.out.println("Login should be for 9 hours");
	}
}

class Child extends Parent{
	
//	void rule(){
//		System.out.println("Login should be only for 1 hour");
//	}
}
