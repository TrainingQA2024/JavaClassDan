package InheritenceDemo;

public class HierarchicalDemo extends grandFather{
	
	public void parent() {
		System.out.println("I am parent");
		gfather();
	}

	public static void main(String[] args) {
		childA A=new childA();
		A.hi();
		childB B = new childB();
		B.hi();
	}
}

class childA extends HierarchicalDemo{
	public void hi() {
		System.out.println("I am child a");
		parent();
	}
}

class childB extends HierarchicalDemo{
	public void hi() {
		System.out.println("I am child b");
		parent();
	}
}

class grandFather{
	public void gfather() {
		System.out.println("I am grand father");
	}
}

