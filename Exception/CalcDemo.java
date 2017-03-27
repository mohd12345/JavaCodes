import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class CalcDemo{
	static Scanner scanner=new Scanner(System.in);
	static float firstNo;
	static float secondNo;
	static float result;
	static Logger logger  = Logger.getLogger(CalcDemo.class);
	static String ErrorMessageInfo(Exception exc){
		StringWriter sw = new StringWriter();
		PrintWriter  pw = new PrintWriter(sw);
		exc.printStackTrace(pw);
		
		return sw.toString();
		
	}
	static void firstno(){
		logger.debug("I am inside the FirstNo...");
		try{
			System.out.println("Enter the First No......");
            firstNo= scanner.nextFloat();
		}
		catch(InputMismatchException e){
			String errormessage = ErrorMessageInfo(e);
			logger.error(errormessage);
			System.out.println("You Entered String Please Enter Valid no");	
		    scanner.nextLine();
		    firstno();
		}
		logger.debug("I am outside the FirstNo...");
	}
	static void secondno(){
          logger.debug("I am inside the SecondNo...");
		try{
			System.out.println("Enter the Second No...");

		  secondNo= scanner.nextFloat();
		}
		catch(InputMismatchException e2){
			String errormessage = ErrorMessageInfo(e2);
			logger.error(errormessage);
		System.out.println("You Entered String Please Enter Valid no");	
		scanner.nextLine();
		secondno();
		}
		logger.debug("I am Outside the SecondNo...");
	}
	static void Addition(){
		result = firstNo+secondNo;
	}
	static void Subtraction(){
		result = firstNo-secondNo;
	}
	static void Multiplication(){
	 	result = firstNo*secondNo;
	}
	static void Division(){
		logger.debug("I am Inside the Divide ");
		try{
			result = firstNo/secondNo;
		}
		catch(ArithmeticException divide){
			String errormessage = ErrorMessageInfo(divide);
			logger.error(errormessage);
			System.out.println("Don't to be Enter ZERO(0) Second No. Try Again");
		secondno();
		}
		logger.debug("I am outside the Divide ");
	}
	public static void main(String[] args) {
		System.out.println("1 : Addition");
		System.out.println("2 : Subtraction");
		System.out.println("3 : Multiplication");
		System.out.println("4 : Division");
		System.out.print("Press Enter your Choice Which You want to perform Any Operation : ");
		int choice  = scanner.nextInt();
           switch(choice){
       case 1:   firstno();
                 secondno(); 
    	         Addition();   
                 System.out.println("Addtion of Two No. is : "+result);
                 break;
       case 2:   firstno();
                 secondno();
    	         Subtraction();
                 System.out.println("Subtraction of Two no is : "+result);
                 break;
       case 3:   firstno();
                 secondno();
    	         Multiplication();
                 System.out.println("Multiplication of Two no is : "+result);
                 break;
       case 4:   firstno();
                 secondno();
    	         Division();
                 System.out.println("Division of Two no is : "+result);
                 break;
       default:  System.out.println("You choose Wrong choice");          
       }       
	}
}
