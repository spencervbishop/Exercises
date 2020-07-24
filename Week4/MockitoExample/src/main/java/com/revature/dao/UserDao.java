package com.revature.dao;

import com.revature.beans.User;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    ConnectionUtil connectionUtil = ConnectionUtil.getConnectionUtil();
    //need crap to test, make a few constructors
    public UserDao(){

    }
    public UserDao(ConnectionUtil util){
        this.connectionUtil = util;

    }

    /**
     * Gets a user by their username
     * @param username
     * @return
     */
    public User getUserByUsername(String username){
        return null;
    }

    public void saveUser(User user){
        try(Connection conn = connectionUtil.getConnection()){
            PreparedStatement ps = conn.prepareStatement("INSERT INTO users (username, password) VALUES (?,?)");
            ps.setString(1,user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet result = ps.executeQuery();
            if(result.next()){
                user.setId(result.getInt("id"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
