package com.example.calc;

import com.example.util.MathOperationValidator;
import com.example.util.RomanArabicConvertor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumsCalculator implements Calculator {

    private final String operationString;
    private int result;

    public RomanNumsCalculator(String operationString) {
        this.operationString = operationString;
        this.result = 0;
    }

    @Override
    public String doCalc() {
        Pattern pattern = Pattern.compile(MathOperationValidator.ROMAN_NUMS_OPS);
        Matcher matcher = pattern.matcher(operationString);
        matcher.matches();
        int firstOperand = RomanArabicConvertor.romanToArabic(matcher.group(1));
        int secondOperand = RomanArabicConvertor.romanToArabic(matcher.group(3));
        switch (matcher.group(2)) {
            case "-":
                if (firstOperand <= secondOperand)
                    throw new IllegalArgumentException("There are no negative Roman number");
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
        return RomanArabicConvertor.arabicToRoman(result);
    }
}
