package s.p.r;
/*
 
 Write a Java program to create a class called Rectangle2 with private instance
variables length and width. Provide public getter and setter methods to access
and modify these variables.

 */

class Rectangle2
{
	private int length;
	private int widh;

	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidh() {
		return widh;
	}

	public void setWidh(int widh) {
		this.widh = widh;
	}
	
	

}
public class Six {

	public static void main(String[] args) {
      
		Rectangle2 ro=new Rectangle2();
		
		ro.setLength(10);
		System.out.println(ro.getLength());
		
		ro.setWidh(5);
		System.out.println(ro.getWidh());

		
	}

}
