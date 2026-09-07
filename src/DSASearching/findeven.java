package DSASearching;

public class findeven {
	public static void main(String[] args) {
		int arr[]= {13,5,33,90,23};
		for(int num:arr) {
			if(num%2==0) {
				System.out.println(num);
				return;
			}
		}
		System.out.println("no element found");
	}
}
