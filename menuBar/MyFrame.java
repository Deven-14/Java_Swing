package menuBar;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exiIcon;


    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(500, 500));
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("star.gif");
        saveIcon = new ImageIcon("star.gif");
        exiIcon = new ImageIcon("star.gif");


        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exiIcon);


        fileMenu.setMnemonic(KeyEvent.VK_F); // alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E); // alt + e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // alt + h for help
        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // e for exit


        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);

        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == loadItem)
        {
            System.out.println("you loaded a file");   
        }
        else if(e.getSource() == saveItem)
        {
            System.out.println("you saved a file");   
        }
        else if(e.getSource() == exitItem)
        {
            System.exit(0);
        }

    }

}
