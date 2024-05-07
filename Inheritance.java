package s.p.r;
class C
{
	int roll=6;
public void show()
{
	System.out.println("this is show method");
}

}
class D extends C   
// by using extends key word we can acces all variabel and method from parent class
{
	public void info()
	{
		System.out.println("roll number is : "+roll);

	}
}
//public class Inheritance {
//
//	public static void main(String[] args) {
//       D bo=new D();
//       bo.info();
//       bo.show();
//	}
//
//}

class E extends D
{
	public void hello()
	{
		System.out.println("This is hello method ");

	}
}
public class Inheritance {

	public static void main(String[] args) {
       E eo=new E();
      
       eo.show();
       eo.hello();
       eo.info();
	}

}

