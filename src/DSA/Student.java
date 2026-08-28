package DSA;

public class Student {
	int stid;
	String stname;
	
	public void assign() {
		stid = 494;
		stname = "pavan";
	}
	
	public void display()
	{
		System.out.println(stid+" "+stname);
	}
	
	public static void main(String args[]) {
		Student st = new Student();
		st.assign();
		st.display();
	}

}
