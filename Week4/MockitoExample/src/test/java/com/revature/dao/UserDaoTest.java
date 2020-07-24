package com.revature.dao;

import com.revature.beans.User;
import com.revature.util.ConnectionUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserDaoTest{

    @Mock
    ConnectionUtil cu;

    @Mock
    Connection conn;

    @Mock
    PreparedStatement ps;

    @Mock
    ResultSet result;

    @Before
    public void setup() throws Exception{
        when(cu.getConnection()).thenReturn(conn);
        when(conn.prepareStatement(anyString())).thenReturn(ps);
        when(ps.executeQuery()).thenReturn(result);
        when(result.next()).thenReturn(true).thenReturn(false);
        when(result.getInt(anyString())).thenReturn(1);
    }

    @Test
    public void testSaveUser() throws Exception{
        UserDao dao = new UserDao(cu);
        User newUser = new User("username", "password");
        dao.saveUser(newUser);
        assertTrue(1==newUser.getId());
    }

}