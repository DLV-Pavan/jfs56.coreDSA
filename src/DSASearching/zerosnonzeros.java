package DSASearching;

public class zerosnonzeros {
	public static void main(String[] args) {
		int arr[]= {0,1,10,0,32};
		int slow = 0;
		for(int fast=0;fast<arr.length;fast++) {
			if(arr[fast]!=0) {
				int temp=arr[slow];
				arr[slow]=arr[fast];
				arr[fast]=temp;
				slow++;
			}
		}
		
	}

}
