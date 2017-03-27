import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class StudentInformation extends JFrame implements Serializable {

	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JPasswordField password;
	private JTextField fathername;
	private JTextField course;
	private JTextField year;
	private JTextField phoneno;
	private JTextField permanentaddress;
	private JTextField temporaryaddress;

	private void SaveStudentInformation() throws IOException{
	    String path = "F:\\aazam.text";
	    FileOutputStream fo = new FileOutputStream(path);
	    ObjectOutputStream os = new ObjectOutputStream(fo);
		studentSerialization student = new studentSerialization(name.getText(), username.getText(), password.getText(), fathername.getText(), course.getText(), year.getText(), phoneno.getText(), permanentaddress.getText(), temporaryaddress.getText());

		os.writeObject(student);
		os.close();
		fo.close();
	}
	public StudentInformation() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 497);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.PINK);
		this.setLocationRelativeTo(null);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistraionForm = new JLabel("Registraion Form");
		lblRegistraionForm.setForeground(Color.RED);
		lblRegistraionForm.setBackground(Color.WHITE);
		lblRegistraionForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistraionForm.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegistraionForm.setBounds(10, 11, 417, 42);
		contentPane.add(lblRegistraionForm);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(97, 64, 60, 14);
		contentPane.add(lblName);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(97, 97, 80, 14);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(97, 125, 60, 14);
		contentPane.add(lblPassword);
		
		JLabel lblFathersName = new JLabel("Father's  Name");
		lblFathersName.setBounds(97, 153, 100, 14);
		contentPane.add(lblFathersName);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(97, 181, 46, 14);
		contentPane.add(lblCourse);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(97, 209, 46, 14);
		contentPane.add(lblYear);
		
		JLabel lblPhoneNo = new JLabel("Phone No.");
		lblPhoneNo.setBounds(97, 237, 80, 14);
		contentPane.add(lblPhoneNo);
		
		JLabel lblAddress = new JLabel("Permanent Address");
		lblAddress.setBounds(97, 265, 120, 18);
		contentPane.add(lblAddress);
		
		JLabel lblTemporaryAddress = new JLabel("Temporary Address");
		lblTemporaryAddress.setBounds(97, 293, 120, 18);
		contentPane.add(lblTemporaryAddress);
		
		name = new JTextField();
		name.setBounds(214, 69, 142, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(214, 97, 142, 20);
		contentPane.add(username);
		
		password = new JPasswordField();
		password.setBounds(214, 122, 142, 20);
		contentPane.add(password);
		
		fathername = new JTextField();
		fathername.setColumns(10);
		fathername.setBounds(214, 153, 142, 20);
		contentPane.add(fathername);
		
		course = new JTextField();
		course.setColumns(10);
		course.setBounds(214, 181, 142, 20);
		contentPane.add(course);
		
		year = new JTextField();
		year.setColumns(10);
		year.setBounds(214, 209, 142, 20);
		contentPane.add(year);
		
		phoneno = new JTextField();
		phoneno.setColumns(10);
		phoneno.setBounds(214, 237, 142, 20);
		contentPane.add(phoneno);
		
		permanentaddress = new JTextField();
		permanentaddress.setColumns(10);
		permanentaddress.setBounds(214, 265, 142, 20);
		contentPane.add(permanentaddress);
		
		temporaryaddress = new JTextField();
		temporaryaddress.setColumns(10);
		temporaryaddress.setBounds(214, 293, 142, 20);
		contentPane.add(temporaryaddress);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					SaveStudentInformation();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        }
		});

		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(177, 346, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText(null);
				username.setText(null);
				fathername.setText(null);
				course.setText(null);
				course.setText(null);
				year.setText(null);
				phoneno.setText(null);
				permanentaddress.setText(null);
				temporaryaddress.setText(null);
				password.setText(null);
			}
		});
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(267, 346, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
