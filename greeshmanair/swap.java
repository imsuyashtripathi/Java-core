/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.util.*;
import java.io.*;

public class swap {
    public static void main(String[] args)throws IOException{
        
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Swap using two variables. 2. swap with three variables");
        int n=sc.nextInt();
        System.out.println("Enter the first number ");
        
        int a=sc.nextInt();
        
        System.out.println("Enter the second number ");
        int b=sc.nextInt();
        
        if(n==10)
        {
            a=a+b;
            b=a-b;
            a=a-b;
            
            System.out.println("The first number is"+a);
            System.out.println("The second number is"+b);
        
        }
        
        else
        {
            
            int c=a;
            a=b;
            b=c;
            
           System.out.println("The first number is"+a);
            System.out.println("The second number is"+b);
        }
        
        
    }
}
