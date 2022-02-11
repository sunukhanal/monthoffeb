package day4;
import java.util.Scanner;

public class ScannerUser {

	public static void main(String[] args) {
		//int x=30
		System.out.println("Enter the number----");
		//Scanner is a inbuild class which is going to use for taking input from console level
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		if(num==10) {
			System.out.println("num is 10");
		}
		else if(num==12) {
			System.out.println("num is 12");
		}
		else if (num==20) {
			System.out.println("num is 20");
		}
		else {
			System.out.println("num is not matched");
		}
		scan.close();
	}

}
