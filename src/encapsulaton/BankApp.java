package encapsulaton;

public class BankApp {
	
	public static void main(String[] args) {
		BankAccount ba= new BankAccount();
		ba.setAccountHolderName("Firoz");
		System.out.println(ba.getAccountHolderName());
	}
}

class BankAccount{
	private String accountHolderName;
	private double balance;
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
