/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

import java.io.*;
import java.util.*;

public class GreeshmaNair {

    
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        double area,radius;
        System.out.println("Enter the radius for area of circle");
        radius=sc.nextDouble();
        area=3.14*(radius*radius);
        
        System.out.println("The area of the circle is"+area);
        
        
    }
    
}
