package date13;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
 
		Scanner so= new Scanner(System.in);
		String exp= "2";
		switch(exp)
		{
		case "1":
		{
			System.out.println("colour is red ");
			break;
			
		}
		case "2":
		{
			System.out.println("colour is orenge");
			break;
		}
		case "3":
		{
			System.out.println("colour is blue");
			break;
		}
		default :
		{
			System.out.println("no match found");
		}
		}
		
	    }

}
