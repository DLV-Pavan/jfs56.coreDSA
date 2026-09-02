package DSA;

public class arrayupdate {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		int pos = 2;
		int value = 25;
		
		arr[pos]=value;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
