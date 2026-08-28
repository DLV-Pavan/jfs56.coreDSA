package DSA;

public class Student1 {
	String name;
	
	public Student1(String name) {
		name=name;
	}
	
	public void display()
	{
		System.out.println(name);
	}
	
	public static void main(String args[])
	{
		Student1 st = new Student1("bahubali");
		st.display();
		System.out.println(st);
	}

}
