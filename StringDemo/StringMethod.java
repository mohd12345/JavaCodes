import java.util.LinkedList;

public class StringMethod{
	
	public static void main(String[] args) {
		String name = "my name is mohd aazam";
		String ar[]= name.split(" ");
		for(int i=0;i<ar.length;i++){
			char arr[] = ar[i].toCharArray();
		    System.out.print(ar[i].toUpperCase().charAt(0));
		   for(int j=1;j<arr.length;j++){
				System.out.print(String.valueOf(arr[j]));
			}
			System.out.print(" ");
		}	
	}
}

		/*		// TODO Auto-generated method stub
		String name = "mohdaazam@gmail.com";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		int index = name.indexOf("@");
		int index2 = name.lastIndexOf(".");
		System.out.println(index +" " +index2);
		if(index>=0 && index2>6)
		{
			System.out.println("Valid email");
		}
		else{
			System.out.println("Invalid email");
		}
		String myname = "my name is khaan";
		
		
	
		char t3 = myname.charAt(0);
		String r = ""+t3;
		System.out.println(r.concat(String.valueOf(t3)));
		String msg = "Hello How are You";
		String ar[] = msg.split(" ");
		System.out.println("Word Count "+ar.length);
		/*if(t!=null && t.equals("amit")){
			System.out.println("Same Amit");
		}*/
		

