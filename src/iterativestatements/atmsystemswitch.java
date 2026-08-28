package iterativestatements;
import java.util.Scanner;
public class atmsystemswitch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n) {
		case 1: System.out.println("Your balance is ₹25,000");
		case 2: System.out.println("Enter amount to deposit");
		case 3: System.out.println("Enter amount to withdraw");
				break;
		case 4: System.out.println("Displaying mini statement...");
		case 5: System.out.println("Thank you for using our ATM.");
		
		default : System.out.println("invalid choice");

		}
	}

}
