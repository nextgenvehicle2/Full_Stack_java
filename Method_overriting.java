package s.p.r;
// METHOD OVERRITING :- SAME method name with SAME parameter


class I
{
	
	public void add(int x,int y)
	{
		System.out.println("add is : "+ (x+y));
}

}
class L extends I
{
	public void add(int x,int y)
	{
		System.out.println("sub is : "+(x-y));
	}
}


class K extends L
{
	public void add(int x,int y)
	{
		System.out.println("multiplication  is : "+(x*y));
	}
}
	


public class Method_overriting {

	public static void main(String[] args) {
		
         I io=new I();
      io.add(10, 20);
         L jo=new L();
         jo.add(30,40);
         K ko=new K();
         ko.add(70,50);
         
	}

}
