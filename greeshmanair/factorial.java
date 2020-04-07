/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.util.*;
import java.io.*;
public class factorial {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number for factorial");
    int a=sc.nextInt();
    int i,fact=1;
    for(i=1;i<=a;i++)
    {
        fact=i*fact;
        
    }
    
    System.out.print("The factorial of"+a+"is"+fact);
    
    
    }
    
}
