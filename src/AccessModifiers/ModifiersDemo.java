package AccessModifiers;

public class ModifiersDemo {

	private int num1=2;
	private void method1() {
		System.out.println(num1+2);
	}
	
	public static void main(String[] args) {
		ModifiersDemo ob=new ModifiersDemo();
		ob.method1();
		System.out.println(ob.num1);
		DefaultDemo dd=new DefaultDemo();
		System.out.println(dd.name);
		dd.task();
	}
}

class Test{
	public void check() {
		ModifiersDemo demo= new ModifiersDemo();
		System.out.println(demo);
	}
}
