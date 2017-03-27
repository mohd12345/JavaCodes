import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.text.StyledEditorKit.FontSizeAction;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.JColorChooser;
import javax.swing.JDialog;

public class NotePad extends JFrame {

	private JPanel contentPane;
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane();

	private void OpenFile() throws IOException{
		String path = "E:\\aazam";
		 
		JFileChooser showDialog = new JFileChooser(path);
		showDialog.showOpenDialog(this);
		File file = showDialog.getSelectedFile();
		String filepath = file.getPath();
	   
		textArea.setText(FileOperation.readFile(filepath));
   
	}
	private void SaveFile() throws IOException{
		String path = "E:\\aazam";
		JFileChooser showDialog = new JFileChooser(path);
		showDialog.showSaveDialog(this);
		File file = showDialog.getSelectedFile();
		String path2 = file.getPath();
        FileOperation.writeFile(textArea.getText(), path2);	
	}
	
	public static void main(String[] args) {
		
					NotePad frame = new NotePad();
					frame.setVisible(true);
				
	}

	private void resizeDisplay(){
		scrollPane.setSize(this.getWidth()-28,this.getHeight()-65);
		textArea.setSize(this.getWidth()-28,this.getHeight()-65);

	}
	public NotePad() {
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
			resizeDisplay();
			
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
	this.setJMenuBar(menuBar);
		//contentPane.add(menuBar);
		
		JMenu File = new JMenu("File");
		menuBar.add(File);
		
		JMenuItem New = new JMenuItem("New");
		File.add(New);
		
		JMenuItem Open = new JMenuItem("Open");
		Open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				OpenFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		
	
		File.add(Open);
		
		JMenuItem Save = new JMenuItem("Save");
		Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					SaveFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		File.add(Save);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnFormate = new JMenu("Format");
		menuBar.add(mnFormate);
		
		JMenuItem mntmFont = new JMenuItem("Font");
		mntmFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		mnFormate.add(mntmFont);
		
		JMenuItem mntmSetPadColor = new JMenuItem("Set Pad Color");
		mntmSetPadColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showBackgrounddialog();
			}
		});
		mnFormate.add(mntmSetPadColor);
		
		JMenuItem mntmSetTextColor = new JMenuItem("Set Text Color");
		mntmSetTextColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showForegroundColorDialog();
			}

		
		});
		mnFormate.add(mntmSetTextColor);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
	
		scrollPane.setBounds(6, 0, 429, 241);
		contentPane.add(scrollPane);
		
	
		textArea.setFont(new Font("Monospaced", Font.BOLD, 23));
		textArea.setBounds(6, 26, 400, 241);
		scrollPane.setViewportView(textArea);
		
		
	}
	public void showBackgrounddialog(){
		JColorChooser bColorChooser = new JColorChooser();
		 JDialog bdialog = JColorChooser.createDialog(this,"set Pad Color", false, bColorChooser,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.setBackground(bColorChooser.getColor());
			}
		},null);
		 bdialog.setVisible(true);
	}
	 public void showForegroundColorDialog(){
		 
		 JColorChooser fColorChooser = new JColorChooser();
		 JDialog fdialog = JColorChooser.createDialog(this,"set Text Color", false, fColorChooser,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.setForeground(fColorChooser.getColor());
			}
		},null);
		 fdialog.setVisible(true);
	 }
}
