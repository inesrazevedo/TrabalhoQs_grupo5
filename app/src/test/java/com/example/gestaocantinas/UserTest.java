package com.example.gestaocantinas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UserTest {

    @Test
    public void testUserCreation() {
        User user = new User(1, "John Doe", "123456", "employee");

        assertNotNull(user);
        assertEquals(1, user.getId());
        assertEquals("John Doe", user.getName());
        assertEquals("123456", user.getIdentificationNumber());
        assertEquals("employee", user.getRole());
    }
}