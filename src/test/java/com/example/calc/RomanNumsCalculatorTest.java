package com.example.calc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumsCalculatorTest {

    RomanNumsCalculator calculator;

    @ParameterizedTest
    @CsvSource({"X - III, VII", "IV * V, XX", "X + VI, XVI"})
    void givenRomanNumsOperationString_WhenDoCalc_ThenReturnTrueResult(String input, String expectedResult) {

        calculator = new RomanNumsCalculator(input);
        String result = calculator.doCalc();

        assertEquals(expectedResult, result);
    }
}