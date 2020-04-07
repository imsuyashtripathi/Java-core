/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*the join() method waits for a thread to die. 
In other words, it causes the currently running threads to 
stop executing until the thread it joins with completes its task
/**
 *
 * @author ADMIN
 */
class TestJoinMethod1 extends Thread
{  
 public void run()
 {  
  for(int i=1;i<=5;i++)
  {  
   try
   {  
    Thread.sleep(1000);  
   }
   catch(Exception e)
   {
       System.out.println(e);
   }  
  System.out.println(i);  
  }  
 }  
public static void main(String args[]){  
 TestJoinMethod1 t1=new TestJoinMethod1();  
 TestJoinMethod1 t2=new TestJoinMethod1();  
 TestJoinMethod1 t3=new TestJoinMethod1();  
 t1.start();  
 try{  
  t1.join();  
 }catch(Exception e){System.out.println(e);}  
  
 t2.start();  
 t3.start();  
 }  
}  