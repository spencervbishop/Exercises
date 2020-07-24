package com.revature.services;

import com.revature.beans.User;
import com.revature.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

        @Mock
        UserDao mockDao;

        User userCorrect = new User();
        User userIncorrect = new User();



        @Before
        public void setup() throws Exception{ //this thing is pretending to be the database. fill it with crap
            userCorrect.setUsername("username");
            userIncorrect.setUsername("username");
            userCorrect.setPassword("correct");
            userIncorrect.setPassword("incorrect");

            when(mockDao.getUserByUsername(anyString()))
                    .thenReturn(userCorrect)
                    .thenReturn(userIncorrect);

        }

        @Test
        public void testAuthentication() throws Exception{
        UserService service = new UserService(mockDao);
            System.out.println(service.authenticate("username", "correct"));
            System.out.println(service.authenticate("username", "incorerct"));
        }
    }
