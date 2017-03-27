import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {
	static String readFile(String path) throws IOException{
		// Open a file
		FileInputStream fs = new FileInputStream(path);
		StringBuffer sb = new StringBuffer();
		// read a file
		int singleByte = fs.read();  // read singleByte
		while(singleByte!=-1){
			sb.append((char)singleByte);
			///System.out.print((char)singleByte);
			singleByte = fs.read();
		}
		fs.close();  // close the file
		System.out.println(sb.toString());
		return sb.toString();
	}
	static public void writeFile(String data,String path) throws IOException{
		
	FileOutputStream fo = new FileOutputStream(path);
      fo.write(data.getBytes());
	     fo.close();
   }
	
	public static void main(String[] args) throws IOException {
	readFile(null);
		
	}
}
