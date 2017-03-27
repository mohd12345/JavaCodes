import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class A{
	
	public A() {
		System.out.println("I am constructor");
	   
		
	}
	public int a;
	private String name;
	protected float salary;
	private void add(){
		System.out.println("I am addition ");
	}
	private void sub(){
		System.out.println("I am addition ");
	}
	
}



public class OtherExampe {

	public static void main(String[] args) throws Exception {
		Class c  = Class.forName("A");
		/*
		 * Othew way ----->>>>
		 * Class c = A.class;
		 */
		Object o = c.newInstance();
	
		Method method = c.getDeclaredMethod("add", null);
		method.setAccessible(true);
		method.invoke(o, null);
		
		
	}

}
