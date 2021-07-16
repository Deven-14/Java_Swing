package checkbox;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JCheckBox checkBox;
    ImageIcon icon1;
    ImageIcon icon2;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());//to automatically layout the elements
    

        icon1 = new ImageIcon("small.png");
        icon2 = new ImageIcon("star.gif");

        
        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);
        
        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.setIcon(icon1);
        checkBox.setSelectedIcon(icon2);

        this.add(button);
        this.add(checkBox);


        this.pack();//size of frame will fit all the components
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            System.out.println(checkBox.isSelected());
        }
        
    }
    
}
