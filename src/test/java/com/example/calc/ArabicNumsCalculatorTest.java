package com.example.calc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArabicNumsCalculatorTest {

    ArabicNumsCalculator calculator;

    @ParameterizedTest
    @CsvSource({"3 - 1, 2", "10 / 3,3", "5 + 9,14"})
    void givenArabicNumsOperationString_WhenDoCalc_ThenReturnTrueResult(String input, String expectedResult) {

        calculator = new ArabicNumsCalculator(input);
        String result = calculator.doCalc();

        assertEquals(expectedResult, result);
    }
}