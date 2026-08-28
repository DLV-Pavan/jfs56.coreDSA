package DSA;
interface Calculator1{
	public int add(int a , int b);
}
public class calculatordemo {
	public static void main(String args[]) {
		Calculator1 ct = (a,b)->
		{
			return a + b;
		
		};
		
		System.out.println(ct.add(12, 12));
	}

}


