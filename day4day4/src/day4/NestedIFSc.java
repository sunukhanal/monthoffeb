package day4;
import java.util.Scanner;

public class NestedIFSc {

	public static void main(String[] args) {
		
		
		System.out.println("eneter the num:");
		Scanner scan= new Scanner (System.in);
		int num=scan.nextInt();
		
		
		if(num==10) {
			System.out.println("num is 10");
		}
if(num==14) {
	System.out.println("num is 14");
	scan.close();
}
System.out.println("nothing");
	}

}
