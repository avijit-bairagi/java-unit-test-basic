package com.mrrobot;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Junit exception test")
public class ExceptionTest {

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
    @DisplayName("Simple NullPointerException test")
    void nullPointerTest() {
        System.out.println("Test_001_01");

        assertThrows(NullPointerException.class, () -> {
            throw new NullPointerException("Null pointer exception.");
        });
    }

    @Test
    @DisplayName("NullPointerException with message test")
    void nullPointerWithMessageTest() {

        final String message = "Null pointer exception.";
        final NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            throw new NullPointerException("Null pointer exception.");
        });

        assertEquals(message, exception.getMessage());
    }

    @Test
    @DisplayName("DoesNotThrow exception test")
    void doesNotThrowExceptionTest() {

        assertDoesNotThrow(() -> {
            System.out.println("No exception here");
        });
    }
}
