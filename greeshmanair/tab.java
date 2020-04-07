/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.util.*;
import java.io.*;


public class tab {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter number for table");
    
    int a=sc.nextInt();
    int i,mul=1;
    for(i=1;i<=20;i++)
    {
        mul=a*i;
        System.out.println(mul);
        
    }
    
    }
    
}
