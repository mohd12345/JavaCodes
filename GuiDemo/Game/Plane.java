import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Plane {

	private int x;
	private int y;
	private int width;
	private int height;
	private Image helicopterimage;
	private int planevelX;
	private int planevelY;
	private boolean isVisible = false;
	Plane(){
		isVisible = true;
		x=100;
		y=50;
		helicopterimage = new ImageIcon(Plane.class.getResource("Helicopter.gif")).getImage(); 
		height = helicopterimage.getHeight(null);
		width = helicopterimage.getWidth(null);
		
	}
	public void missileLaunch(){
		Missile missile =  new Missile();
		missile.setX(this.getX()+this.getWidth());
		missile.setY(this.getY());
	}
	
	public void PlaneMove(KeyEvent e){
		
		if(e.getKeyCode()==KeyEvent.VK_SPACE){
			
		//	missileLaunch();
		}
		if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			if(y==0){
			planevelY=0;
		}
		else
		{
			planevelY=-2;		
		}
		}
		else
			if(e.getKeyCode()==KeyEvent.VK_DOWN){
				planevelY=2;		
			}
			else
				if(e.getKeyCode()==KeyEvent.VK_LEFT){
						if(x==0){
						planevelX=0;
					}
					else{
					planevelX=-2;		
				}
					
					}
				else
					if(e.getKeyCode()==KeyEvent.VK_RIGHT){
						planevelX=2;		
					}
		//move();
	}
	public void dontmove(){
		planevelX=0;
		planevelY=0;
	}
	public void move(){
	
		x = x + planevelX;
		y = y + planevelY;
	}
	public boolean isVisible() {
		return isVisible;
	}


	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}


	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Image getHelicopterimage() {
		return helicopterimage;
	}
	public void setHelicopterimage(Image helicopterimage) {
		this.helicopterimage = helicopterimage;
	}
	public Rectangle getRectangle(){
		Rectangle r = new Rectangle(x,y,width,height);
	return r;
	}
	
}
