package com.example.util;

import java.util.regex.Pattern;

public class MathOperationValidator {

    public static final String ARABIC_NUMS_OPS = "^([1-9]|10)\\s([*/+-])\\s([1-9]|10)$";
    public static final String ROMAN_NUMS_OPS = "^([I]{1,3}?V|V?I{0,3}|I?X)\\s([*/+-])\\s([I]{1,3}?V|V?I{0,3}|I?X)$";
    private final Pattern patternArabicNums = Pattern.compile(ARABIC_NUMS_OPS);
    private final Pattern patternRomanNums = Pattern.compile(ROMAN_NUMS_OPS);

    public boolean isArabicNumsOperation(String operationString) {
        return patternArabicNums.matcher(operationString).matches();
    }

    public boolean isRomanNumsOperation(String operationString) {
        return patternRomanNums.matcher(operationString).matches();
    }
}
