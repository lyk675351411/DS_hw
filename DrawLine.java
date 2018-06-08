package 划线;
import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.applet.*;
public class DrawLine  {
	int x1,x2,y1,y2;
    int w1,w2,e1,e2;
	
	public DrawLine(int x1,int y1,int x2,int y2){
		this.x1 = x1;
		this.y2 = y2;
		this.x2 = x2;
		this.y2 = y2;
	}
	
public void paint() {

	
	    JFrame f3;
		JButton jb11;
		JButton jb12;
		
		jb11 = new JButton("难度一");
		jb12 = new JButton("难度二");
		f3 = new JFrame("消消乐大作战");
		
		
        jb11.setSize(100,50);
        jb12.setSize(100,50);
        
        
       w1 = jb11.getX();
       e1 = jb11.getY();
       w2 = jb12.getX();
       e2 = jb12.getY();
		
		
		f3.setSize(1000,700);
    	f3.setLocation(500,300);
    	
	   int width=100;
	   int height=100;
	   BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	   Graphics2D g = (Graphics2D)img.getGraphics();
	   g.setColor(Color.BLACK);//颜色
	   g.setStroke(new BasicStroke(1.5F)); //设置粗细
	   g.drawLine(w1, e1, w2, e2);
    }
   
}