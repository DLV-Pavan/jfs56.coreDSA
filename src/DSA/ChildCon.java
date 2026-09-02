package DSA;

class ParentCon{
	public ParentCon() {
		this(45);
		System.out.println("parent class constructor 6");
	}
	
	public ParentCon(int age) {
		this.m1();
		System.out.println("age of parent class constructor 5");
	}
	
	public void m1() {
		System.out.println("parent class m1 method");
	}
	
	public class ChildCon extends ParentCon {
		
		public ChildCon() {
			this(48);
			System.out.println("child class constructor");
		}
		
		public ChildCon(int age)
		{
			this.m1();
			System.out.println("age of child class con 2:" + age);
		}
		
		public void m1() {
			System.out.println("child class m1 method 1");
		}
		
		public static void main(String args[])
		{
			ChildCon cc = new ChildCon();
			
			
			
		}
	}
}