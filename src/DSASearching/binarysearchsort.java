package DSASearching;

public class binarysearchsort {

    public static void main(String[] args) {

        int n = 25;

        int low = 1;
        int high = n;
        int result = 0;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (mid * mid == n) {
                result = mid;
                break;
            }
            else if (mid * mid < n) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("Square root = " + result);
    }
}