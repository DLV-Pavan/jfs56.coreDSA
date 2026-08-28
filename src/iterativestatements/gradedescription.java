package iterativestatements;
import java.util.Scanner;
public class gradedescription {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'A': System.out.println("excellent");
				break;
		case 'B' : System.out.println("Very Good");
				break;
		case 'C' : System.out.println("Good");
				break;
		case 'D' : System.out.println("needs improvement");
				break;
		case 'F' : System.out.println("failed");
				break;
				
		default : System.out.println("invalid grade");
		
		}
		
	}
	
}
