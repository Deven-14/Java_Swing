package OptionPane;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args)
    {
        //JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something.

        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "here is some more useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "really", "title", JOptionPane.QUESTION_MESSAGE);
        //while(true) { //for the message to occur again for ever
            //JOptionPane.showMessageDialog(null, "you're computer has a virus", "title", JOptionPane.WARNING_MESSAGE);
        //}
        //JOptionPane.showMessageDialog(null, "call tech support or else", "title", JOptionPane.ERROR_MESSAGE);

        //int answer = JOptionPane.showConfirmDialog(null, "bro, do u even code?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
        //System.out.println(answer);
        //String name = JOptionPane.showInputDialog("what is your name?");
        //System.out.println(name);

        String[] responses = { "No, you're awesome", "thank you!", "*blush*" };
        ImageIcon icon = new ImageIcon("small.png");

        JOptionPane.showOptionDialog(
            null, 
            "you are awesome", 
            "secret message", 
            JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            icon, 
            responses, 
            0);
    }

}
