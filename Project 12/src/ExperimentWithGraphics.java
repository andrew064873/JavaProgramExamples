import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class ExperimentWithGraphics extends JPanel {
	private static final int SIZE = 300;
	
	public static void main(String[] args) {

		JFrame frame = new JFrame("Line");
		JPanel panel = new ExperimentWithGraphics();
		frame.setSize(SIZE,500);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.setBackground(Color.WHITE);
	}
	public void paintComponent(Graphics g){
		//all things are constructed in order of layering, whatever is
		//first would be in the farthest back layer and so forth
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		Ellipse2D.Double ear1 = new Ellipse2D.Double(50, 100, 80, 250); //constructing ears and outlines of ears
		g2d.setColor(Color.WHITE);
		g2d.draw(ear1);
		g2d.fill(ear1);
		
		Ellipse2D.Double earOutline1 = new Ellipse2D.Double(50, 100, 80, 250);
		g2d.setColor(Color.BLACK);
		g2d.draw(earOutline1);
		
		Ellipse2D.Double innerEar1 = new Ellipse2D.Double(65, 150, 45, 150);
		g2d.setColor(Color.pink);
		g2d.draw(innerEar1);
		g2d.fill(innerEar1);
		
		Ellipse2D.Double innerEarOutline1 = new Ellipse2D.Double(65, 150, 45, 150);
		g2d.setColor(Color.black);
		g2d.draw(innerEarOutline1);
		
		Ellipse2D.Double ear2 = new Ellipse2D.Double (150, 100, 80, 250);
		g2d.setColor(Color.WHITE);
		g2d.draw(ear2);
		g2d.fill(ear2);
		
		Ellipse2D.Double earOutline2 = new Ellipse2D.Double (150, 100, 80, 250);
		g2d.setColor(Color.BLACK);
		g2d.draw(earOutline2);
		
		Ellipse2D.Double innerEar2 = new Ellipse2D.Double(165, 150, 45, 150);
		g2d.setColor(Color.pink);
		g2d.draw(innerEar2);
		g2d.fill(innerEar2);
		
		Ellipse2D.Double innerEarOutline2 = new Ellipse2D.Double(165, 150, 45, 150);
		g2d.setColor(Color.black);
		g2d.draw(innerEarOutline2);
		
		Ellipse2D.Double head = new Ellipse2D.Double(50, 200, 180, 200);//constructing head and its outline
		g2d.setColor(Color.WHITE);
		g2d.draw(head);
		g2d.fill(head);
		
		Ellipse2D.Double headOutline = new Ellipse2D.Double(50, 200, 180, 200);
		g2d.setColor(Color.BLACK);
		g2d.draw(headOutline);
		
		Ellipse2D.Double eye1 = new Ellipse2D.Double(75, 250, 50, 75);//constructing eyes, pupils, and their outlines
		g2d.setColor(Color.BLACK);
		g2d.draw(eye1);
		
		Ellipse2D.Double pupil1 = new Ellipse2D.Double(90,280, 25,25);
		g2d.setColor(Color.BLACK);
		g2d.draw(pupil1);
		g2d.fill(pupil1);
		
		Ellipse2D.Double eyelight1 = new Ellipse2D.Double (90, 278, 10, 10);
		g2d.setColor(Color.white);
		g2d.draw(eyelight1);
		g2d.fill(eyelight1);
		
		Ellipse2D.Double eyelightOutline1 = new Ellipse2D.Double(90, 278, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.draw(eyelightOutline1);
		
		Ellipse2D.Double eye2 = new Ellipse2D.Double(150, 250, 50, 75);
		g2d.setColor(Color.BLACK);
		g2d.draw(eye2);
		
		Ellipse2D.Double pupil2 = new Ellipse2D.Double(160,280, 25,25);
		g2d.setColor(Color.BLACK);
		g2d.draw(pupil2);
		g2d.fill(pupil2);	
		
		Ellipse2D.Double eyelight2 = new Ellipse2D.Double (160, 278, 10, 10);
		g2d.setColor(Color.white);
		g2d.draw(eyelight2);
		g2d.fill(eyelight2);
		
		Ellipse2D.Double eyelightOutline2 = new Ellipse2D.Double(160, 278, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.draw(eyelightOutline2);
		
		int [] xpoints1 = {125, 125, 155, 155};//arrays constructed for "teeth" polygon
		int [] ypoints1 = {380, 360, 360, 380};
		
		Polygon teeth = new Polygon (xpoints1, ypoints1, 4);//constructing of the teeth and a line dividing them
		g2d.setColor(Color.BLACK);
		g2d.draw(teeth);
		
		Line2D.Double toothLine = new Line2D.Double(140, 361, 140, 380);
		g2d.setColor(Color.BLACK);
		g2d.draw(toothLine);
		
		Ellipse2D.Double mouth1 = new Ellipse2D.Double(100, 335, 40, 40);//constructing of the mouth and their outlines
		g2d.setColor(Color.BLACK);
		g2d.draw(mouth1);
		
		Ellipse2D.Double mouthBlock1 = new Ellipse2D.Double(99, 334, 40, 40);
		g2d.setColor(Color.WHITE);
		g2d.draw(mouthBlock1);
		g2d.fill(mouthBlock1);
		
		Ellipse2D.Double mouth2 = new Ellipse2D.Double(140, 335, 40, 40);
		g2d.setColor(Color.BLACK);
		g2d.draw(mouth2);
		
		Ellipse2D.Double mouthBlock2 = new Ellipse2D.Double(141, 334, 40, 40);
		g2d.setColor(Color.WHITE);
		g2d.draw(mouthBlock2);
		g2d.fill(mouthBlock2);
		
		int [] xpoints2 = {120, 140, 155};//arrays for the "nose" polygon
		int [] ypoints2 = {330, 350, 330};
		
		Polygon nose = new Polygon (xpoints2, ypoints2, 3);//constructing of the nose
		g2d.setColor(Color.black);
		g2d.draw(nose);
		g2d.fill(nose);
		
		//final product is a rabbit
		
		boolean includes = nose.contains(100,200);//fulfilling the instance method requirement
		System.out.println(includes);
		
		
	}

}
