/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.util.*;
import java.io.*;


public class billing {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the amounts of the three products");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    
    int sum=a+b+c;
    double disc,amt;
    if(sum>1000)
    {
        
        disc=0.1*sum;
        
         amt=sum-disc;
        
        
    }
    
    else
    {
        disc=0;
         amt=sum;
    }
    
    
    System.out.println("Total amount"+sum);
    System.out.println("Discount"+disc);
    System.out.println("After discount if any"+amt);
    
    }
}
