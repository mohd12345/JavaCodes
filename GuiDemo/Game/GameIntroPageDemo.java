import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;

class GameIntroPageDemo extends JWindow{
    boolean visible=false;
	private JPanel contentPane;
	JLabel lblNewLabel=new JLabel("");
	JLabel lblNewLabel_1;
	Timer timer;
   private int counter=0;
	JProgressBar progressBar=new JProgressBar();
	
	MP3Player music;
	static final int DELAY = 300;
	private void playMusic(){
		File file = new File("C:\\Users\\Dell Laptop\\Downloads\\01 Lohe Da Liver - Aa Gaya Hero (SongsMp3.Com).mp3");
		music = new MP3Player(file);
	   music.play();
	}
	private void forVisible(){
		  
		 timer = new Timer(DELAY,new ActionListener() {  
				@Override
				
				public void actionPerformed(ActionEvent e) {
			     
					if(counter>=100)
					{
						LoginDemo login = new LoginDemo();
						login.setVisible(true);
						timer.stop();
						music.stop();
						GameIntroPageDemo.this.setVisible(false);		
					}
			     lblNewLabel_1.setVisible(visible);
					visible = !visible;
					 progressBar.setValue(counter);
						counter++;
				}
			});
			
		
	    timer.start();
	}
	
	private void ShowIcon(){
		Icon icon = new ImageIcon(GameIntroPageDemo.class.getResource("ab5b1cd07521.gif"));
		lblNewLabel.setIcon(icon);
	}
	public static void main(String[] args) {
		
					GameIntroPageDemo frame = new GameIntroPageDemo();
					frame.setVisible(true);
					frame.ShowIcon();
                     frame.forVisible();
                     frame.playMusic();
	}
	    public GameIntroPageDemo() {
	    	setLocationRelativeTo(null);
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 503);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setExtendedState(this.MAXIMIZED_BOTH);

		lblNewLabel.setBounds(10, 11, 751, 426);
		contentPane.add(lblNewLabel);
		
	    lblNewLabel_1=new JLabel("Game Start");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(299, 448, 166, 22);
		contentPane.add(lblNewLabel_1);
		progressBar.setStringPainted(true);
		
//	    JProgressBar progressBar = new JProgressBar();
		progressBar.setEnabled(false);
		progressBar.setStringPainted(true);
		progressBar.setIndeterminate(true);
		progressBar.setForeground(Color.MAGENTA);
		progressBar.setFont(new Font("Tahoma", Font.BOLD, 16));
		progressBar.setBounds(10, 478, 751, 14);
		contentPane.add(progressBar);
	}
}
 