package DSA;

class Person{
	
	int salary = 60000;
	public void getSalary(int salary)
	{
		salary = 50000;
		System.out.println("parent salary is: "+ salary);
		System.out.println("parent class global salary: "+ this.salary);

	}
}
public class Employee1 extends Person {
	
	int salary = 30000;
	public void getSalary(double salary)
	{
		System.out.println("my partime salary is:"+ salary);
	}
	public void getSalary(int salary)
	{
		salary=20000;
		System.out.println(salary);//local
		System.out.println(this.salary);
		super.getSalary(40000);
		System.out.println(this);
	}
	
	public static void main(String args[])
	{
		Employee1 emp = new Employee1();
		emp.getSalary(10000);
		
	}

}
