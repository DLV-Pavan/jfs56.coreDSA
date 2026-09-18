package DSAHashmap;
import java.util.*;
public class firstunique {
	public static void main(String[] args) {
		String str="pavan";
		Map<Character,Integer> map = new HashMap<>();
		for(char c:str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i)) == 1) {
				System.out.println("index: "+i);
				return;
			}
		}
		System.out.println("no element");
	}
}

