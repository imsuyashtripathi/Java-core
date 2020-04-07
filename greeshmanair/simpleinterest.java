/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.util.*;
import java.io.*;
public class simpleinterest {
    public static void main(String[] args)throws IOException{
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of years, rate and principal amount");
        int n=sc.nextInt();
        
        double r=sc.nextDouble();
        
        int p=sc.nextInt();
        
        double si=(p*n*r)/2;
        
        
        System.out.println("The si is"+si);
        
        
    }
}
