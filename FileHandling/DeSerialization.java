import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization{
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path = "E:\\aazam.dat";
		FileInputStream fi = new FileInputStream(path);
		ObjectInputStream oi = new ObjectInputStream(fi);
		int c=0;
		Employee obj=(Employee)oi.readObject();
		try{while(obj!=null)
		{
			c = c+1;
			System.out.println(c+") "+obj);
		obj=(Employee)oi.readObject();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		oi.close();
		fi.close();
			
		}
}