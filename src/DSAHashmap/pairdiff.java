package DSAHashmap;
import java.util.*;
public class pairdiff {
	public static void main(String[] args) {
		int arr[]= {1,3,5,4,2};
		int target = 2;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			if(map.containsKey(num-target))
			{
				System.out.println("pair found");
				System.out.println("indexes :"+map.get(num-target)+" "+i);
				System.out.println("values:"+(num-target)+" "+num);
				return;
			}
			if(map.containsKey(num+target))
			{
				System.out.println("pair found");
				System.out.println("indexes :"+map.get(num+target)+" "+i);
				System.out.println("values:"+(num+target)+" "+num);
				return;
			}
			map.put(num, i);
		}
		System.out.println("no pair found");
	}
}
			
