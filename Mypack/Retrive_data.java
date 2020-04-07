/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ADMIN
 */
public class Retrive_data 
{
    public static void main(String []args)
    {
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/col","root","raj");
            Statement s=c.createStatement();
            ResultSet rs=s.executeQuery("select * from student");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
            }
            s.close();
            c.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
