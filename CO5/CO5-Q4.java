import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;

public class house extends Applet implements MouseListener
{
int a,b;
public void init()
{
addMouseListener(this);
}
public void paint(Graphics gp)
{ 
int [] x = {150, 300, 225};
int [] y = {150, 150, 25};
gp.drawRect(150, 150, 150, 200); //House
gp.setColor(Color.magenta);
gp.fillRect(150,150,150,200);
gp.drawRect(200, 200, 50, 150); // Door
gp.setColor(Color.blue);
gp.fillRect(200,200,50,150);
gp.drawPolygon(x, y, 3); // Roof
gp.setColor(Color.darkGray);
gp.fillPolygon(x,y,3);
if(a>200 && a<300 && b>200 && b<300)
        {
            gp.setColor(Color.red);
            gp.fillRect(200, 200, 50, 150);
        }
    }
    public void mouseClicked(MouseEvent e)
    {

    }
    public void mouseEntered(MouseEvent e)
    {

    }

    
    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e)
    {
        a=e.getX();
        b=e.getY();
        repaint();

    }
    public void mouseReleased(MouseEvent e)
    {

    }

}

/*
<applet code="house.class" width=400 height=450></applet>
*/