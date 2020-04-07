/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class NewClass1
{
    public static void main(String []args)
    {
        int a[]=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter the number=");
            a[i]=sc.nextInt();
            
        }
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}
