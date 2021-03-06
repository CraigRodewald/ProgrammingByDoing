import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class SierpinskiTriangle extends Canvas
{
	public void paint(Graphics g)
	{
		// Initialize vertices variables
		int x1 = 512;
		int y1 = 109;
		int x2 = 146;
		int y2 = 654;
		int x3 = 876;
		int y3 = 654;
		
		// Initialize current point variables
		int x = 512;
		int y = 382;
		
		// Initialize random
		int random;
		
		// Initialize difference variables
		int dx = 1;
		int dy = 1;
		
		Random r = new Random();
		
		for (int i = 0; i < 50000; i++)
		{
			g.drawLine(x,y,x,y);
			random = r.nextInt(3)+1;
			
			if (random == 1) {
				dx = x-x1;
				dy = y- y1;
				
				try {
					Thread.sleep((long) 1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else if (random == 2) {
				dx = x-x2;
				dy = y- y2;
			}
			else if (random == 3) {
				dx = x-x3;
				dy = y- y3;
			}
			
			x = x - dx/2;
			y = y - dy/2;
		}
		
		g.drawString("Sierpinski Triangle", 462, 484);
	}
	
	public static void main(String[] args)
	{
		JFrame window = new JFrame("The Sierpinski Triangle");
		
		window.setSize(1024, 768);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SierpinskiTriangle canvas = new SierpinskiTriangle();
		
		window.add(canvas);
		window.setVisible(true);
	}
}
