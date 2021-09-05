package appletdemo;
import java.applet.Applet;  
import java.awt.*;  
  
@SuppressWarnings("deprecation")
public class shapes extends Applet{  
  
	/*
	 * <applet code="shape.class" width="500" heigth="750" border="5">
	 * </applet>
	 */

	private static final long serialVersionUID = 1L;

public void paint(Graphics g){  
g.setColor(Color.red);  
g.drawString("Welcome",50, 50);  
g.drawRect(70,100,30,30);  
g.fillRect(170,100,30,30);  
g.drawOval(70,200,30,30);  
  
g.setColor(Color.pink);  
g.fillOval(170,200,30,30);  
g.drawArc(90,150,30,30,30,270);  
g.fillArc(270,150,30,30,0,180);  
  
}  
}  
