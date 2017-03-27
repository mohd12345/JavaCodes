import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;

public class Missile {

	
private int x;
private int y;
private int height;
private int width;
private Image image;
private int velX;
private int velY;
boolean isVisible;
Plane plane;
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
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public Image getImage() {
	return image;
}
public void setImage(Image image) {
	this.image = image;
}
public boolean isVisible() {
	return isVisible;
}
public void setVisible(boolean isVisible) {
	this.isVisible = isVisible;
}
	Missile(){
		x=200;
		y= 150;
            image = new ImageIcon(Missile.class.getResource("missile.gif")).getImage();
            
            height = image.getHeight(null);
            width  = image.getWidth(null);
            isVisible = true;
            
	}
	
	public void missileMove(){
		if(x<=GameOne.BOARD_WIDTH){
			x++;
		}
	}
}
