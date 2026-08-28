package iterativestatements;
import java.util.Scanner;
public class foodorderingsystem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1: System.out.println("pizza");
				System.out.println(250);
				break;
		case 2: System.out.println("burger");
				System.out.println(120);
				break;
		case 3: System.out.println("sandwitch");
				System.out.println(345);
				break;
		case 4: System.out.println("biryani");
				System.out.println(545);
				break;
		case 5: System.out.println("coffee");
				System.out.println(100);
				break;
				
		default: System.out.println("item not available");
		
		}
	}

}
