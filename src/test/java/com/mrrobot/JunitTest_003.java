package com.mrrobot;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Junit Test 003 (exception)")
public class JunitTest_003 {

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
    @DisplayName("Test 003-01")
    void Test_003_01() {
        System.out.println("Test_001_01");

        assertThrows(NullPointerException.class, () -> {
            throw new NullPointerException("Null pointer exception.");
        });
    }

    @Test
    @DisplayName("Test 003-02")
    void Test_003_02() {
        System.out.println("Test_001_02");

        final String message = "Null pointer exception.";
        final NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            throw new NullPointerException("Null pointer exception.");
        });

        assertEquals(message, exception.getMessage());
    }

    @Test
    @DisplayName("Test 003-03")
    void Test_003_03() {
        System.out.println("Test_003_03");
        assertDoesNotThrow(() -> {

        });
    }
}
