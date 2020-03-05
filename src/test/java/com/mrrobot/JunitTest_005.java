package com.mrrobot;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Junit Test 005")
public class JunitTest_005 {

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
    @DisplayName("Test 005-01")
    void Test_003_01(int num) {
        System.out.println("Test_005_01");
        assertTrue(Numbers.isOdd(num));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    @DisplayName("Test 005-02")
    void Test_005_02(String str) {
        System.out.println("Test_005_02");
        assertTrue(Strings.isBlank(str));
    }

    @ParameterizedTest
    @EmptySource
    @DisplayName("Test 005-03")
    void Test_005_03(String str) {
        System.out.println("Test_005_03");
        assertTrue(Strings.isBlank(str));
    }

    @ParameterizedTest
    @MethodSource("provideStringForTest")
    @DisplayName("Test 005-04")
    void Test_005_04(String str, boolean excepted) {
        System.out.println("Test_005_04");
        assertEquals(excepted, Strings.isBlank(str));
    }

    @ParameterizedTest
    @MethodSource("provideHumanForTest")
    @DisplayName("Test 005-05")
    void Test_005_05(Human human, boolean excepted) {
        System.out.println("Test_005_05");
        assertEquals(excepted, human.getIsEducated());
    }

    private static Stream<Arguments> provideHumanForTest() {

        Human educated_01 = new Human("ABC", 26, true);
        Human non_educated_01 = new Human("XYZ", 10, false);
        Human educated_02 = new Human("PQR", 87, true);
        Human confused_01 = new Human("-(<", 87, true);

        return Stream.of(
                Arguments.of(educated_01, true),
                Arguments.of(non_educated_01, false),
                Arguments.of(educated_02, true),
                Arguments.of(confused_01, false)
        );
    }

    private static Stream<Arguments> provideStringForTest() {
        return Stream.of(
                Arguments.of(null, true),
                Arguments.of("", true),
                Arguments.of("  ", true),
                Arguments.of("not blank", false)
        );
    }
}