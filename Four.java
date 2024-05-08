package s.p.r;
/*
 Write a Java program to create a class called Shape with methods called
getPerimeter() and getArea(). Create a subclass called Circle that overrides the
getPerimeter() and getArea() methods to calculate the area and perimeter of a circle
 
 */
class Shape2
{
	public void getPerimeter(int r)
	{
		System.out.println("parimeter of a circle=2*π*r");
	}
	public void getArea(int r)
	{
		System.out.println("Area of a circle =π*r*r");

	}
}
class Circle extends Shape
{
	public void getPerimeter(int r)
	{
		System.out.println(2*3.14*r);
	
	}
	public void getArea(int r)
	{
		System.out.println(3.14*r*r);

	}
	
}
public class Four {

	public static void main(String[] args) {
            Shape2 so=new Shape2();
            so.getPerimeter(5);
            so.getArea(5);
            
            Circle co=new Circle();
            co.getPerimeter(5);
            co.getArea(5);
	}

}
