class thread1 extends Thread
{
    synchronized(this)
    {
    public void run()
    {
        for(int i=0;i<3;i++)
        {
        System.out.println("a");
        
        System.out.println("b");
        }
    }
}

class thread2 extends Thread
{
    synchronized(this){
    public void run()
    {
        for(int i=0;i<3;i++)
        {
        System.out.println("c");
        
        System.out.println("d");
        }
    }
}

class Mainthread
{
    public static void main(String args[])
    {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.start();
        t2.start();
        
        
    }
}