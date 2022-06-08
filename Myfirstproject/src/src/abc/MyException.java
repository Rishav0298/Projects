package src.abc;

public class MyException extends Exception {
	
//	private static double[] balance= {10000.00, 12000.00, 15000.00,1000.00};
	private static String s="Hi";
	MyException() {}
	
	MyException(String str){
		super(str);
	}
	

	public static void main(String[] args) {
		try {
//		for(int i=0;i<4;i++) {
//			if(balance[i]<2000.00) {
//				MyException myexception=new MyException("Low Balance");
//				throw myexception;
//			}
//			System.out.println("Balance "+i+":"+balance[i]);
//		}
			
			if(s.length()>1) {
			MyException s=new MyException("string out of bound");
			throw s;}
			System.out.println("Length "+s+":"+s.length());
		}
		catch(MyException m) {
			m.printStackTrace();
		}

	}

}
