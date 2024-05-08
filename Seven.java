package s.p.r;
/*
 Write a Java program to create a class called Circle2 with a private instance
variable radius. Provide public getter and setter methods to access and modify
the radius variable. However, provide two methods called calculateArea() and
calculatePerimeter() that return the calculated area and perimeter based on the
current radius value.

 */

class Circle2
{
	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	
	public void calculateArea()
	{
		System.out.println("Area of circal is : " + 3.14* radius*radius);
	}
	public void calculatePerimeter()
	{
		System.out.println("perimeter of circal is : "+ 2*3.14*radius);

	}
}
public class Seven {

	public static void main(String[] args) {
		 
		Circle2 co=new Circle2();
		co.setRadius(6);
		System.out.println("Radius is : "+co.getRadius());
		co.calculateArea();
		co.calculatePerimeter();
		
      
	}

}
