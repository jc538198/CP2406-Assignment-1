import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//main window
public class SettingGui extends JFrame {
    static JTextField redText;
    static JTextField greenText;
    static JTextField delayText;
    static JTextField SNText;
    static JTextField EWText;


    public SettingGui() {
        getContentPane().setLayout(null);

        //Set the start button. When you click the start button, draw a traffic map according to the set parameters
        JButton startButton = new JButton("Start");
        startButton.setBounds(165, 200, 91, 23);
        getContentPane().add(startButton);


        JLabel lblNewLabel = new JLabel("South-North interval");
        lblNewLabel.setBounds(73, 90, 143, 15);
        getContentPane().add(lblNewLabel);

        SNText = new JTextField();
        SNText.setBounds(251, 87, 86, 21);
        getContentPane().add(SNText);
        SNText.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("East-West interval");
        lblNewLabel_1.setBounds(73, 139, 143, 15);
        getContentPane().add(lblNewLabel_1);

        EWText = new JTextField();
        EWText.setBounds(251, 136, 86, 21);
        getContentPane().add(EWText);
        EWText.setColumns(10);

        JLabel label = new JLabel("Traffic Simulator");
        label.setFont(new Font("", Font.BOLD, 16));
        label.setBounds(128, 33, 149, 15);
        getContentPane().add(label);


        this.setSize(431, 443);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        SimpleListener ourListener = new SimpleListener();
        startButton.addActionListener(ourListener);
    }

    //Listen to the start button. When the start button is clicked, the FrameDemo class of the new drawing window is created.
    private class SimpleListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub

            FrameDemo demo = new FrameDemo();

        }

    }

    public static void main(String[] args) {
        SettingGui demo = new SettingGui();
    }
}