package com.example.calc;

import com.example.util.MathOperationValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArabicNumsCalculator implements Calculator {

    private final String operationString;
    private int result;

    public ArabicNumsCalculator(String operationString) {
        this.operationString = operationString;
        this.result = 0;
    }

    @Override
    public String doCalc() {
        Pattern pattern = Pattern.compile(MathOperationValidator.ARABIC_NUMS_OPS);
        Matcher matcher = pattern.matcher(operationString);
        matcher.matches();
        int firstOperand = Integer.parseInt(matcher.group(1));
        int secondOperand = Integer.parseInt(matcher.group(3));
        switch (matcher.group(2)) {
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
            default:
                throw new IllegalArgumentException("Unexpected math operation!");
        }
        return String.valueOf(result);
    }
}
