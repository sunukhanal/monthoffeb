package day4;
import java.util.Scanner;

public class TenaryOperator {

	public static void main(String[] args) {
		System.out.println("Enter the number....");
		//Scanner is a inbuild class which is going to use for taking input from console level
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		String result;
		result=(num<=20)? "Good Morning":"Good Evening";
		System.out.println(result);
		scan.close();

	}

}
