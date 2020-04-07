/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.util.*;
import java.io.*;

public class greesh {
    
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of the rectangle");
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int area=a*b;
        
        System.out.println("The area of rectangle is "+area);
    }
    
}
