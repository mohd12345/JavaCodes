import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		WelcomePage frame = new WelcomePage();
		frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public WelcomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		JLabel lblWelcomeInLogin = new JLabel("WELCOME  IN LOGIN");
		lblWelcomeInLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWelcomeInLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeInLogin.setBounds(253, 191, 260, 56);
		contentPane.add(lblWelcomeInLogin);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("FILE");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmOjha = new JMenuItem("Game 1");
		mntmOjha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			GameOne gameone = new GameOne();
			gameone.setVisible(true);
			}
		});
		mnNewMenu.add(mntmOjha);
		
		JMenuItem mntmAazam = new JMenuItem("Game 2");
		mnNewMenu.add(mntmAazam);
		
		JMenu mnNewMenu_1 = new JMenu("EDIT");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("VIEW");
		menuBar.add(mnNewMenu_2);
		//menuBar.setBounds(197, 68, 97, 21);
		//contentPane.add(menuBar);
	}
}
