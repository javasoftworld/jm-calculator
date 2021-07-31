package com.example;

import com.example.calc.Calculator;
import com.example.calc.CalculatorProcessor;
import com.example.util.ConsoleProcessor;

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorProcessor processor = new CalculatorProcessor();
        final Calculator calculator = processor.getCalculator(ConsoleProcessor.getOperationStringFromConsole("Input: "));
        ConsoleProcessor.printOutTheResult(calculator.doCalc());
    }
}
