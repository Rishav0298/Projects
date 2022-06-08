
public class Mymain {

	public static void main(String[] args) {
		int a =100;
		String s="Hi";
		System.out.println("Before error");
		try{
			int b=Integer.parseInt(s);
			System.out.println(s.length()+"int b= "+b);
		}
		catch(ArithmeticException e) {
			System.out.println("Caught" + e);
		}
		catch(NumberFormatException nfx) {
			System.out.println("nfx handler: "+nfx);
		}
		catch(Exception e1) {
			System.out.println("for string "+ e1);
		}
		finally {
		System.out.println("After error");
		}
	}

}