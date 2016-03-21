import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class SmilingFace extends Canvas 
{
	public void paint(Graphics g)
	{
		// Create a yellow circle for the face
		g.setColor(Color.yellow);
		g.fillOval(5, 5, 400, 400);
		
		// Create a blue circle for the left eye
		g.setColor(Color.blue);
		g.fillOval(75, 100, 75, 75);
		// Create a blue circle for the right eye
		g.fillOval(260, 100, 75, 75);
		// Create an arc for the smile
		g.setColor(Color.red);
		g.drawArc(105, 125, 200, 200, -45, -90);
		
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
		 */
	}
	
	public static void main(String[] args) {
		JFrame window = new JFrame("A Smiling Face");
		
		window.setSize(430, 460);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SmilingFace canvas = new SmilingFace();
		
		window.add(canvas);
		window.setVisible(true);
	}

}
