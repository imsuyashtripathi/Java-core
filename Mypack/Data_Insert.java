/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypack;

import java.sql.*;
 

/**
 There are 5 steps to connect any java application with the database in java using JDBC.
 * They are as follows:
1-Register the driver class =for.class()
2-Creating connection= getConnection()
3-Creating statement 
4-Executing queries
5-Closing connection
 */
public class Data_Insert
{
    public static void main(String []args)
    {
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/col","root","raj");
            PreparedStatement p=c.prepareStatement("insert into student values(?,?,?)");
            p.setInt(1,104);
            p.setString(2,"Sam");
            p.setString(3,"Mumbai");
            p.executeUpdate();
            System.out.println("Data Inserted");
            p.close();
            c.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
