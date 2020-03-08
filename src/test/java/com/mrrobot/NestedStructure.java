package com.mrrobot;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayName("Nested unit Test")
public class NestedStructure {
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
    @DisplayName("Simple test")
    void simpleTest() {
        assertNotEquals(5, 6);
    }

    @Nested
    @DisplayName("String Test")
    class StringTest {

        @BeforeEach
        void beforeEach() {
            System.out.println("beforeEach_StringTest");
        }

        @AfterEach
        void afterEach() {
            System.out.println("afterEach_StringTest");
        }

        @Test
        @DisplayName("String length test")
        void twoStringLengthTest() {
            String a = "Hello World";
            String b = "Hello Earth";

            Assertions.assertEquals(a.length(), b.length());
        }

        @Test
        @DisplayName("Message content test")
        void twoMessageTest() {
            String excepted = "Hi, there";
            String actual = Strings.getMessage("Hi, there");
            Assertions.assertEquals(excepted, actual);
        }
    }

    @Nested
    @DisplayName("Math Test")
    class MathTest {

        @BeforeEach
        void beforeEach() {
            System.out.println("beforeEach_MathTest");
        }

        @AfterEach
        void afterEach() {
            System.out.println("afterEach_MathTest");
        }

        @Test
        @DisplayName("Add two integer test")
        void addTwoIntegerTest() {
            int excepted = 10;
            int actual = Math.add(2, 8);

            Assertions.assertEquals(excepted, actual);
        }

        @Test
        @DisplayName("Sub two integer test")
        void subTwoIntegerTest() {
            int excepted = -7;
            int actual = Math.sub(2, 9);

            Assertions.assertEquals(excepted, actual);
        }

    }
}