import java.util.ArrayList;
import java.util.Scanner;

class Pool{
	int age;
	String name;
	static ArrayList<Pool> pool = new ArrayList<>();
	public static Pool Intern(int age,String name){
		boolean isFound = false;
		if(pool.size()==0)
		{
			Pool obj = new Pool(age, name);
			pool.add(obj);
			System.out.println("A Fresh Object inserted in Pool");
			return obj;
		}
		else
		{
			for(Pool obj : pool)
			{
				if(obj.age==age && obj.name==name)
				{
                  System.out.println("Age and name Already present in the Pool");
                  isFound  = true;
                  return obj;
                }
			}
			    if(!isFound)
				{
					Pool obj = new Pool(age, name);
					pool.add(obj);
					System.out.println("A new object added in the pool");
					return obj;
				}
		}
	return null;		    
	}
	private Pool(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
}
public class StringDemo{
	public static void main(String[] args){
		
		
		Pool obj1 = Pool.Intern(10, "aazam");
		Pool obj2 = Pool.Intern(10,"aazam");
	    Pool obj3 = Pool.Intern(20, "mohd");
	    if(obj1==obj2)
	    {
	    	System.out.println("Same reference....");
	    	
	    }
	    else{
	    	System.out.println("Different reference....");
	    }
	    if(obj2==obj3)
	    {
	    	System.out.println("Same reference....");
	    	
	    }
	    else{
	    	System.out.println("Different reference....");
	    }
	}
}
