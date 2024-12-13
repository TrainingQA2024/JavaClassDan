package classDemo;

public class BankAccount {
	String AccountHolderName;
	double balance;//10,20
	
	public void deposit(double amount) {//10
		balance=balance+amount;//10+10=20
		System.out.println(amount+" deposited. New balance is "+balance);
	}
	
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println(amount+" withdrawn and new balance is "+balance);
		}else {
			System.out.println("Insufficient Balance garib aadmi!");
		}
	}
	
	public static void main(String[] args) {
		BankAccount account1=new BankAccount();
		account1.AccountHolderName="Shaan";
		account1.balance=5000;
		
		account1.deposit(2000);
		account1.withdraw(5000);
		account1.withdraw(5000);
		
		
		BankAccount account2=new BankAccount();
		account2.AccountHolderName="Shaanu";
		account2.balance=500;
		
		account2.deposit(2000);
		account2.withdraw(5000);
	}

}
