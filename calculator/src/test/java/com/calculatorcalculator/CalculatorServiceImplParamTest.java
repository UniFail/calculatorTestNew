package com.calculatorcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.calculatorcalculator.Const.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParamTest {
    private CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSumCorrectly(int num1, int num2) {
        int result = calculatorService.plus(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSubtractCorrectly(int num1, int num2) {
        int result = calculatorService.minus(num1, num2);
        assertEquals(num1 - num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMultiplyCorrectly(int num1, int num2) {
        int result = calculatorService.multiply(num1, num2);
        assertEquals(num1 * num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldDivideCorrectly(int num1, int num2) {
        int result = calculatorService.divide(num1, num2);
        assertEquals(num1 / num2, result);
    }

    private static Stream<Arguments> provideCalculatorParams() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, TWO),
                Arguments.of(TWO, THREE),
                Arguments.of(ZERO, THREE)
        );
    }
}
