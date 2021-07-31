package com.example.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MathOperationValidatorTest {

    MathOperationValidator validator;

    @BeforeEach
    void setUp() {
        validator = new MathOperationValidator();
    }

    @Test
    void givenArabicNumsOperationString_WhenValidatingString_ThenReturnTrue() {
        String correctArabicOperation = "10 * 10";

        boolean isValid = validator.isArabicNumsOperation(correctArabicOperation);

        assertTrue(isValid);
    }

    @Test
    void givenWrongOperationString_WhenArabicValidatingString_ThenReturnFalse() {
        String wrongOperation = "X - XX";

        boolean isValid = validator.isArabicNumsOperation(wrongOperation);

        assertFalse(isValid);
    }

    @Test
    void givenRomanNumsOperationString_WhenValidatingString_ThenReturnTrue() {
        String correctRomanOperation = "X / III";

        boolean isValid = validator.isRomanNumsOperation(correctRomanOperation);

        assertTrue(isValid);
    }
}