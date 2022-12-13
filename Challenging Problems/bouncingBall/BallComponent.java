import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
	The component that draws the ball
*/

public class BallComponent extends JPanel{
	/**
	 * Add a ball to the component
	 * @param b the ball to add
	 */

	public void add(Ball b){
		balls.add(b);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g); //Erase background
		Graphics2D g2=(Graphics2D)g;

		for(Ball b:balls){
			g2.fill(b.getShape());
		}
	}

	private ArrayList<Ball> balls=new ArrayList<Ball>();
}