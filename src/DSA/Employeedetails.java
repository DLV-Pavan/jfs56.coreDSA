package DSA;
import java.math.BigInteger;
import java.util.*;
public class Employeedetails {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		byte experience = 0;
		short depart_Id=0;
		int emp_id=0;
		long mobile_number=0;
		float height=0;
		double salary=0;
		boolean filePresent=false;
		BigInteger addar=BigInteger.ZERO;
		BigInteger bonus=BigInteger.ZERO;
		String Employeename=" ";
		String EmployeeFullname = "";
		char martialstatus=' ';
		
		//Employye id
		
		System.out.println("Enter Employee Id:");
		if(sc.hasNextInt())
		{
			emp_id=sc.nextInt();
		}
		else {
			System.out.println("employee id is invalis");
			return;
		}
		
		//employee name
		sc.nextLine();
		
		System.out.println("enter employee name:");
		if(sc.hasNext())
		{
			Employeename=sc.nextLine();
		}
		else {
			System.out.println("invalid name");
		}
		
		// mobile number
		System.out.println("enter mobile number:");
		if(sc.hasNextLong())
		{
			mobile_number=sc.nextLong();
		}
		else {
			System.out.println("invalid number");
		}
		System.out.println("enter department id:");
		if(sc.hasNextShort())
		{
			depart_Id=sc.nextShort();
		}
		
		else {
			System.out.println("invalid department");
		}
		
		System.out.println("Full name: "+ Employeename);
		System.out.println("Employee id: " + emp_id);
		System.out.println("Mobile number: "+ mobile_number);
		System.out.println("Department id: " + depart_Id);


	}

}
