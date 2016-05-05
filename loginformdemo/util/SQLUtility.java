/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.loginformdemo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Navin
 */
public class SQLUtility {
   static String driver="com.mysql.jdbc.Driver";
   static String DB_UserName="root";
  static  String DB_Password="";
  static  String DB_Url="mysql:jdbc://localhost:3306/User";
    public static Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    Connection con=null;
    Class.forName(driver).newInstance();
    con=DriverManager.getConnection(DB_Url, DB_UserName, DB_Password);
    return con;
    }
    
}
