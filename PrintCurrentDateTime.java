
import java.text.SimpleDateFormat;
import java.util.Date;


public class PrintCurrentDateTime {
    public static void main(String args[])
    {
        Date dNow=new Date();
        
        SimpleDateFormat ft1=new SimpleDateFormat("dd/mm/yyyy");
        SimpleDateFormat ft2=new SimpleDateFormat("E");
        SimpleDateFormat ft3=new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat ft4=new SimpleDateFormat("MMM");
        
        
        System.out.println("The current Date is::"+ft1.format(dNow));
        System.out.println("Today is::"+ft2.format(dNow));
        System.out.println("The current Time is::"+ft3.format(dNow));
        System.out.println("The current Month name is::"+ft4.format(dNow));
        
        
        
    }
}
