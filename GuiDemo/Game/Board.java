import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel {
    Timer timer,timer2;
	Plane plane;
	Enemy enemy ;
	Missile missile;
	ArrayList<Enemy> enemyList = new ArrayList<>();
	static final int PLANEDELAY = 10;
@Override	
public void paintComponent(Graphics g){	
  super.paintComponent(g);
   Graphics2D twod  = (Graphics2D) g;
   Graphics2D enemytwod = (Graphics2D) g;
  
   if(enemyList.size()>0){
	twod.drawString("Enemy left "+enemyList.size(),0, 10);
	if(plane.isVisible()){
	twod.drawImage(plane.getHelicopterimage(),plane.getX(),plane.getY(),this);
	}
for(int j=0;j<enemyList.size();j++){
enemy = enemyList.get(j);
if(enemy.isVisible()){
	enemy.enemymove();
	enemytwod.drawImage(enemy.getEnemyimage(),enemy.getVelX(),enemy.getVelY(),this);
}
if(enemy.getRectangle().intersects(plane.getRectangle())){
	
	enemy.setVisible(false);
	enemyList.remove(j);
}
}
   }
   else{
	   twod.drawString("Game Over",300, 300);  
	   timer.stop();
   }
   if(missile.isVisible){
   twod.drawImage(missile.getImage(), this.getX(),this.getY(),this);
   }
}
public void BuildEnemy(){
	int enemyPosition[][] = {
			{700,30},{500,90},{600,130},{500,230},{1200,40},
			{1700,130},{700,430},{700,330},{600,100},{700,250},
			{700,109},{600,130},{500,330},{700,100},{500,230},
			{700,409},{600,230},{500,430},{700,440},{500,130}
	};
	for(int i=0;i<enemyPosition.length;i++){
		
		enemyList.add(new Enemy(enemyPosition[i][0],enemyPosition[i][1]));
	}
}
public void PlaneUpdate(){
	timer = new Timer(PLANEDELAY,new ActionListener() {	
		@Override
		public void actionPerformed(ActionEvent e) {
		plane.move();
		repaint();
		}
	});
	timer.start();
}
	Board(){
		this.setFocusable(true);
		this.setBounds(0, 0, GameOne.BOARD_WIDTH, GameOne.BOARD_HEIGHT);
		setBackground(Color.cyan);
	    plane = new Plane();
        BuildEnemy(); 	   
	  this.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyPressed(KeyEvent e){
	    		plane.PlaneMove(e);
	    	}
	    	@Override
	    	  public void keyReleased(KeyEvent e) {
	    		plane.dontmove();
	    	}
	
		});
    PlaneUpdate();
   
}
}