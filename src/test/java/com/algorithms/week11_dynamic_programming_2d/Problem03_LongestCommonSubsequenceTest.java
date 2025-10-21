package com.algorithms.week11_dynamic_programming_2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 3: Longest Common Subsequence
 */
class Problem03_LongestCommonSubsequenceTest {
    
    private Problem03_LongestCommonSubsequence solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem03_LongestCommonSubsequence();
    }
    
    @Test
    void testLongestCommonSubsequence_Example1() {
        String text1 = "abcde";
        String text2 = "ace";
        int expected = 3; // "ace"
        int result = solution.longestCommonSubsequence(text1, text2);
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestCommonSubsequence_Example2() {
        String text1 = "abc";
        String text2 = "abc";
        int expected = 3; // "abc"
        int result = solution.longestCommonSubsequence(text1, text2);
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestCommonSubsequence_Example3() {
        String text1 = "abc";
        String text2 = "def";
        int expected = 0; // No common subsequence
        int result = solution.longestCommonSubsequence(text1, text2);
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestCommonSubsequence_EmptyStrings() {
        String text1 = "";
        String text2 = "";
        int expected = 0;
        int result = solution.longestCommonSubsequence(text1, text2);
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestCommonSubsequence_OneEmpty() {
        String text1 = "abc";
        String text2 = "";
        int expected = 0;
        int result = solution.longestCommonSubsequence(text1, text2);
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestCommonSubsequence_SingleCharacter() {
        String text1 = "a";
        String text2 = "a";
        int expected = 1;
        int result = solution.longestCommonSubsequence(text1, text2);
        assertEquals(expected, result);
    }
}
