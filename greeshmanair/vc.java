/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.util.*;
import java.io.*;


public class vc {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the variable to be checked");
    
    char n=sc.next().charAt(0);
    if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u')
    {
        System.out.println("The character is a vowel");
        
        
    }
    else
    {
        System.out.println("The character is a consonant");
    }
    
    
    
    }
}
