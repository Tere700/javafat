package tw.org.iii.teresaaaaapp;

import javax.imageio.ImageIO;
import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Racing03 extends JFrame {
	
    private static final int TRACK_LENGTH = 900; // 賽道長度
    private static final int CAR_WIDTH = 30; // 賽車寬度
    private static final int CAR_HEIGHT = 20; // 賽車高度
    private JPanel trackPanel;
    private JButton startButton;
    private JLabel[] carLabels;
    private BackgroundPanel backgroundPanel;
    private int[] carPositions;
    private boolean running;
   // private int rank;
    private LinkedList<String> rankingList;
    private boolean[] carFinished;
    
    
    public Racing03() {

 

        setTitle("賽車遊戲");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 建立賽道面板
        trackPanel = new BackgroundPanel();
        trackPanel.setLayout(new BoxLayout(trackPanel, BoxLayout.Y_AXIS));
        backgroundPanel = new BackgroundPanel();
        trackPanel.add(backgroundPanel);

        // 建立賽車標籤
        
        carLabels = new JLabel[8];
        carLabels [0] = new JLabel(new ImageIcon("dir1/1.png"));
        carLabels [1] = new JLabel(new ImageIcon("dir1/2.png"));
        carLabels [2] = new JLabel(new ImageIcon("dir1/3.png"));
        carLabels [3] = new JLabel(new ImageIcon("dir1/4.png"));
        carLabels [4] = new JLabel(new ImageIcon("dir1/5.png"));
        carLabels [5] = new JLabel(new ImageIcon("dir1/6.png"));
        carLabels [6] = new JLabel(new ImageIcon("dir1/7.png"));
        carLabels [7] = new JLabel(new ImageIcon("dir1/8.png"));
        for (int i = 0; i < carLabels.length; i++) {
            carLabels[i].setSize(CAR_WIDTH, CAR_HEIGHT);
            carLabels[i].setName("Car" + (i+1));
            trackPanel.add(carLabels[i]);
        }
        

        // 設置賽車起始位置
        int initialY = 10;
        for (int i = 0; i < carLabels.length; i++) {
            carLabels[i].setLocation(0, initialY);
            initialY += CAR_HEIGHT + 10;
        }
        
        // 建立開始按鈕
        startButton = new JButton("開始");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startRace();
            }
        });       
       
        rankingList = new LinkedList<>();

        // 將元件加入視窗
        
        JPanel button = new JPanel(new FlowLayout());
       
        button.add(startButton);
        add(trackPanel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setSize(1200,900);
        setResizable(false);
        setLocationRelativeTo(null); // 置中顯示視窗
        setVisible(true);
    }
    
    private void startRace() {
        startButton.setEnabled(false);
      //  rank=0;
        carPositions = new int[8];
        running = true;
        carFinished = new boolean[carPositions.length];
        rankingList.clear();
        Thread raceThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (running) {
                    moveCars();
                    try {
                        Thread.sleep(5+ (int)(Math.random()*45)); // 休眠10毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        raceThread.start();
     
    }

    
    private void moveCars() {
        for (int i = 0; i < carPositions.length; i++) {
            // 如果該車輛已經到達終點，則跳過這個迴圈的這一次迭代
            if (carFinished[i]) {
                continue;
            }
            carPositions[i] += (int) (Math.random() * 25); // 賽車每次前進的距離
            if (carPositions[i] >= TRACK_LENGTH ) { //終點線的位置
            	carFinished[i] = true;
            	String carName = carLabels[i].getName();
                //JOptionPane.showMessageDialog(this, carName + " 到達終點！");
                
                // 將車輛名字添加到排名列表
                rankingList.addFirst(carName);

                // 達到指定排名數量，則停止比賽
                if (rankingList.size() == carPositions.length) {
                    stopRace();
                }
            }
            carLabels[i].setLocation(carPositions[i], carLabels[i].getY());
        }
    }


    private void stopRace() {
    	running = false;
    	startButton.setEnabled(true);
    	
    	StringBuilder message = new StringBuilder("賽車到達終點！\n\n排名:\n");
    	    int position = 1;
    	    for (String carName : rankingList) {
    	        message.append(position).append(". ").append(carName).append("\n");
    	        position++;
    	    }
    	    
    	    JOptionPane.showMessageDialog(this, message.toString());
    }

    private class BackgroundPanel extends JPanel {
    	  	private BufferedImage image;

    	    public BackgroundPanel() {
    	        try {                
    	        	image = ImageIO.read(new File("dir1/8889.jpg"));
    	        } catch (IOException ex) {
    	            System.out.println(ex);
    	        }
    	     }

    	     @Override
    	     public void paintComponent(Graphics g) {
    	         super.paintComponent(g);  //THIS LINE WAS ADDED
    	         g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters
    	     }

    	}
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
        	@Override
            public void run() {
                new Racing03();
            }
        });
        
    }
}