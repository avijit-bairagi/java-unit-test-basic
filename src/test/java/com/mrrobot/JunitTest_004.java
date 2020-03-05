package com.mrrobot;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

@DisplayName("Junit Test 004 (timeout)")
public class JunitTest_004 {

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
    @DisplayName("Test 004-01")
    void Test_003_01() {
        System.out.println("Test_004_01");

        String excepted = "Not timeout.";

        String actual = assertTimeout(Duration.ofMillis(50), () -> {
            Thread.sleep(20);
            return "Not timeout.";
        });

        assertEquals(excepted, actual);
    }

}