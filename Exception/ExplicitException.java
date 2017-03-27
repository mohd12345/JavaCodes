import java.util.Scanner;

class TransactionFailException extends RuntimeException{
	private int balance;
	private int amount;
	@Override
	public String toString() {
		return "Your balance is low balance is = " + balance;
	}
	public TransactionFailException(int balance, int amount) {
		this.balance = balance;
		this.amount = amount;
	}
	
}


public class ExplicitException {

	
	public static void main(String[] args) {
		int balance=0;
		System.out.println("Enter the amount to withdraw...");
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		try{
		
		if(balance<=0){
			throw new TransactionFailException(balance,amount);
		}
		}
		catch(TransactionFailException e){
			System.out.println(e);
		}
	}

}
