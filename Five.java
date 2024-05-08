package s.p.r;
/*
 
Write a Java program to create a class called BankAccount with private
instance variables accountNumber and balance. Provide public getter and setter
methods to access and modify these variables.

 */

class BankAccount
{
	private  int accountNumber;
	private double balance;
	
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
	
}
public class Five {

	public static void main(String[] args) {
		BankAccount bo=new BankAccount();
		bo.setAccountNumber(1234567890);
		System.out.println(bo.getAccountNumber());
		
		bo.setBalance(7000.00);
		System.out.println(bo.getBalance());

		
	}

}
