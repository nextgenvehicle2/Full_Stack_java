package s.p.r;

//    without Static
class A
{
	int a = 20;
	int b = 20;
	
	public void info()
	{
		System.out.println("it is a info method");
	}
	
	public void add()
	{
		System.out.println("Adition of two number is : "+(a+b));
	}

}

class B
{
	public void show()
	{
		System.out.println("This is show method");
		
	
	}

   public void getdata()
   {
	   System.out.println("This is getdata methd ");
   }

}




// without void 

class C
{
	public String name()
	{
		return "Mansi Ajaykumar Choudhari ";
	}
	
	public int num()
	{
		return 100;
	}
}


public class myclass2 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to java");
		A ao=new A();  // memory allocate
		  ao.info();  // calling  info method
		  ao.add();
		
		  
			B eo=new B();
			eo.show();   // calling show method
			eo.getdata();
			
			
			C co=new C();
			System.out.println(co.name()); //calling name method
			System.out.println(co.num()); // calling num method

	}

}
