package tw.org.iii.teresaaaaaaapp;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import Exception.ee.MyPanel;

public class MyBallGame extends JFrame {
	
	private MyPanel mypanel;
	
	public MyBallGame(){
		super("");
		
		setLayout(new BorderLayout());
		
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
		new MyBallGame();

	}

}
