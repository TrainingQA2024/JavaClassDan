package staticDemo;

public class StaticBlock {
	public static void main(String[] args) {
	
		Database db= new Database();
		db.meetingDoctor();
	}
}

class Database{
	Database(){
		System.out.println("BP Checked and sugar checked");
	}
	
	static{
		System.out.println("Fee paid");
	}
	
	public void meetingDoctor() {
		System.out.println("Prescription");
	}
}
