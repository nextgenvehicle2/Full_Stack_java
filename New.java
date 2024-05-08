package s.p.r;
/* . Write a Java program to create a class called Animal with a method called
makeSound(). Create a subclass called Cat that overrides the makeSound()
method to bark. 
*/


 class Animal {
	
	public  void  makeSound()
	{
		System.out.println("Animal makes a sound");
	}
 }
class Cat extends Animal
{
//	public void bark()
//	{
//		System.out.println("Cat makes a sound: Meow");
//
//	}
	public void makeSound()
	{
		System.out.println("Cat makes a sound: Meow");

	}
}

public class New {

	public static void main(String[] args) {
       Animal ao=new Animal();
        ao.makeSound();
        
        Cat co=new Cat();
        co.makeSound();
	}

}
