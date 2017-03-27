public class Calls{
static void db() throws ArithmeticException{
		try{
		System.out.println("Connection Open...");
		int e = 10/0;
    	System.out.println("Query Executed...");
		}
		finally{
		System.out.println("Connection Close");
		}
		}
	static void bl() throws ArithmeticException{
		System.out.println("BL Start");
		db();
		System.out.println("BL End");
	}
	static void ui(){
		System.out.println("Screen Open..");
		try{
		bl();
		}
		catch(ArithmeticException e){
			System.out.println("Some Problem Occur Try After Some time...");
		}
		System.out.println("Screen Close");
	}
	
	public static void main(String[] args) {
		ui();
	}

}
