package iterativestatements;
import java.util.Scanner;
public class evennumberbreak {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

        int i = 0;

        while (i < 10) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println(num);
                break;
            }

            i++;
        }

        System.out.println("No Even Number Found");
	}
}
