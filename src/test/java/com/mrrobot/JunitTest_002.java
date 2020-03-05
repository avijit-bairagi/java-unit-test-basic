package com.mrrobot;

import org.junit.jupiter.api.*;

@DisplayName("Junit Test 002 (nested)")
public class JunitTest_002 {
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
    @DisplayName("Test 002-01")
    void Test_002_01() {
        System.out.println("Test_002_01");
    }

    @Test
    @DisplayName("Test 002-02")
    void Test_002_02() {
        System.out.println("Test_002_02");
    }

    @Nested
    @DisplayName("Junit Test 002 A 01")
    class A {

        @BeforeEach
        void beforeEach() {
            System.out.println("beforeEach_nested_A");
        }

        @AfterEach
        void afterEach() {
            System.out.println("afterEach_nested_A");
        }

        @Test
        @DisplayName("Test 002 A 01")
        void Test_002_nested_01() {
            System.out.println("Test_002_nested_A_01");
        }

        @Test
        @DisplayName("Test 002 A 02")
        void Test_002_nested_02() {
            System.out.println("Test_002_nested_A_02");
        }

        @Nested
        @DisplayName("Junit Test 002 A-X 01")
        class X {

            @BeforeEach
            void beforeEach() {
                System.out.println("beforeEach_nested_A_X");
            }

            @AfterEach
            void afterEach() {
                System.out.println("afterEach_nested_A_X");
            }

            @Test
            @DisplayName("Test 002 A-X 01")
            void Test_002_nested_01() {
                System.out.println("Test_002_nested_A_X_01");
            }

        }
    }
}