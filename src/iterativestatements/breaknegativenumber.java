package iterativestatements;
import java.util.Scanner;
public class breaknegativenumber {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);

	        while (true) {
	            int num = sc.nextInt();

	            if (num < 0) {
	                break;
	            }

	            System.out.println(num);
	        }

	        System.out.println("Program Ended");
	}
}

