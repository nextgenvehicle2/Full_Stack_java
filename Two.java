package s.p.r;
/*Write a Java program to create a class called Shape with a method called
getArea(). Create a subclass called Rectangle that overrides the getArea()
method to calculate the area of a rectangle.
*/


class Shape
{
//	int Length,int Width
	public void getArea()
	{
		System.out.println("Formula is Area =Length × Width");
	}
}
class Rectangle extends Shape
{
	public void getArea(int Length,int Width)
	{
		System.out.println("Area of a rectangle is : "+(Length*Width));
	}
}
public class Two {

	public static void main(String[] args) {
       Shape so=new Shape();
       so.getArea();
       
       Rectangle ro=new Rectangle();
       ro.getArea(5,4);
	}

}
