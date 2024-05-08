package s.p.r;
// CONSTRUCTOR OVERLODING :-SAME constructor name with different parameter


class H
{
	int x;
	int y;
	String name;
	H()
	{
		System.out.println("constructor 1 ");
	}
	H(int x)
	{
		System.out.println("x is : "+x);

	}
	H(int x, int y)
	{
		System.out.println("Addition is : "+(x+y));

	} 
	H (String name)
	{
		System.out.println("Name is : "+name);

	}
}
public class Constructor_overloding {

	public static void main(String[] args) {
      //H ao=new H();
	  new H();
      new H(20);
      new H(30,40);
      new H("Mansi");
     
	}

}
