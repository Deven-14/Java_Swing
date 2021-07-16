package Graphics2d;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;


public class MyPanel extends JPanel{//we are doing this in a panel coz if we do it in frame then the window bar(i.e -, , X) is also included in the size of the frame and it eats up some of the graphics,
                                    // so making a panel of desired size and then adding it to the frame 
    
    Image image;

    MyPanel()
    {
        image = new ImageIcon("star.gif").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;//better than Graphics


        g2D.drawImage(image, 0, 0, null);//can act like background

        g2D.setPaint(Color.blue);
        //g2D.setStroke(new BasicStroke(5));//line size
        //g2D.drawLine(0, 0, 500, 500);

        //g2D.setPaint(Color.pink);//can set any number of times before every shape
        //g2D.drawRect(0, 0, 100, 200);
        //g2D.fillRect(0, 0, 100, 200);

        //g2D.setPaint(Color.orange);
        //g2D.drawOval(0, 0, 100, 100);
        //g2D.fillOval(0, 0, 100, 100);

        g2D.setPaint(Color.red);
        //g2D.drawArc(0 , 0, 100, 100, 0, 180);
        g2D.fillArc(0 , 0, 100, 100, 0, 180);
        g2D.setPaint(Color.white);
        g2D.fillArc(0 , 0, 100, 100, 180, 180);

        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};
        g2D.setPaint(Color.yellow);
        //g2D.drawPolygon(xPoints, yPoints, 3);
        g2D.fillPolygon(xPoints, yPoints, 3);

        //g2D.setPaint(Color.magenta);
        //g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        //g2D.drawString("You are a winner", 50, 50);// 0 0 won't be displayed, it'll be hidden at the top left

    }

}
