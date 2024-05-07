package date13;
import java.util.Scanner;
public class new_1 {

	public static void main(String[] args) {
		Scanner so=new Scanner(System.in);
		int m1,m2;
		int tot;
		double per;
		System.out.println("enter m1 marks");
		m1=so.nextInt();
		System.out.println("enter m2 marks");
		m2=so.nextInt();
		tot=m1+m2;
		per=tot/2;
		
		System.out.println("***************************************************************************");
	if(per>=90 && per <= 100)
			
	{

		System.out.println("tot is:"+tot);
		System.out.println("percentage is:"+per);
		System.out.println("gread is A+");
    }
	else if(per>=80 && per <= 90)
	{
	System.out.println("tot is:"+tot);
	System.out.println("percentage is:"+per);
	System.out.println("grade is:A");
	}
	else if(per>=70 && per <= 80)
	{
	System.out.println("tot is:"+tot);
	System.out.println("percentage is:"+per);
	System.out.println("grade is:B+");
	}
	else if(per>=60 && per <= 70)
	{
	System.out.println("tot is:"+tot);
	System.out.println("percentage is:"+per);
	System.out.println("grade is:C");
	}
	else if(per>=50 && per <= 60)
	{
	System.out.println("tot is:"+tot);
	System.out.println("percentage is:"+per);
	System.out.println("grade is:D");
	}
		
	else if(per>=40 && per <= 50)
	{
	System.out.println("tot is:"+tot);
	System.out.println("percentage is:"+per);
	System.out.println("grade is:E");
	}
		
	else
	{
		System.out.println("FAIL");
	}

}
}