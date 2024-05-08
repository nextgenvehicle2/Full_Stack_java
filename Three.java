package s.p.r;
/*
Write a Java program to create a class called Employee with methods called
work() and getSalary(). Create a subclass called HRManager that overrides the
work() method and adds a new method called addEmployee().
*/

class Employee
{
	public void work()
	{
		System.out.println("Employee is working...");
	}
	public void getSalary()
	{
		System.out.println("getSalary is...");
        
	}
}
class HRManager extends Employee
{
	
	public void work()
	{
		System.out.println("HR Manager is managing HR tasks...");
	}
	
	public void addEmployee()
	{
		System.out.println("HR Manager is adding a new employee...");

	}
}
public class Three {

	public static void main(String[] args) {
		Employee eo=new Employee();
		eo.work();
		//eo.getSalary();
		
		HRManager ho=new HRManager();
		ho.work();
		ho.addEmployee();


	}

}
