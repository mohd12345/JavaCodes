import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPasteDemo {
static boolean copypaste(String source,String destination) throws IOException{
	
	if(new File(source).exists()){
		FileInputStream fi = new FileInputStream(source);
		BufferedInputStream bi = new BufferedInputStream(fi);
		StringBuffer sb = new StringBuffer();
		int sbr = bi.read();
		while(sbr!=-1){
			//System.out.println(sb);
		sb.append((char)sbr);
		sbr= bi.read();
		}
		FileOutputStream fo = new FileOutputStream(destination);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		bo.write(sb.toString().getBytes());
		bo.close();
		bi.close();
		fi.close();
		fo.close();
		return true;
		
	}
	return false;
}
	
	public static void main(String[] args) throws IOException {
		if(copypaste("C:\\Users\\Dell Laptop\\Downloads\\01 Lohe Da Liver - Aa Gaya Hero (SongsMp3.Com).mp3","F:\\aaazam.mp3")){
			System.out.println("File copied Successfully....");
		}
		else{
			System.out.println("File not Copy");
		}
	
	}
}
