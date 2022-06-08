package src.roy;

public class JavaException {

	public static void main(String[] args) {
		
//			int a[]=new int[5];
			String a="Hello";
			System.out.println("Before error");
			try{
//				a[7]=12;
				char s= a.charAt(8);
//				System.out.println(s.length()+"int b= "+b);
			}
			catch(Exception e) {
				System.out.println("nfx handler: "+e);
			}
			
			finally {
			System.out.println("After error");
			}

	}

}
