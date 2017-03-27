import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Enemy {
  
	private int x;
	private int y;
	private int width;
	private int height;
	private Image enemyimage;
	private int velX;
	private int velY;
	private boolean isVisible;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getVelX() {
		return velX;
	}
	public void setVelX(int velX) {
		this.velX = velX;
	}
	public int getVelY() {
		return velY;
	}
	public void setVelY(int velY) {
		this.velY = velY;
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
	public Image getEnemyimage() {
		return enemyimage;
	}
	public void setEnemyimage(Image enemyimage) {
		this.enemyimage = enemyimage;
	}
	public void enemymove(){
		if(velX>0){
			velX--;
		}
		else
			if(velX==0){
				velX=x;
			}
	}
Enemy(int x, int y){
isVisible = true;
this.velX=this.x=x;
this.velY =this.y=y;
enemyimage = new ImageIcon(Enemy.class.getResource("EnemyImage.gif")).getImage();
width = enemyimage.getWidth(null);
height = enemyimage.getHeight(null);
}
public Rectangle getRectangle(){
	Rectangle r = new Rectangle(velX,velY,width,height);
return r;
}
}