package abstractions;

/*public class TightCouplingExample {

	public static void main(String[] args) {
		Notification notification = new Notification();
		notification.notifyUser("Your order has been dispatched");
	}
}

class EmailService{
	public void sendEmail(String message) {
		System.out.println("Email send with message:"+message);
	}
}

class Notification{
	private EmailService email= new EmailService();
	public void notifyUser(String message) {
		email.sendEmail(message);
	}
}*/