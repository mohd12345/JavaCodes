class Account{
	int salary;
	String name ;
	void withDraw()
	{
	System.out.println("Common Withdraw Call...");	
	}	
	void roi(){
		System.out.println("Account Roi 4% call");	
	}
	void deposit(){
		System.out.println("Common deposit call");
	}
}
class SavingAccount extends Account{
@Override
void withDraw(){
System.out.println("Saving Account withDraw...");	
}
@Override
void deposit(){
   	System.out.println("Saving Account deposit call...");
}
@Override
void roi(){
    	System.out.println("Saving Account 5% call");
}
}
class CurrentAccount extends Account{
	void odilimit(){
		System.out.println("Current Account odilimit is call...");
	}
	@Override
   void roi(){
		super.roi();
	   System.out.println("Current account roi 3%");
   }
}
class Commonclass{
    public void doCall(Account account)
    {
    	account.deposit();
    	account.roi();
    	account.withDraw();
    	if(account instanceof CurrentAccount){
    		CurrentAccount ca = (CurrentAccount) account;     // Down Casting
    		ca.odilimit();
    	}	
    }
}
public class ISADemo {
	/**
	 * @param args
	 * @param  
	 */
	public static void main(String[] args) {
		Commonclass common = new Commonclass();
		common.doCall(new SavingAccount());
		System.out.println("**********************************");
		common.doCall(new CurrentAccount());
		
		// TODO Auto-generated method stub
		/*Account account =  new SavingAccount();       // Up Casting
		account.deposit();
	    account.roi();	
    /*
      SavingAccount sa = new SavingAccount();
      sa.roi();
      sa.deposit();
      sa.withDraw();
      System.out.println("***************************************");
      CurrentAccount ca = new CurrentAccount();
      ca.odilimit();
      ca.roi();
    */
	}
}
