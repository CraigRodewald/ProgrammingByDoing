import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class ClockFace extends Canvas{
	public void paint(Graphics g)
	{
		// Draw Clock outline
		g.setColor(Color.black);
		g.drawRect(10, 10, 490, 480);
		g.drawOval(50, 50, 400, 400);
		
		// Draw clock numbers
		g.setFont(new Font("Calibri", Font.PLAIN, 50));
		g.drawString("12", 225, 100);
		g.drawString("3", 420, 268);
		g.drawString("6", 237, 440);
		g.drawString("9", 60, 268);
		
		// Draw the hands
		g.drawLine(250, 250, 420, 205);
		g.drawLine(250, 250, 300, 350);
		
		/*
		// Grid
		g.setColor(Color.black);
		g.setFont(new Font(null));
		for ( int X=0; X<800; X += 50 )
		    g.drawString( String.valueOf(X), X, 50 );
		for ( int Y=100; Y<600; Y += 50 )
		    g.drawString( String.valueOf(Y), 28, Y );
		// lines
		g.setColor(Color.lightGray);
		for ( int X=0; X<800; X += 50 )
		    g.drawLine(X,0,X,599);    // horizontal
		for ( int Y=0; Y<600; Y += 50 )
		    g.drawLine(0,Y,799,Y);    // vertical
		//*/
	}
	
	public static void main(String[] args) {
		JFrame window = new JFrame("A Clock Face");
		
		window.setSize(600, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ClockFace canvas = new ClockFace();
		
		window.add(canvas);
		window.setVisible(true);
	}
}
