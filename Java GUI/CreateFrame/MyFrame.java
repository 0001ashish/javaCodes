import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
public class MyFrame extends JFrame{
	MyFrame(){
		this.setTitle("Looking Great !");
		this.setVisible(true);//Make the this visible
		this.setSize(420,420);//Set dimensions of the this
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon image=new ImageIcon("winter.png");
		this.setIconImage(image.getImage());

		this.getContentPane().setBackground(new Color(158,221,239));
	}
}