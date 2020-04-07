/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.io.*;

public class firstry {
    
    public static void main(String []args)
    {
        try{
    FileOutputStream fout=new FileOutputStream("D:\\test.txt");
    String a="Hello";
    byte b[]=a.getBytes();
    fout.write(b);
        fout.close();
        System.out.println("Succesfully done");
        
        
        
        } 
        
        catch(Exception e)
        {
            System.out.println(e);
        }
}


}
