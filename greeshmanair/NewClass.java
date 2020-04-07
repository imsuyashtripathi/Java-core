/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeshmanair;

/**
 * Difference between String and StringBuffer
 *
 * There are many differences between String and StringBuffer. A list of
 * differences between String and StringBuffer are given below:
 *
 * No.	String	StringBuffer 1)	String class is immutable.	1- StringBuffer class
 * is mutable. 2)	String is slow and consumes more memory when you concat too
 * many strings because every time it creates new instance.	2-StringBuffer is
 * fast and consumes less memory when you cancat strings. 3)	String class
 * overrides the equals() method of Object class. So you can compare the
 * contents of two strings by equals() method 3-StringBuffer class doesn't
 * override the equals() method of Object class.
 */
public class NewClass {

    public static void main(String[] args) {
//       String name="rajcomputer";  
//       char ch=name.charAt(4);//returns the char value at the 4th index  
//       System.out.println(ch);

//       String s1="ABCDEFG";  
//       byte[] barr=s1.getBytes();  
//       for(int i=0;i<barr.length;i++)
//       {  
//            System.out.println(barr[i]);  
//      }
//        String str = new String("hello javatpoint how r u");
//        char[] ch = new char[10];
//        try {
//            str.getChars(6, 16, ch, 0);
//            System.out.println(ch);
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
        
// String s1="this is index of example";  
////passing substring  
//int index1=s1.indexOf("is");//returns the index of is substring  
//int index2=s1.indexOf("index");//returns the index of index substring  
//System.out.println(index1+"  "+index2);//2 8  
//  
////passing substring with from index  
//int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
//System.out.println(index3);//5 i.e. the index of another is  
//  
////passing char value  
//int index4=s1.indexOf('s');//returns the index of s char value  
//System.out.println(index4);//3  
//        String s1="";  
//String s2="raj";  
//  
//System.out.println(s1.isEmpty());  
//System.out.println(s2.isEmpty());  
        String s1="java string split method by javatpoint";  
String[] words=s1.split("\\s");//splits the string based on whitespace  
//using java foreach loop to print elements of string array  
for(String w:words){  
System.out.println(w);  
}  
    }
}
