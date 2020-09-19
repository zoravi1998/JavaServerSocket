
package isro;


import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class main extends JFrame {
    
    public JTextArea textArea;
    
    public main() throws IOException
    {
        JPanel frame = new JPanel ();
        frame.setBorder ( new TitledBorder ( new EtchedBorder (), "Display Area" ) );

    // create the middle panel components

    textArea = new JTextArea (16,58 );
    textArea.setEditable ( true );
    textArea.isFocusable();
    JScrollPane scroll = new JScrollPane ( textArea );
    scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED );
    
    //Add Textarea in to frame panel
    frame.add ( scroll );
    
    // My code
    this.add ( frame );
    this.pack ();
    this.setLocationRelativeTo ( null );
    this.setVisible ( true );
    this.setResizable(true);
    //client  
}  
   /* public static void main(String args[]) throws IOException
    {
        main m=new main();
    }*/
    
}
