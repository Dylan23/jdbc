package com.zz.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DataBaseConnection {

    	 private String driver = "com.mysql.jdbc.Driver";
    	 private String userName = "root";
    	 private String password = "3113006391";
    	 private String url = "jdbc:mysql://localhost:3306/test" ;
    	 private String sql = "select * from user" ;
    	 
    	 public void connect(){
    		 try {
                 Class.forName(driver);
                 Connection conn = DriverManager.getConnection(url, userName,
                         password);
                 PreparedStatement ps = conn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery();
                 while (rs.next()) {
                     System.out.println("name : " + rs.getString(1) + "    sex : "
                             + rs.getString(2) );
                 }

                 if (rs != null) {
                     try {
                         rs.close();
                     } catch (SQLException e) {
                         e.printStackTrace();
                     }
                 }

                 if (ps != null) {
                     try {
                         ps.close();
                     } catch (SQLException e) {
                         e.printStackTrace();
                     }
                 }

                 if (conn != null) {
                     try {
                         conn.close();
                     } catch (SQLException e) {
                         e.printStackTrace();
                     }
                 }

             } catch (Exception e) {
                 e.printStackTrace();
             }
    	}
    	 
}
