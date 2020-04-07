/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack;

import javax.swing.*;  
public class OptionPaneExample 
{  
JFrame f;  
OptionPaneExample()
{  
    f=new JFrame();  
    JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");  
     JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
    String name=JOptionPane.showInputDialog(f,"Enter Name");      
    
}  
public static void main(String[] args) 
{  
    new OptionPaneExample();  
}  
}  