package date13;
import java.util.Scanner;

public class Switch2 {


	public static void main(String[] args) {
		Scanner so=new Scanner(System.in);
		String exp;
		int n1, n2;
		System.out.println("enter your choise + , - , * , / ");
		exp=so.nextLine();
		System.out.println("enter first number");
		n1= so.nextInt();
		System.out.println("enter the second number");
		n2= so.nextInt();
		
		switch (exp)
		{
			case "+":
			{
				System.out.println("Addition of two number is : "+(n1+n2));
				break;
			}
			
			case "-":
			{
				System.out.println("Substraction of two number is : "+(n1-n2));
				break;
			}
			case " * " :
			{
				System.out.println("Multiplication of two number is : "+(n1*n2));
				break;
			}
			case "/":
			{
				System.out.println("divison of two number is : "+(n1/n2));
				break;
			}
			
			default :
			{
				System.out.println("ss");
			}
			
			
		}

		
		
		
		
		
		
		
		
		
		
	}

}
