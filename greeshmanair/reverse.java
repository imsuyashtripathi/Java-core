/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.util.*;
import java.io.*;


public class reverse {
    
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int r,a,rev=0;
        int n=sc.nextInt();
        a=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
            
            
            
        }
          System.out.print(rev);
          
    if(a==rev)
    {
        System.out.print("Palindrome");
    }
    else
    {
       System.out.println("Not a palindrome");
    }
    }
    
}
