package com.example;

// import org.junit.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.AfterEach;

// import static org.junit.Assert.*;
// import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;


public class AAAUserTest {

    User user;

    // Setup
    @BeforeEach
    public void setUp() {
        user = new User();
        user.setName("Deepika");
    }

    // Teardown
    @AfterEach
    public void tearDown() {
        user = null;
    }

    @Test
    public void testGetName_AAA() {

        // ARRANGE is already done in setUp()

        // ACT
        String name = user.getName();

        // ASSERT
        assertEquals("Deepika", name);
    }
}