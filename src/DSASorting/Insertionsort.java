package DSASorting;

public class Insertionsort {
	public static void main(String[] args) {
		int arr[]= {2,5,9,3,7,14,11,13};
		for(int i=0;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j] > key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
