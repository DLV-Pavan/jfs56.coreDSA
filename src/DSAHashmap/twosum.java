package DSAHashmap;
import java.util.*;
public class twosum {
	public static void main(String[] args) {
		int arr[]= {2,7,11,15};
		int target = 9;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int complement=target-arr[i];
			if(map.containsKey(complement))
			{
				System.out.println("indexes:"+map.get(complement)+" "+i);
				return;
			}
			map.put(arr[i], i);
		}
		System.out.println("no pair found");
	}
}
