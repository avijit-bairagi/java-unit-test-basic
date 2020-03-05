package com.mrrobot;

import org.junit.jupiter.api.*;

@DisplayName("Junit Test 001 (basic)")
public class JunitTest_001 {
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
    @DisplayName("Test 001-01")
    void Test_001_01() {
        System.out.println("Test_001_01");
    }

    @Test
    @DisplayName("Test 001-02")
    void Test_001_02() {
        System.out.println("Test_001_02");
    }
}
