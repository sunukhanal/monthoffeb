package day4;

public class SwitchStatement2 {

	public static void main(String[] args) {
	char ch = 'd';
	switch (ch) {
	case 'a':
		int a=70;
		int b=20;
		int sum = a + b;
		System.out.println("sum="+sum);
		System.out.println("Case-a is ready");
		break;
	case 'd':
		int x=40;
		int y=10;
		int z = x+y;
		System.out.println("sum="+z);
		System.out.println("Case-b is ready");
		break;
		default:
			System.out.println("Does not match");
			break;
			
	}

	}

}
