package com.calculatorcalculator;

import org.junit.jupiter.api.Test;

import static com.calculatorcalculator.Const.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldReternTwoWhenSumOneAndOne() {

        int result = calculatorService.plus(ONE, ONE);
        assertEquals(ONE + ONE, result);
    }

    @Test
    public void shouldReternTwoWhenSumTwoAndOne() {

        int result = calculatorService.plus(ONE, TWO);
        assertEquals(ONE + TWO, result);
    }

    @Test
    public void shouldReternOneWhenSubtractTwoAndOne() {

        int result = calculatorService.minus(TWO, ONE);
        assertEquals(TWO - ONE, result);
    }

    @Test
    public void shouldReternZeroWhenSubtractOneAndOne() {

        int result = calculatorService.minus(ONE, ONE);
        assertEquals(ONE - ONE, result);
    }

    @Test
    public void shouldReternOneWhenMultiplyOneAndOne() {

        int result = calculatorService.multiply(ONE, ONE);
        assertEquals(ONE * ONE, result);
    }

    @Test
    public void shouldReternTwoWhenMultiplyOneAndOne() {

        int result = calculatorService.multiply(ONE, TWO);
        assertEquals(ONE * TWO, result);
    }

    @Test
    public void shouldReternTwoWhenDivideTwoAndOne() {

        int result = calculatorService.divide(TWO, ONE);
        assertEquals(TWO / ONE, result);
    }

    @Test
    public void shouldReternOneWhenDivideOneAndOne() {

        int result = calculatorService.divide(ONE, ONE);
        assertEquals(ONE / ONE, result);
    }

    @Test
    public void shouldThrowDivisionByZeroExceptionWhenDivideByZero(){
        assertThrows(ByZeroExaption.class, () -> calculatorService.divide(ONE,ZERO));
    }
}