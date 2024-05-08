package s.p.r;
// METHOD OVERLOADING :- SAME method name with DIFFERNT parameter
class C
{
	public void show()
	{
		System.out.println("This is  show method ");
	}
	
	public void show(int x)
	{
		System.out.println(" The value of x is : "+ x);

	}
	
	
	public void show(int x,int y)
	{
		System.out.println("Addition is : "+(x+y));

	}
	
	public void show(int x, int y,int z)
	{
		System.out.println("multiplication is : "+(x*y*z));

	}
	
}

public class Method_overloding {

	public static void main(String[] args) {
                  C co=new C();
                  co.show();
                  co.show(30);
                  co.show (20,40);
                  co.show(5,3,2); 
	}

}
