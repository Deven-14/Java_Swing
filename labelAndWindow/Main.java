package labelAndWindow;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

public class Main {
    
    public static void main(String[] args)
    {
        MyFrame myFrame = new MyFrame(); //or new MyFrame(); if not making any changes

        ImageIcon image = new ImageIcon("insta.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);


        //JLabel = a GUI display AREA for a string of text, an image, both
        JLabel label = new JLabel();// create a label
        label.setText("Bro, do you even code?"); // set text of label, u can pass this text in the constructor also
        label.setIcon(image);

        //text positioning
        label.setHorizontalTextPosition(JLabel.CENTER);//move with respect to the image, CENTER, LEFT, RIGHT, of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of image icon

        //text font and color
        label.setForeground(Color.blue);//or rgb or hex
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));//font.plain, bold, italic,... then size

        label.setIconTextGap(20);//set gap of text to image

        label.setBackground(Color.black);//set background color, doesn't display, only sets
        label.setOpaque(true);// display background color

        label.setBorder(border);


        //set where the text+icon should be in the
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
        
        //set layout of label
        //label.setBounds(100, 100, 250, 250);//x, y, width, height


        //*********** 
        myFrame.add(label);

        myFrame.pack(); //to fit all the label, *****first add labels then do this or else it won't work
        //myFrame.setLayout(null);//so that the default label doesn't take the whole window, and now it won't display anything, we gotta set it to that perticular label now

    }

}
