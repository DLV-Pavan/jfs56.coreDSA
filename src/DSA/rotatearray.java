package DSA;

public class rotatearray {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int r=2;
			for(int i=1;i<=r;i++) {
				int first = arr[0];
				for(int j=0;j<arr.length-1;j++) {
					arr[j]= arr[j+1];
			}
				arr[arr.length-1] = first;
		}
			for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
	}
}
