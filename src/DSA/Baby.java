package DSA;
interface Mom{
	default void sleep() {
		System.out.println("sleep left direction");
	}
}	
interface dad{
	default void sleep() {
		System.out.println("sleep right direction");
	}
}

public class Baby implements dad,Mom {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		dad.super.sleep();
		Mom.super.sleep();
		System.out.println("i can sleep my own");
	}
	
	public static void main(String[] args) {
		Baby b = new Baby();
		b.sleep();
	}
}
