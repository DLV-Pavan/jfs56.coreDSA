package Function;

public class Factdemo {
	public static int factLoop(int n)
	{
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static int factrec(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n+factrec(n-1);
	}
	public static void main(String[] args) {
		System.out.println("Loop:" + factLoop(5));
		System.out.println("Recursion:" + factrec(5));
	}
}
