package DSA;

public class Demo1 {
	
	static {
		System.out.println("static block 1");
	}

	static {
		System.out.println("static block 2");
	}
	
	public Demo1(){
		System.out.println("static block 3");
	}
	
	{
		System.out.println("static block 4");
	}
 
	public static void main(String args[]) {
		System.out.println("main method");
		Demo1 d = new Demo1();
	}
}
