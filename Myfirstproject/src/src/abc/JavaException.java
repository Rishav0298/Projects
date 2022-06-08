package src.abc;

public class JavaException {

	public static void main(String[] args) {
		try {
			System.out.println("Dividing by 0");
			int a=12/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
			System.out.println("Array out of bounds");
			int b[]=new int[3];
			b[7]=10;
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
