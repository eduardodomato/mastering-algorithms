package com.algorithms.week01_arrays_strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 4: Roman to Integer
 */
class Problem04_RomanToIntTest {
    
    private Problem04_RomanToInt solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem04_RomanToInt();
    }
    
    @Test
    void testRomanToInt_Example1() {
        String s = "III";
        int expected = 3;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testRomanToInt_Example2() {
        String s = "LVIII";
        int expected = 58;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testRomanToInt_Example3() {
        String s = "MCMXCIV";
        int expected = 1994;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testRomanToInt_SingleSymbol() {
        String s = "V";
        int expected = 5;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testRomanToInt_SubtractionCase_IV() {
        String s = "IV";
        int expected = 4;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testRomanToInt_SubtractionCase_IX() {
        String s = "IX";
        int expected = 9;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testRomanToInt_SubtractionCase_XL() {
        String s = "XL";
        int expected = 40;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testRomanToInt_SubtractionCase_XC() {
        String s = "XC";
        int expected = 90;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testRomanToInt_SubtractionCase_CD() {
        String s = "CD";
        int expected = 400;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testRomanToInt_SubtractionCase_CM() {
        String s = "CM";
        int expected = 900;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testRomanToInt_MaximumValue() {
        String s = "MMMCMXCIX";
        int expected = 3999;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testRomanToInt_MinimumValue() {
        String s = "I";
        int expected = 1;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testRomanToInt_ComplexCase() {
        String s = "MMCDXLIV";
        int expected = 2444;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testRomanToInt_SimpleAddition() {
        String s = "XXVII";
        int expected = 27;
        int result = solution.romanToInt(s);
        
        assertEquals(expected, result);
    }
}

