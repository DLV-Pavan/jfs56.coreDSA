package DSA;
interface A{
	void m1();
	public default void sleeping() {
		System.out.println("sleeping with dream");
	}
}

public class interfacedemo implements A{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("eating in the class");
	}
	
	public void sleeping()
	{
		System.out.println("sleeping with dreamzz along with eating...");
	}
	
	public static void main(String[] args) {
		interfacedemo d = new interfacedemo();
		d.m1();
		d.sleeping();
	}
}

