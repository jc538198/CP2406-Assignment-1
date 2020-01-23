import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;


public class FrameDemo extends JFrame {

    public FrameDemo() {
        MyPanel mp = new MyPanel();
        this.add(mp);
        this.setSize(1600, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    //Define a MyPanel
    class MyPanel extends JPanel {
        Document z;
        JLabel title;
        JButton btnPause;
        boolean isPaused = false;
        Timer timer = new Timer();
        public MyPanel() {

            // Add toolbar
            JToolBar toolBar = new JToolBar();
            this.add(toolBar, BorderLayout.NORTH);
            //this.setLayout(null);
            z = new Document();


            timer.schedule(new RemindTask(),0, 1 * 1000);
            btnPause = new JButton("Stop");
            btnPause.addActionListener(ae -> {
                if (isPaused) {
                    btnPause.setText("Stop");
                    isPaused = false;
                } else {
                    btnPause.setText("Start");
                    isPaused = true;
                }
                if(!isPaused){
                    timer = new Timer();
                    timer.schedule(new RemindTask(),0, 1 * 1000);
                }else{
                    timer.cancel();
                }
            });
            toolBar.add(btnPause);



        }

        private class RemindTask extends TimerTask {
            public void run() {
                repaint();
            }
        }


        public void paintComponent(Graphics g) {
            // Call the parent function to complete the initialization
            super.paintComponent(g);
            drawLine(g);
            drawLight(g, z.t);
            drawblocks(g);
            drawCar(g, z.CarList);
        }

        // Draw cars
        public void drawCar(Graphics g, ArrayList<Car> carList) {
            //First clear the hash table of the positions of all cars on the record interface for one second
            z.prior.clear();
            for (int i = 0; i < carList.size(); i++) {
                int roadA = carList.get(i).getBegin();
                //If it is a car produced at a north-south intersection, set it to blue; otherwise, it is gray
                if (roadA == 1 || roadA == 3 || roadA == 4 || roadA == 6)
                    g.setColor(Color.blue);
                else
                    g.setColor(Color.gray);
                g.fillRect(carList.get(i).getcarX(), carList.get(i).getcarY(), 10,
                        8);
                // When each car reaches the end point, it is removed from the car list
                if (carList.get(i).getcarX() == -10
                        && carList.get(i).getcarY() == -10) {
                    carList.remove(i);
                }
                //Record the position of the current car, add the position of the current car to the hash table for the next second to determine whether there is a car at the previous position
                String x = String.valueOf(carList.get(i).getcarX())
                        + String.valueOf(carList.get(i).getcarY());
                z.prior.put(x, 1);
                //System.out.print(carList.get(i).getcarX() + "," +carList.get(i).getcarY()+" ");
            }
            System.out.println();
        }

        // Draw roads
        public void drawLine(Graphics g) {
            g.drawLine(50, 175, 275, 175);
            g.drawLine(275, 100, 275, 175);
            g.drawLine(50, 250, 275, 250);
            g.drawLine(275, 250, 275, 550);

            g.drawLine(350, 100, 350, 175);
            g.drawLine(350, 250, 350, 550);
            g.drawLine(1250, 100, 1250, 175);
            g.drawLine(350, 175, 1250, 175);

            g.drawLine(350, 250, 1250, 250);
            g.drawLine(350, 250, 350, 550);
            g.drawLine(1250, 100, 1250, 175);
            g.drawLine(350, 175, 1250, 175);

            g.drawLine(1250, 250, 1250, 550);
            g.drawLine(1325, 550, 1325, 250);
            g.drawLine(1325, 100, 1325, 175);
            g.drawLine(1325, 175, 1550, 175);
            g.drawLine(1325, 250, 1550, 250);

        }

        // Draw lights
        public void drawLight(Graphics g, Light t) {

            if (t.getl1() == 0) {
                g.setColor(Color.red);
                g.fillOval(275, 165, 8, 8); // l1
                g.fillOval(342, 252, 8, 8);// l4
                g.setColor(Color.green);
                g.fillOval(352, 176, 8, 8);// l2
                g.fillOval(265, 242, 8, 8);// l3
            } else {
                g.setColor(Color.green);
                g.fillOval(275, 165, 8, 8); // l1
                g.fillOval(342, 252, 8, 8);// l4
                g.setColor(Color.red);
                g.fillOval(352, 176, 8, 8);// l2
                g.fillOval(265, 242, 8, 8);// l3
            }

            if (t.getl5() == 0) {
                g.setColor(Color.red);
                g.fillOval(1250, 165, 8, 8);// l5
                g.fillOval(1317, 252, 8, 8);// l8
                g.setColor(Color.green);
                g.fillOval(1327, 176, 8, 8);// l6
                g.fillOval(1240, 242, 8, 8);// l7
            } else {
                g.setColor(Color.green);
                g.fillOval(1250, 165, 8, 8);// l5
                g.fillOval(1317, 252, 8, 8);// l8
                g.setColor(Color.red);
                g.fillOval(1327, 176, 8, 8);// l6
                g.fillOval(1240, 242, 8, 8);// l7
            }
        }

        // Draw a spacer
        public void drawblocks(Graphics g) {
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(60, 210, 215, 5);
            g.fillRect(360, 210, 880, 5);
            g.fillRect(1325, 210, 215, 5);

        }
    }

}