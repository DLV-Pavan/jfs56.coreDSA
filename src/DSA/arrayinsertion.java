package DSA;

public class arrayinsertion {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int position = 2;
		int value = 25;
		
		int newarr[] = new int[arr.length+1];
		for(int i=0;i<position;i++) {
			newarr[i] = arr[i];
		}
		newarr[position] = value;
		
		for(int i=position;i<arr.length;i++) {
			newarr[i+1] = arr[i];
		}
	
	for(int i=0;i<newarr.length;i++) {
		System.out.println(newarr[i]);
	}
	}

}
