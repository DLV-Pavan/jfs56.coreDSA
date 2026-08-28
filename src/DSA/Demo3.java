package DSA;

public class Demo3 {
	public static void main(String args[]) {
//		String name = "bahubali";
//		name.concat("devasena");
//		System.out.println(name);
		
		String st1="bahubali";
		String st2="bahubali";
		System.out.println(st1==st2);
		System.out.println(st1.equals(st2));
		
		String str1 = new String("capgemini");
		String str2 = new String("capgemini");
		
		System.out.println(str1==str2);
		System.out.println(st1.equals(st2));
//		
//		String a = "bahubali";
//		String b = "bahu"+"bali";
//		
//		
//		System.out.println(a==b);
//		System.out.println(a.equals(b));
		
		String a = "bahubali";
		String b = "bahu"+"bali";
		String c = b+"bali";
		
		System.out.println(a==c);
		System.out.println(a.equals(b));

	}

}
