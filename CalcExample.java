/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;  
import java.awt.event.*;  
/**
 *
 * @author ADMIN
 */
public class CalcExample
{
    TextField t1;
    TextField t2;
    Label l1;
    int res;
        CalcExample(){  
        Frame f= new Frame(); 
        
        final Label label = new Label();          
        label.setBounds(100,150,400,100);
      // label.setAlignment(Label.CENTER);  
        t1 =new TextField(20);
        t2 =new TextField(20);
        Button b=new Button("Show");  
        b.setBounds(200,100,50,20);  
        final Choice c=new Choice();  
        c.setBounds(100,100, 75,75);  
        c.add("Add");  
        c.add("Subtract");  
        c.add("Multiply");  
        c.add("Division");  
        f.add(t1);
        f.add(t2);
        f.add(c);f.add(label); f.add(b); 
        f.add(l1);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
        
        b.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {       
         String data = "Operation selected "+ c.getItem(c.getSelectedIndex());  
         label.setText(data);  
         
         String a=t1.getText();
         String b=t2.getText();
         
         
         l1.setText(a+" "+b);
         
         
         
        // if(c.getItem(c.getSelectedIndex())=="Add")
         //{
            // res=
        // }
        }  
        }); 
        
        
        
        
        }  

public static void main(String []args)
{
    new CalcExample();
    
}
}