package abstractions;

public class LooseCouplingExample {
	
	public static void main(String[] args) {
		
//		MessageService messageService	= new EmailService();
		MessageService messageService	= new SMSservice();
		Notification notification = new Notification(messageService);//"Your oder has been shipped"
		notification.NotifyUser("Your oder has been shipped");
	}
}

interface MessageService{
	void sendMessage(String message);
}

class EmailService implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println("Email sent with message: "+message);
		
	}	
}

class SMSservice implements MessageService{

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("SMS sent with message: "+message);		
	}	
}

class Notification{
	
	MessageService mssageService;
	public Notification(MessageService mssageService) {
		this.mssageService= mssageService;
	}
	
	public void NotifyUser(String message) {
		mssageService.sendMessage(message);
	}
}