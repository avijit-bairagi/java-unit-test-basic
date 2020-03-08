package com.mrrobot;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Junit Basic structure")
public class BasicStructure {
    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @Test
    @DisplayName("Simple boolean test")
    void SimpleBooleanTest() {
        assertTrue(true);
    }

    @Test
    @DisplayName("Simple equality test")
    void SimpleEqualityTest() {
        assertEquals(5,5);
    }
}
