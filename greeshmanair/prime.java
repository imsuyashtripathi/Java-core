/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.util.*;
import java.io.*;

public class prime {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter number to check prime");
    
    int a=sc.nextInt();
    int i,c=0;
    for(i=2;i<a/2;i++)
    {
        if(a%i==0)
        {
            c=1;
            break;
        }
       
        
    }
    
    if(c==0)
    {
    System.out.print("The number is prime");
    }
    else{
    System.out.print("The number is not prime");
    
    }
}}
