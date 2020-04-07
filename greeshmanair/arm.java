/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;
import java.util.*;
import java.io.*;



public class arm {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number");
    int n=sc.nextInt();
    int r=1,c=1,s=0,a;
    a=n;
    while(n>0)
    {
        r=n%10;
        c=r*r*r;
        s=s+c;
        n=n/10;
        
        
        
    }
    
    if(a==s)
    {
        System.out.print("Armstrong");
        
    }
    else{
        
        System.out.print("Not armstrong");
    }
    
    
    
    }
    
    
}
