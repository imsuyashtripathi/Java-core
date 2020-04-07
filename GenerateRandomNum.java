
import java.util.Random;


public class GenerateRandomNum {
    public static void main(String args[])
    {
        int counter;
        Random rNum= new Random();
        System.out.println("random number generted below are:");
        for(counter=1;counter<=10;counter++)
        {
            System.out.println(rNum.nextInt(100));
        }
    }
}
