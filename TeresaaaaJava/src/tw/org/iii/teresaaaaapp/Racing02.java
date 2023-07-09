package tw.org.iii.teresaaaaapp;



import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class Racing02 extends JFrame {

    private static final int TRACK_LENGTH = 500; // 賽道長度

    private static final int CAR_WIDTH = 30; // 賽車寬度

    private static final int CAR_HEIGHT = 20; // 賽車高度



    private JPanel trackPanel;

    private JButton startButton;

    private JLabel[] carLabels;
 

    private int[] carPositions;

    private Timer timer;



    public Racing02() {

        setTitle("賽車遊戲");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());



        // 建立賽道面板

        trackPanel = new JPanel();

        trackPanel.setLayout(new BoxLayout(trackPanel, BoxLayout.Y_AXIS));

        trackPanel.setBackground(Color.WHITE);
        
        // 建立背景標籤
  

        // 建立賽車標籤

        carLabels = new JLabel[8];

        for (int i = 0; i < carLabels.length; i++) {

            carLabels[i] = new JLabel(new ImageIcon("pc/123.png"));

            carLabels[i].setSize(CAR_WIDTH, CAR_HEIGHT);

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



        // 將元件加入視窗

        add(trackPanel, BorderLayout.CENTER);

        add(startButton, BorderLayout.SOUTH);


        setSize(1100,850);
        
        //pack();
        setResizable(false);

        setLocationRelativeTo(null); // 置中顯示視窗

        setVisible(true);

    }

    class ImagePanel extends JPanel {
        private BufferedImage image;
        public ImagePanel(String imagePath) {
            try {
                image = ImageIO.read(new File("pc/456.png"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this.getWidth(),this.getHeight(),this);
        }
    }


    private void startRace() {

        startButton.setEnabled(false);

        carPositions = new int[8];



        timer = new Timer(10, new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                moveCars();

            }

        });

        timer.start();

    }



    private void moveCars() {

        for (int i = 0; i < carPositions.length; i++) {

            carPositions[i] += (int) (Math.random() * 5); // 賽車每次前進的距離

            if (carPositions[i] >= (TRACK_LENGTH - CAR_WIDTH)*2) { //終點線的位置

                carPositions[i] = (TRACK_LENGTH - CAR_WIDTH)*2;

                stopRace();

            }

            carLabels[i].setLocation(carPositions[i], carLabels[i].getY());

        }

    }

    

    private void stopRace() {

        timer.stop();

        startButton.setEnabled(true);

        JOptionPane.showMessageDialog(this, "賽車到達終點！");

    }

    

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override

            public void run() {

                new Racing02();

            }

        });

    }

    
    
}