/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.util.*;
import java.io.*;


public class count_while {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        
    int n=sc.nextInt();
    int c=0;
     while(n>0)
     {
         
         n=n/10;
         c++;
         
     }
     
     System.out.print("number of digits"+c);
    
    }
}
