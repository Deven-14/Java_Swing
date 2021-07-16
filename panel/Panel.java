package panel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

import java.awt.BorderLayout;

public class Panel {
    
    public static void main(String[] args)
    {

        //JPanel = a GUI component that functions as a container to hold other components

        ImageIcon icon = new ImageIcon("insta.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.BOTTOM);//w.r.t setLayout of Panel
        //label.setHorizontalAlignment(JLabel.RIGHT);//w.r.t setLayout of Panel i.e w.r.t to frame
        label.setBounds(100, 100, 75, 75);//directly to the label and moves w.r.t the Panel having this label

        

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        //redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);//so that we can use serBounds in label and it's position is w.r.t the panel


        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        //bluePanel.setLayout(new BorderLayout());
        bluePanel.setLayout(null);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        //greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);



        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);


        greenPanel.add(label);



        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }

}
