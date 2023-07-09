package tw.org.iii.teresaaaaaaapp;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tre1 extends JFrame{
		private JButton b1,b2,b3;
		
		
		public Tre1() {
			super("我的視窗程式");
			
			b1 = new JButton("B1");
			b2 = new JButton("B2");
			b3 = new JButton("B3");
			
			setLayout(new FlowLayout());
			add(b1);add(b2);add(b3);
			
			System.out.println("Tre1()");
			setSize(640, 480);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
		new Tre1();

	}

}
