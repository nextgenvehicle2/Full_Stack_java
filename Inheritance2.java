package s.p.r;


class F
{
	public int x=10;
	public int y= 20;
	
	public void add()
	{
		System.out.println("Additon is : "+ (x+y));
	}
	
	public void sub()
	{
		System.out.println("Substraction is : "+(x-y));

	}
}
class G extends F
{
	public void mul()
	{
		System.out.println("Multiplication is : "+(x*y));

	}
}

public class Inheritance2 {

	public static void main(String[] args) {
        G go=new G();
        go.add();
        go.sub();
        go.mul();
	}

}
