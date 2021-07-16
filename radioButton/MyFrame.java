package radioButton;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class MyFrame extends JFrame implements ActionListener{
    

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());//to automatically layout the elements
        

        pizzaIcon = new ImageIcon("star.gif");
        hamburgerIcon = new ImageIcon("star.gif");
        hotdogIcon = new ImageIcon("star.gif");


        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamberger");
        hotdogButton = new JRadioButton("hotdog");

        
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);


        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        

        this.pack();//size of frame will fit all the components
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == pizzaButton)
        {
            System.out.println("you ordered pizza!");
        }
        else if(e.getSource() == hamburgerButton)
        {
            System.out.println("you ordered hamburger!");
        }
        else if(e.getSource() == hotdogButton)
        {
            System.out.println("you ordered hotdog!");
        }

        

    }

}
