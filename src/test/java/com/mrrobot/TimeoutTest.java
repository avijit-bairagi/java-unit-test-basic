package com.mrrobot;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Junit timeout test")
public class TimeoutTest {

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
    @DisplayName("Timeout test")
    void timeoutTestSuccess() {

        String excepted = "Timeout does not happened";

        String actual = assertTimeout(Duration.ofMillis(50), () -> {
            Thread.sleep(20);
            return "Timeout does not happened";
        });

        assertEquals(excepted, actual);
    }

    @Test
    @DisplayName("Timeout test")
    void timeoutTestFailure() {

        /**
         * this test case will fail
         */

        assertTimeout(Duration.ofMillis(50), () -> {
            Thread.sleep(60);
        });

    }

}