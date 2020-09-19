
package isro;

import java.io.*;
import static isro.NewJFrame1.t;
import static isro.NewJFrame1.fname;
import static isro.NewJFrame.s1;
import static isro.NewJFrame1.x;
import java.util.logging.Level;
import java.util.logging.Logger;

public class client {
    
    static String w,b,ext,e;
    boolean EOF=false;
    static main ob;
    File file2;
    public client()throws java.net.SocketException     
    {
        try
        {
            
        ob=new main();
        w="";e="";
        b=t+"\\"+fname;
        System.out.println(b);
        file2=new File(b);
        ext=b.substring(b.lastIndexOf("."));
       
        //BufferedReader br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
        DataInputStream input = new DataInputStream(s1.getInputStream());
        
        if(ext.equals(".bin")&&ext.equals(".dat"))
        {
            
        FileOutputStream fos = new FileOutputStream(b);
        DataOutputStream dos = new DataOutputStream(fos);
         
         
        while(!(EOF||x))
        {
            try
            {
            w=input.readUTF();
            System.out.println(w);
            dos.writeUTF(w);
            e=e+"\n"+w;
            }
            catch(EOFException e)
            {
                EOF=true;
            }
        }
        ob.textArea.setText(e);
        dos.close();
        fos.close();
        }
        else
        {
            FileWriter fw=new FileWriter(b);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            
           while(!(EOF||x))
            {
                try
                {
                w=input.readUTF();
                System.out.println(w);
                pw.println(w);
                e=e+"\n"+w;
            
                }
                catch(EOFException e)
                {
                    EOF=true;
                }
            }
             
            ob.textArea.setText(e);   
            
            pw.close();
            bw.close();
            fw.close();
            
        }
        
        }//try close
        
        catch(IOException ex)
        {
             Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
    

    }
}
