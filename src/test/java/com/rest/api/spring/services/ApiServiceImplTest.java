package com.rest.api.spring.services;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rest.api.spring.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {
    }


    @org.junit.Test
    public void testGetUsers() throws Exception {

        List<User> users = apiService.getUsers(1);

        assertEquals(1, users.size());
    }
}
