package LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Main {
    
    //Layout Manager = Defines the natural layout for components within a container

    //FlowLayout = places components in a row, sized at their preferred size.
    //             if the horizontal space in the container is too small, 
    //              the flowlayout class uses the next available row.

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));//LEFT, RIGHT, LEADING, TRAILING, CENTER, THEN horizontal spacing and veritcal spacing

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        //JButton button1 = new JButton();
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);//added at the end coz, first add everything and then make the window visible, or else in the begining all the components won't be visible
    }
}
