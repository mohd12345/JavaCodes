import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	protected int c=0;
	static double FirstNo;
	static double SecondNo;
	static String operation;
	static String result;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 289, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 253, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnDel = new JButton("Del");
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length()>0){
					StringBuilder sb = new StringBuilder(textField.getText());
					sb.deleteCharAt(textField.getText().length()-1);
					textField.setText(sb.toString());
					c=0;
				}
			}
		});
		btnDel.setBounds(10, 60, 55, 54);
		frame.getContentPane().add(btnDel);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				textField.setText(null);
				c=0;
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClear.setBounds(75, 60, 55, 54);
		frame.getContentPane().add(btnClear);
		
		JButton btnPersent = new JButton("%");
		btnPersent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{FirstNo = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
				c=0;
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(frame, "Wrong Operation");
				}
			}
		});
		btnPersent.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPersent.setBounds(140, 60, 55, 54);
		frame.getContentPane().add(btnPersent);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{FirstNo = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
				c=0;}
				catch(Exception e1){
					JOptionPane.showMessageDialog(frame, "Wrong Operation");
				}
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdd.setBounds(208, 60, 55, 54);
		frame.getContentPane().add(btnAdd);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBounds(10, 127, 55, 54);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(75, 127, 55, 54);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(140, 127, 55, 54);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{FirstNo = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
				catch(Exception e1){
					JOptionPane.showMessageDialog(frame, "Wrong Operation");
				}}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnSub.setBounds(208, 127, 55, 54);
		frame.getContentPane().add(btnSub);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(10, 192, 55, 54);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(75, 192, 55, 54);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(140, 192, 55, 54);
		frame.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try{	FirstNo = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
				c=0;
			}
			catch(Exception e1){
				JOptionPane.showMessageDialog(frame, "Wrong Operation");
			}
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMul.setBounds(208, 192, 55, 54);
		frame.getContentPane().add(btnMul);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(10, 257, 55, 54);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(75, 257, 55, 54);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(140, 257, 55, 54);
		frame.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try{	FirstNo = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
				c=0;
			}
			catch(Exception e1){
				JOptionPane.showMessageDialog(frame, "Wrong Operation");
			}}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDiv.setBounds(208, 257, 55, 54);
		frame.getContentPane().add(btnDiv);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setBounds(10, 323, 55, 54);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(c==0){
					c++;
					String EnterNumber = textField.getText()+btnDot.getText();
				textField.setText(EnterNumber);
				}
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(75, 322, 55, 54);
		frame.getContentPane().add(btnDot);	
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double answer;
				c=1;
				if(operation=="%"){
					SecondNo = Double.parseDouble(textField.getText());
					answer = FirstNo%SecondNo;
					result = String.valueOf(answer);
					textField.setText(result);
					
				}
				else 
				if(operation=="+"){
					SecondNo = Double.parseDouble(textField.getText());
					answer = FirstNo+SecondNo;
					result = String.valueOf(answer);
					textField.setText(result);	
				}
				else 
					if(operation=="*"){
						SecondNo = Double.parseDouble(textField.getText());
						answer = FirstNo*SecondNo;
						result = String.valueOf(answer);
						textField.setText(result);	
					}
					else 
						if(operation=="/"){
							SecondNo = Double.parseDouble(textField.getText());
							answer = FirstNo/SecondNo;
							result = String.valueOf(answer);
							textField.setText(result);
							
						}
						else 
							if(operation=="-"){
								SecondNo = Double.parseDouble(textField.getText());
								answer = FirstNo-SecondNo;
								result = String.valueOf(answer);
								textField.setText(result);
								
							}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEqual.setBounds(208, 322, 55, 54);
		frame.getContentPane().add(btnEqual);
		
		JButton btnSign = new JButton("+-");
		btnSign.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double sign;
				sign = Double.parseDouble(textField.getText())*(-1);
				textField.setText(String.valueOf(sign));
				
			}
		});
		btnSign.setBounds(140, 322, 55, 54);
		frame.getContentPane().add(btnSign);
	}
}
