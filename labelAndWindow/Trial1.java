package labelAndWindow;
import javax.swing.JFrame;//for the window
import javax.swing.ImageIcon;//for ImageIcon
import java.awt.Color;//for Color

public class Trial1
{
    public static void main(String[] args)
    {
        //JFrame a GUI window to add components to
        JFrame frame = new JFrame(); // creates a frame, not visible directly

        frame.setTitle("JFrame title goes here"); //sets title of frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application, i.e for closing on clicking exit, if didn't set, then it only hides it but doesn't close
        //default - HIDE_ON_CLOSE, other option - DO_NOTHING_ON_CLOSE...

        frame.setResizable(false);// prevent frame from being resized, full screen button also stops working
        frame.setSize(420, 420); // sets the x-dimension and y-dimension of frame
        
        frame.setVisible(true);//make frame visible, but too small

        
        //Icon
        ImageIcon image = new ImageIcon("dog.jpg"); //creates an ImageIcon
        frame.setIconImage(image.getImage()); //change Icon of frame


        //background color
        //frame.getContentPane().setBackground(Color.green); //change color of background
        //frame.getContentPane().setBackground(new Color(123, 50, 250)); //rgb
        frame.getContentPane().setBackground(new Color(0x123456)); //hexa

    }
}