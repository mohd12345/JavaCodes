import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameOne extends JFrame {

	private JPanel contentPane;
   static final int BOARD_WIDTH = 600;
   static final int BOARD_HEIGHT = 600;
   static MP3Player play;
	public void askForClose(){
		int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to quit?","Game One", JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_OPTION==choice){
        
        	this.setVisible(false);
        	this.dispose();
        }
        if(JOptionPane.NO_OPTION==choice){
        	return;
        }
	}
    static void playsong(){
    	play = new MP3Player(GameOne.class.getResource("01 Lohe Da Liver - Aa Gaya Hero (SongsMp3.Com).mp3"));
    	play.play();
    }
	public static void main(String[] args) {
	
					GameOne frame = new GameOne();
					frame.setVisible(true);
	                playsong();			
	} 
	public GameOne() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askForClose();
				play.stop();
			}
		});
	
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(BOARD_WIDTH, BOARD_HEIGHT);
	    setLocationRelativeTo(null);
	    this.getContentPane().setLayout(null);
	    Board board = new Board();
	    this.getContentPane().add(board);
	    
	}

}
