import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;

public class Driver{
	public static void main(String[] args) {
		MyFrame myFrame=new MyFrame();
		JLabel label=new JLabel();
		label.setText("Welcome to Winter Island !");
		myFrame.add(label);

		ImageIcon img=new ImageIcon("winter.png");
		Border border=BorderFactory.createLineBorder(Color.black,3);

		label.setIcon(img);
		label.setHorizontalTextPosition(JLabel.CENTER);//Set text to LEFT/CENTER/RIGHT
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x57838D));
		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setBorder(border);
		
	}
}