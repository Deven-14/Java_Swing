package labelAndWindow;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame{
    
    MyFrame(){

        //JFrame a GUI window to add components to
        //JFrame frame = new JFrame(); don't need to call make an object here coz it's inheriting these func. and we are setting these values to those func.

        this.setTitle("Jthis title goes here"); //sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application, i.e for closing on clicking exit, if didn't set, then it only hides it but doesn't close
        //default - HIDE_ON_CLOSE, other option - DO_NOTHING_ON_CLOSE...
        //this.setResizable(false);// prevent this from being resized, full screen button also stops working
        this.setSize(600, 600); // sets the x-dimension and y-dimension of this        
        this.setVisible(true);//make this visible, but too small

        //Icon
        //ImageIcon image = new ImageIcon("dog.jpg"); //creates an ImageIcon
        //this.setIconImage(image.getImage()); //change Icon of this

        //background color
        //this.getContentPane().setBackground(Color.white); //change color of background
        //frame.getContentPane().setBackground(new Color(123, 50, 250)); //rgb
        //this.getContentPane().setBackground(new Color(0x123456)); //hexa
    }

}
