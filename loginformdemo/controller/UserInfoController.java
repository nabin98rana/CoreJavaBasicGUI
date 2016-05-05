/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.loginformdemo.controller;

import com.navin.loginformdemo.model.UserInfo;
import com.navin.loginformdemo.util.SQLUtility;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Navin
 */
public class UserInfoController {
    UserInfo user=new UserInfo();
    
    public boolean isValidUser()  {
        String sql="Select* from userinfo where username='"+user.getUserName()+"' and password='"+user.getPassword()+"';" ;
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        
        try {
            conn=SQLUtility.getConnection();
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);
            if(rs.next()){
            return true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserInfoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(UserInfoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(UserInfoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserInfoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    return false;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }
}
