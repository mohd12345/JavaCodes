import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class StudentRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
    public void showStudentInformation() throws IOException, ClassNotFoundException{
    	String path = "F:\\aazam.text";
    	FileInputStream fi = new FileInputStream(path);
    	ObjectInputStream os = new ObjectInputStream(fi);
    	studentSerialization getStudent = (studentSerialization)os.readObject();
    	System.out.println(getStudent.password+"  "+getStudent.username);
    	if(textField.getText().equals(getStudent.username)&&passwordField.getText().equals(getStudent.password))
    	{
    System.out.println("Done.....");
    RegisteredInformation ri = new RegisteredInformation(getStudent.name, getStudent.username, getStudent.fathername, getStudent.course, getStudent.year, getStudent.phoneno, getStudent.permanentaddress, getStudent.temporaryaddress);
   	}
    	os.close();
    	fi.close();
    	
    }
	
	public static void main(String[] args) {
		long starttime  = System.currentTimeMillis();
		StudentRegistration frame = new StudentRegistration();
					frame.setVisible(true);
					long endtime = System.currentTimeMillis();
					System.out.println(endtime-starttime);
				
	}
	public StudentRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 360);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblRegistrationForm = new JLabel("STUDENT REGISTRATION");
		lblRegistrationForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationForm.setForeground(Color.RED);
		lblRegistrationForm.setFont(new Font("Vijaya", Font.BOLD, 26));
		lblRegistrationForm.setBounds(10, 11, 441, 26);
		contentPane.add(lblRegistrationForm);
		
		JLabel lblEmailId = new JLabel("Email id");
		lblEmailId.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailId.setFont(new Font("Vijaya", Font.BOLD, 16));
		lblEmailId.setBounds(81, 74, 64, 14);
		contentPane.add(lblEmailId);
		
		textField = new JTextField();
		textField.setBounds(164, 71, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Vijaya", Font.BOLD, 16));
		lblPassword.setBounds(81, 110, 64, 20);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(164, 110, 139, 20);
		contentPane.add(passwordField);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					showStudentInformation();
				} catch (ClassNotFoundException | IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnLogIn.setBounds(149, 171, 82, 23);
		contentPane.add(btnLogIn);
		
		JButton btnRegister = new JButton("Sign up");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StudentInformation rp = new StudentInformation();
				rp.setVisible(true);
				StudentRegistration.this.setVisible(false);
				
			}
		});
		btnRegister.setBounds(231, 171, 82, 23);
		contentPane.add(btnRegister);
	}
}
