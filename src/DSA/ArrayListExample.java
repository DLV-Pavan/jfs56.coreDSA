package DSA;

import java.util.Vector;

public class ArrayListExample {
	public static void main(String args[]) {
		Vector al = new Vector();
		
		System.out.println("initial capacity: " + al.capacity());
		System.out.println("initial size:" + al.size());
		
		al.add("bahubali");
		al.add("devasena");
		al.add(null);
		al.add(true);
		al.add(56.94);
		al.add(new Integer(549));
		al.add('g');
		al.add("ramesh");
		al.add("bahubali");
		al.add("bahubali");
		al.add("bahubali");
		al.add("bahubali");

	}

}
