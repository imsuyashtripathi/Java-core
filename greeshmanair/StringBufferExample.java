/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greeshmanair;

/**
 *
 * @author ADMIN
 */
public class StringBufferExample 
{
    public static void main(String []args)
    {
//         StringBuffer sb=new StringBuffer("Hello ");  
//         sb.append("Java");//now original string is changed  
//        System.out.println(sb);//prints Hello Java  
        
//        StringBuffer sb=new StringBuffer("Hello ");  
//        sb.insert(1,"Java");//now original string is changed  
//        System.out.println(sb);//prints HJavaello  
        
//        StringBuffer sb=new StringBuffer("Hello");  
//        sb.replace(1,3,"Java");  
//        System.out.println(sb);//prints HJavalo  
        
        StringBuffer sb=new StringBuffer("Hello");  
        sb.delete(1,3);  
        sb.reverse();
        sb.capacity();
        System.out.println(sb);//prints Hlo  
    }
}
