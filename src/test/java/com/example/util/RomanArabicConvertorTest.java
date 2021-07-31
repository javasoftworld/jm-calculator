package com.example.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanArabicConvertorTest {

    @Test
    void given1999Arabic_WhenConvertingToRoman_ThenReturnMCMXCIX() {
        int arabic1999 = 1999;

        String result = RomanArabicConvertor.arabicToRoman(arabic1999);

        Assertions.assertEquals("MCMXCIX", result);
    }

    @Test
    void given2018Roman_WhenConvertingToArabic_ThenReturn2018() {
        String roman2018 = "MMXVIII";

        int result = RomanArabicConvertor.romanToArabic(roman2018);

        assertEquals(2018, result);
    }

    @Test
    void given4001Arabic_WhenConvertingToRoman_ThenThrowsException() {
        int arabic4001 = 4001;

        Assertions.assertThrows(IllegalArgumentException.class, () -> RomanArabicConvertor.arabicToRoman(arabic4001));
    }

    @Test
    void givenNegativeArabic_WhenConvertingToRoman_ThenThrowsException() {
        int arabicNegative300 = -300;

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> RomanArabicConvertor.arabicToRoman(arabicNegative300));
    }
}