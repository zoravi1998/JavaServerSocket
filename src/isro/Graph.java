
package isro;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;


public class Graph extends JFrame implements Runnable {
    Dimension screensize = new Dimension(800, 600);
    public Graph()
    {
        this.setTitle("Brick Breaker 2");
        this.setSize(screensize);
        this.setVisible(true);
        this.setResizable(false);
        this.setBackground(Color.white);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void draw (Graphics Z){
     Z.setColor(Color.RED);
     Z.drawLine(WIDTH, WIDTH, WIDTH, WIDTH);
    }
            

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
