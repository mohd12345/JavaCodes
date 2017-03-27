import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

class LoginDemo extends JFrame {
	private JTextField UserNametext;
	private JPasswordField PasswordField;
	private JLabel l1,l2;
	private JPanel contentPane;
	private JLabel lblPassword;
    private boolean Show(){
    	Database obj = new Database();
    	DTO[] array = obj.getDB();
    	

    	for(DTO ob:array){
    		if(ob.getUserName().equals(UserNametext.getText())&&ob.getPassword().equals(PasswordField.getText())){
    			return true;
    		}
    	}
    	return false;
    }
    
    public LoginDemo() {
    	setLocationRelativeTo(null);
    	setTitle("Aazam");
		setBackground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 408);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(9, 9, 9, 9));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log in Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(341, 21, 142, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblUsername.setBounds(219, 69, 98, 14);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblPassword.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblPassword.setBounds(215,113,81,14);
		
		contentPane.add(lblPassword);
		UserNametext = new JTextField();
		UserNametext.setBounds(341, 68, 142, 20);
        contentPane.add(UserNametext);
		UserNametext.setColumns(10);
		
		PasswordField = new JPasswordField();
		PasswordField.setEchoChar('*');
		PasswordField.setBounds(341, 112, 142, 20);
		contentPane.add(PasswordField);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.setBackground(SystemColor.activeCaption);
		btnLogIn.setIcon(null);
		btnLogIn.setMnemonic('o');
		btnLogIn.setText("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	WelcomePage screen = new WelcomePage();
			//	screen.setVisible(true);
				if(UserNametext.getText().length()==0&&PasswordField.getText().length()==0){
		    		l1.setText("Enter the UserName");
		    		l2.setText("Enter the Password");
				}	
				else
				{
				boolean t = Show();
				if(t){
					WelcomePage screen1 = new WelcomePage();
					screen1.setVisible(true);
		    	}
		    	else{
		    		JOptionPane.showMessageDialog(null,"Wrong");
		    	}
				}
				
			}
		});
		btnLogIn.setBounds(327, 195, 81, 24);
		contentPane.add(btnLogIn);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setIcon(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserNametext.setText(null);
				PasswordField.setText(null);
				l1.setText(null);
				l2.setText(null);
				UserNametext.requestFocusInWindow();
			
			}
		});
		btnNewButton.setBounds(418, 196, 78, 23);
		contentPane.add(btnNewButton);
		
		 l1 = new JLabel("");
		 l1.setForeground(Color.RED);
		 l1.setBounds(341, 87, 142, 14);
		 contentPane.add(l1);
	
		 l2 = new JLabel("");
		 l2.setForeground(Color.RED);
		 l2.setBounds(341, 132, 142, 14);
		contentPane.add(l2);
	}
    
	public static void main(String[] args) {
			
					LoginDemo frame = new LoginDemo();
					frame.setVisible(true);
	}
}

