package date13;
import java.util.Scanner;
public class Switch_Atm {

	public static void main(String[] args) {
		Scanner so=new Scanner (System.in);
		String exp;
		int balance=5000;
		System.out.println("Enter your choice D for deposit and W for widrow");
		exp=so.nextLine();
		System.out.println("*********************************************** ");
		
		
		
		switch (exp)
		{
		case "D" :
		{
			int amt;
			System.out.println("Enter deposit  Ammount : ");
			amt=so.nextInt();
			balance=balance+amt;
			System.out.println("balance is : "+balance);
			break;
		}
		
		case "W" :
		{
			int amt;
			System.out.println("Enter widrow  Ammount : ");
			amt=so.nextInt();
			balance=balance-amt;
			System.out.println("balance is : "+balance);
			break;
		}
		default :
		{
			System.out.println("no match found");
		}


		
		}
	}
	}


