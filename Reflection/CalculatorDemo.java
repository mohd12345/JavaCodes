import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class simplecalculator{
	public int add(int a,int b){
		return a+b;
		
	}
	public int sub(int a,int b){
		return a-b;
		
	}
	public int multiply(int a,int b){
		return a*b;
		
	}
	public int divide(int a,int b){
		return a/b;
		
	}
	
}
class scientificcalculator{
	public float add(float a,float b){
		return a+b;
	}
	public float sub(float a,float b){
		return a-b;
	}
	public float multiply(float a,float b){
		return a*b;
	}
	public float divide(float a,float b){
		return a/b;
	}
}

public class CalculatorDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException  {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Press simplecalculator for Simple Calculator ");
		System.out.println("Press scientificcalculator for Scientific Calculator ");
		String name = scan.next();
	           Object object = Class.forName(name).newInstance();
	           System.out.println("Press add for addtion");
	           System.out.println("Press sub for subtraction");
	           System.out.println("Press multiply for multiplication");
	           System.out.println("Press divide for Division");
	           String m = scan.next();
	           Method method = object.getClass().getMethod(m,int.class,int.class);
	           Object result = method.invoke(object, 10,20);
	           System.out.println("Result is: "+result);
	}

}
