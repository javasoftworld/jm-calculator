package com.example.calc;

import com.example.util.MathOperationValidator;


public class CalculatorProcessor {

    private final MathOperationValidator validator;

    public CalculatorProcessor() {
        validator = new MathOperationValidator();
    }

    public Calculator getCalculator(String operationString) {
        if (validator.isArabicNumsOperation(operationString)) {
            return new ArabicNumsCalculator(operationString);
        } else if (validator.isRomanNumsOperation(operationString)) {
            return new RomanNumsCalculator(operationString);
        } else {
            throw new IllegalArgumentException("Wrong operation string entered!");
        }
    }
}
