import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class studentSerialization implements Serializable {
	String name;
	String username;
	String password;
	String fathername;
	String course;
	String year;
	String phoneno;
	String permanentaddress;
	String temporaryaddress;
//	static public ArrayList<studentSerialization> list = new ArrayList<>();
	public studentSerialization(String name, String username, String password, String fathername, String course,
			String year, String phoneno, String permanentaddress, String temporaryaddress) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.fathername = fathername;
		this.course = course;
		this.year = year;
		this.phoneno = phoneno;
		this.permanentaddress = permanentaddress;
		this.temporaryaddress = temporaryaddress;
	}

	@Override
	public String toString() {
		return "studentSerialization [name=" + name + ", username=" + username + ", password=" + password
				+ ", fathername=" + fathername + ", course=" + course + ", year=" + year + ", phoneno=" + phoneno
				+ ", permanentaddress=" + permanentaddress + ", temporaryaddress=" + temporaryaddress + "]";
	}

	

}