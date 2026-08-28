package DSA;

public class Employee {
	int empid;
	String empname;
	
	public Employee() {
		empid=123;
		empname="pavan";
	}
	public void display()
	{
		System.out.println(empid +" "+empname);
	}
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.display();
	}

}
