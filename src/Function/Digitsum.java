package Function;

public class Digitsum {

    // 1. Iterative Approach (Using Loop)
    public static int digitSumLoop(int n) {
        int sum = 0;
        n = Math.abs(n); // Handle negative numbers
        
        while (n > 0) {
            sum += n % 10; // Extract the last digit and add to sum
            n /= 10;       // Remove the last digit
        }
        return sum;
    }

    // 2. Recursive Approach
    public static int digitSumRec(int n) {
        n = Math.abs(n); // Handle negative numbers
        
        // Base case: Single-digit number
        if (n == 0) {
            return 0;
        }
        
        // Recursive step: Last digit + sum of remaining digits
        return (n % 10) + digitSumRec(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345;

        System.out.println("Digit Sum (Loop)      : " + digitSumLoop(number));
        System.out.println("Digit Sum (Recursion) : " + digitSumRec(number));
    }
}