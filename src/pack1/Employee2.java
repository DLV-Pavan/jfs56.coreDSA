package pack1;
class Parent{
	private void m2()
	{
		System.out.println("parent class m2 method");
	}
}
public class Employee2 extends Parent{
	
	private void m1()
	{
		System.out.println("i am from employee m1 methods...");
	}
	
	public static void main(String args[])
	{
		Employee2 emp = new Employee2();
		emp.m1();
	}
}

