package com.example.gestaocantinas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AuthenticationServiceTest {

    private AuthenticationService authService;

    @Before
    public void setUp() {
        authService = new AuthenticationService();
    }

    @Test
    public void testAuthentication() {
        assertTrue(authService.authenticateUser("employee1", "password123"));
    }
}