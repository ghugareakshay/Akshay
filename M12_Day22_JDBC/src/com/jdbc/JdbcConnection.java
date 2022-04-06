package com.jdbc;
import java.sql.*;
public class JdbcConnection {
public static void main(String[] args) {
  
    try {
    	Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root",""); 
       
        Statement Stmt = myConn.createStatement();
       
        ResultSet Rs= Stmt.executeQuery("select * from student");
        
        while(Rs.next()) {
            System.out.print(Rs.getInt("Id")+"\n"+Rs.getString("Name"));         
            
        }
    }
    catch(Exception e) {
        e.printStackTrace();
    }
 
}

}