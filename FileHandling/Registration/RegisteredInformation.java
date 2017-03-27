import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;

public class RegisteredInformation extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	
	public RegisteredInformation(String name,String username
			,String fathername,String course,
			String year,String phoneno,String permanent,String temporary) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
        setLocationRelativeTo(null);
		setBounds(100, 100, 450, 492);
		contentPane = new JPanel();
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentInformation = new JLabel("STUDENT INFORMATION");
		lblStudentInformation.setBackground(Color.RED);
		lblStudentInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentInformation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStudentInformation.setBounds(10, 11, 414, 24);
		contentPane.add(lblStudentInformation);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(81, 84, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(81, 106, 100, 14);
		contentPane.add(lblUserName);
		
		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setBounds(81, 128, 100, 14);
		contentPane.add(lblFathersName);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(81, 172, 100, 14);
		contentPane.add(lblYear);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(81, 150, 100, 14);
		contentPane.add(lblCourse);
		
		JLabel lblPhoneNo = new JLabel("Phone  No");
		lblPhoneNo.setBounds(81, 194, 100, 14);
		contentPane.add(lblPhoneNo);
		
		JLabel lblPermanentAddress = new JLabel("Permanent Address");
		lblPermanentAddress.setBounds(81, 216, 100, 14);
		contentPane.add(lblPermanentAddress);
		
		JLabel lblTemporayAddress = new JLabel("Temporay Address");
		lblTemporayAddress.setBounds(81, 238, 100, 14);
		contentPane.add(lblTemporayAddress);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(211, 84, 179, 14);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText(name);
		JLabel label = new JLabel("");
		label.setBounds(211, 106, 179, 14);
		contentPane.add(label);
		label.setText(username);
		JLabel label_1 = new JLabel("");
		label_1.setBounds(211, 128, 179, 14);
		contentPane.add(label_1);
		label_1.setText(fathername);
		JLabel label_2 = new JLabel("");
		label_2.setBounds(211, 150, 179, 14);
		contentPane.add(label_2);
		label_2.setText(course);
		JLabel label_3 = new JLabel("");
		label_3.setBounds(211, 172, 179, 14);
		contentPane.add(label_3);
		label_3.setText(year);
		JLabel label_4 = new JLabel("");
		label_4.setBounds(211, 194, 179, 14);
		contentPane.add(label_4);
		label_4.setText(phoneno);
		JLabel label_5 = new JLabel("");
		label_5.setBounds(211, 216, 179, 14);
		contentPane.add(label_5);
		label_5.setText(permanent);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(211, 238, 179, 14);
		contentPane.add(label_6);
		label_6.setText(temporary);
	}
}
