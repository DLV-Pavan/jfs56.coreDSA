package DSA;

class Parent{
	public void m1()
	{
		System.out.println("welcome to india");
	}
}
public class Child extends Parent {
	public void m2()
	{
		System.out.println("i am child");
	}
	public static void main(String args[]) {
		Child ch = new Child();
		ch.m1();
		ch.m2();
	}

}
