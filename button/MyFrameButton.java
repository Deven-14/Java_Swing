package button;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class MyFrameButton extends JFrame implements ActionListener{//method 1
//public class MyFrameButton extends JFrame{   //method2

    JButton button;
    JLabel label;

    MyFrameButton() {


        ImageIcon icon = new ImageIcon("star.gif");
        ImageIcon icon2 = new ImageIcon("small.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 300, 250, 150);
        label.setVisible(false);//so that after button is clicked it'll display


        //JButton button = new JButton();
        button = new JButton();
        button.setBounds(100, 100, 350, 150);
        button.addActionListener(this);//method 1 //this class listens to the actions of this button
        //method 2 : button.addActionListener(e -> System.out.println("hi"));//doesn't require to implement actionlistener as we are passing lambda funtion, this funtion is performed when the button is clicked


        //to display text on button
        button.setText("HII");
        button.setFocusable(false);//to remove the box surrounding the button

        //set icon
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(10);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false); to disable button
        
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        this.add(button);
        this.add(label);
    }

    @Override //method 1 //the class has to implement the actionlistener for this to work
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            //System.out.println("hi");
            //button.setEnabled(false); to disable button, putting it here will make the button clickable only once
            label.setVisible(true);
        }
    }

}
