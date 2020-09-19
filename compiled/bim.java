import java.io.*;
class bim
{
    public static void main(String args[])
    {
        boolean EOF=false,f=true;
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\anujk\\Desktop\\server.bin");
        DataOutputStream dos=new DataOutputStream(fos);
        System.out.println("Enter Text and type 'SAVE' to save it");
        while(f)
        {
           s=br.readLine();
           if(s.equals("SAVE"))
           f=false;
           else
           dos.writeUTF(s); 
        }    
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
}