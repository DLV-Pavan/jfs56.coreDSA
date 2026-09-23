package DSASorting;

public class selectionsort {
	public static void main(String[] args) {
		int arr[]= {5,4,1,2,8};
		for(int i=0;i<arr.length-1;i++)
		{
			int min = i;//consider minimum element
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
					int temp=arr[i];
					arr[i]=arr[min];
					arr[min]=temp;
				}
			
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
