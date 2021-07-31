package com.example.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorProcessorTest {

    CalculatorProcessor processor = new CalculatorProcessor();

    @Test
    void shouldReturnArabicNumsCalculator() {
        String arabicNumsOperationString = "3 + 2";

        final Calculator calculator = processor.getCalculator(arabicNumsOperationString);

        assertEquals(ArabicNumsCalculator.class, calculator.getClass());
    }

    @Test
    void shouldReturnRomanNumsCalculator() {
        String romanNumsOperationString = "X / V";

        final Calculator calculator = processor.getCalculator(romanNumsOperationString);

        assertEquals(RomanNumsCalculator.class, calculator.getClass());
    }

    @Test
    void shouldThrowException_WhenWrongOperationString() {
        String wrongNumsOperationString = "X + V - 3";

        assertThrows(IllegalArgumentException.class, () -> processor.getCalculator(wrongNumsOperationString));
    }
}