/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class NewClass3 extends Thread 
{
    
 public void run()
 {  
  for(int i=1;i<5;i++)
  {  
    try
    {
        Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
        System.out.println(e);
    }  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
  NewClass3 t1=new NewClass3();  
   
   
  t1.start();  
  
 }  
}  
}
