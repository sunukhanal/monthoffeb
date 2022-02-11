package day4;

public class SwitchCase2 {

	public static void main(String[] args) {
		String str="dd";
		switch(str)  {
		case"BB":
			System.out.println("CASE BB is ready");
			break;
		case"AA":
			System.out.println("CASE AA is ready");
			break;
		case"dd":
			int x=3;
			int y=4;
			int z=x+y;
			System.out.println("sum of two "+z);
			System.out.println("CASE dd is ready");
			break;
			default:
				System.out.println("DEFAULT CASE is ready");
				break;
		
		}

	}

}
