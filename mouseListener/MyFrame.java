package mouseListener;


import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{
    

    JLabel label;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0 , 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        //this.addMouseListener(this);


        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when a mouse button has been clicked (pressed and released)(i.e after it finishes pressing and releasing this comes) on a component
        //System.out.println("you clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component (i.e after it finishes pressing this comes(doesn't need to be))
        System.out.println("you pressed the mouse");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component(i.e if a key is kept pressed or basically any key pressed, after it is released this function works)
        System.out.println("you released the mouse");
        label.setBackground(Color.green);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when the mouse enters a component
        System.out.println("you entered the component");
        label.setBackground(Color.blue);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when the mouse exits a component
        System.out.println("you exited the component");
        label.setBackground(Color.red);

    }


}
