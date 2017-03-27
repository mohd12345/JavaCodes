import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPopupMenuDemo extends JFrame {

	private JPanel f;

	
	public static void main(String[] args) {
		
		JPopupMenuDemo frame = new JPopupMenuDemo();
					frame.setVisible(true);
				
	}

	
	public JPopupMenuDemo() {
		 final JPopupMenu  popupmenu = new JPopupMenu("Application");
          JMenuItem notepad = new JMenuItem("Notepad");
          notepad.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		NotePad note =new NotePad();
          		note.setVisible(true);
          			
          	}
          });
          JMenuItem registration = new JMenuItem("Registartion");
          registration.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          	  StudentRegistration sr = new StudentRegistration();
          	  sr.setVisible(true);
          				
          	}
          });
          JMenuItem delete = new JMenuItem("Delete");

          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		f = new JPanel();
		f.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(f);
		f.setLayout(null);
		popupmenu.add(notepad);
		popupmenu.add(registration);
		popupmenu.add(delete);
		f.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				popupmenu.show(f, e.getX(),e.getY());
			}
		});
		
		f.add(popupmenu);
        	
	}

}
