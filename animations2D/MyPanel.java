package animations2D;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener{
    
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;

    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;//if x and y velocity is same it'll move to the corner or else if x is greater than obviously it'll quickly finish x width change direction while keep going down
    int x = 0;
    int y = 0;

    MyPanel()
    {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy = new ImageIcon("star.gif").getImage();
        backgroundImage = new ImageIcon("E:\\Engineering college\\4th sem\\Java\\lab\\swing\\animations2D\\sun.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }


    public void paint(Graphics g)
    {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0)
        {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        
        if(y >= PANEL_WIDTH - enemy.getHeight(null) || y < 0)
        {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();        
    }

}
