package mouseListener;

import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;

public class MyFrame2 extends JFrame implements MouseListener{
    
    JLabel label;

    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;

    MyFrame2()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);


        smile = new ImageIcon("star.gif");
        nervous = new ImageIcon("small.png");
        pain = new ImageIcon("star.gif");
        dizzy = new ImageIcon("small.png");


        label.setIcon(smile);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);//for appearing at the center of the screen
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
        label.setIcon(pain);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component(i.e if a key is kept pressed or basically any key pressed, after it is released this function works)
        label.setIcon(dizzy);


    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when the mouse enters a component
        label.setIcon(nervous);


    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when the mouse exits a component
        label.setIcon(smile);

    }


}
