/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.util.*;
import java.io.*;


public class convertion 
{
    public static void main(String[] args)throws IOException{
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("1.To convert dollar to rupees. 2.To convert rupees to dollars");
        int n=sc.nextInt();
        
        if(n==1)
        {
            System.out.println("Enter the amount for conversion");
            
            int amt=sc.nextInt();
            
            int final1=amt*65;
            
            System.out.print("The conversion result is:"+final1);
        }
        
        else{
            
            System.out.println("enter the amount to be converted to dollars");
            
            int amt=sc.nextInt();
            double final1=amt/65;
            
            System.out.println("The conversion result is:"+final1);
        }
        
        
    }
}
