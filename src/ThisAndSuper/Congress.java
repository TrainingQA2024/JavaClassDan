package ThisAndSuper;

public class Congress {
	
	Congress(){
		System.out.println("I am congress constructor");
	}
	
	public void gstBill() {
		System.out.println("GST =12%");
	}
	
	public static void main(String[] args) {
		BJP bjp= new BJP();
		bjp.gstBill();
	}

}

class BJP extends Congress{
	
	BJP(){
		System.out.println("I am BJP non argument");
	}

	BJP(int age){
//		super();
		this();
		System.out.println("I am BJP non argument");
	}
	
	public void gstBill() {
		System.out.println("GST=15%");
		super.gstBill();
	}

}
