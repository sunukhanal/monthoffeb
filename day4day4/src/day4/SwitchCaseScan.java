package day4;
import java.util.Scanner;

public class SwitchCaseScan {

	public static void main(String[] args) {
		// Passing integer value 2 as an integer in switch
		//we can do it through command line argument or from Scanner
		Scanner scan=new Scanner(System.in);
		//Create scanner object and read the value from the console
		// int day=2;
		System.out.println("Enter value");
		int day=scan.nextInt();
		
		
		//int day=9;
		switch (day) {
		case 1:
			System.out.println("MONDAY");
		break;
		case 2:
			System.out.println("TUESDAY");
		break;
		case 3:
			System.out.println("wednesday");
			break;
			default:
				System.out.println(" Number does not exist");
				break;
			
		}
		scan.close();

	}

}
