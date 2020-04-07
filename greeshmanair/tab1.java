/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.util.*;
import java.io.*;


public class tab1 {
    
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number");
        int n=sc.nextInt();
        int mul=1,i=1;
        do{
            
            mul=n*i;
            System.out.println(mul);
            i++;
        }
        while(i<=20);
    
}
}