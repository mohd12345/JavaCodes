
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Palindrome {

	
	public static void main(String[] args){
	   
		StringBuffer sb = new StringBuffer("HeeH");
		StringBuffer sd = new StringBuffer("HeeH");
        sb.reverse();
        if(sb.toString().equals(sd.toString())){
        	System.out.println("String is Palindrome");
        }
        else
        {
        	System.out.println("String is not Palindrome");
        }
       
	}

}
