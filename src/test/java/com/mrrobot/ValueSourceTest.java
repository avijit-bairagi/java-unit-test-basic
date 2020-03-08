package com.mrrobot;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Value source test")
public class ValueSourceTest {

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

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, -10, -15, Integer.MAX_VALUE})
    @DisplayName("Integer value source test")
    void oddNumberTest(int num) {

        /**
         * one of the test case will fail
         */

        assertTrue(Numbers.isOdd(num));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    @DisplayName("String value source test")
    void stringIsBlankTest(String str) {

        assertTrue(Strings.isBlank(str));
    }

    @ParameterizedTest
    @EmptySource
    @DisplayName("Empty value source test")
    void emptyStringTest(String str) {

        assertTrue(Strings.isBlank(str));
    }
}