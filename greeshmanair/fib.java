/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.util.*;
import java.io.*;
public class fib {
    
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter number");
        int n=sc.nextInt();
        
        int a=0;
        int b=1;
        int c,i;
        System.out.println(a);
        System.out.println(b);
        for(i=0;i<n-2;i++)
        {
            
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            
            
        }
        
        
        
    
    
    }
    
}
