package com.mrrobot;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Method source test")
public class MethodSourceTest {

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
    @MethodSource("provideStringForTest")
    @DisplayName("String value test")
    void stringIsBlankTest(String str, boolean excepted) {

        assertEquals(excepted, Strings.isBlank(str));
    }

    @ParameterizedTest
    @MethodSource("provideHumanForTest")
    @DisplayName("Object value test")
    void testHumanObject(Human human, boolean excepted) {

        /**
         * one of the test case will fail
         */

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
