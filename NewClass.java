/*
 Java I/O (Input and Output) is used to process the input and
produce the output.

Java uses the concept of stream to make I/O operation fast. 
The java.io package contains all the classes required for input
and output operations.

We can perform file handling in java by Java I/O API.
 */
import java.io.*;
public class NewClass 
{
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             String s="Welcome to javaTpoint.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e)
            {
                System.out.println(e);
            }     
      }    
}
