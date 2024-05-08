package s.p.r;
class A
{
	
	A()
	{
		System.out.println("Non paramiterise constructor");
	}
}

//------------parameterise constructor---------------------
class B
{
	int p1;
	int p2;
	
	B(int p1, int p2)
	{
           this. p1=p1;
           this. p2=p2;
	}
	public void sum()
	{
		System.out.println("additon is : "+p1+" + "+p2+" = " +(p1+p2));

	}
}
public class Constuctor {

	public static void main(String[] args) {
        A ao=new A();
        B bo=new B( 10,20 );
        bo.sum();
	}

}
