class Test extends Thread
{
    public void run()
    {
        System.out.println("hello...");
    }
}
class MyProgram
{
    public static void main(String args[])
    {
        Test t=new Test();
        t.start();
    }
}