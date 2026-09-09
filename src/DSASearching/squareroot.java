package DSASearching;

public class squareroot {
	public static void main(String[] args) {
		 int n = 25;

	        int left = 1;
	        int right = n;

	        while (left <= right) {

	            int mid = (left + right) / 2;

	            if (mid * mid == n) {
	                System.out.println("Square root is: " + mid);
	                return;
	            }

	            else if (mid * mid < n) {
	                left = mid + 1;
	            }
	            
	            else 
	            	right = mid-1;
	}
	}
}
