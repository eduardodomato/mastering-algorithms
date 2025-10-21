package com.algorithms.week11_dynamic_programming_2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 2: Edit Distance
 */
class Problem02_EditDistanceTest {
    
    private Problem02_EditDistance solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem02_EditDistance();
    }
    
    @Test
    void testMinDistance_Example1() {
        String word1 = "horse";
        String word2 = "ros";
        int expected = 3;
        int result = solution.minDistance(word1, word2);
        assertEquals(expected, result);
    }
    
    @Test
    void testMinDistance_Example2() {
        String word1 = "intention";
        String word2 = "execution";
        int expected = 5;
        int result = solution.minDistance(word1, word2);
        assertEquals(expected, result);
    }
    
    @Test
    void testMinDistance_SameWords() {
        String word1 = "abc";
        String word2 = "abc";
        int expected = 0;
        int result = solution.minDistance(word1, word2);
        assertEquals(expected, result);
    }
    
    @Test
    void testMinDistance_EmptyWord1() {
        String word1 = "";
        String word2 = "abc";
        int expected = 3;
        int result = solution.minDistance(word1, word2);
        assertEquals(expected, result);
    }
    
    @Test
    void testMinDistance_EmptyWord2() {
        String word1 = "abc";
        String word2 = "";
        int expected = 3;
        int result = solution.minDistance(word1, word2);
        assertEquals(expected, result);
    }
    
    @Test
    void testMinDistance_SingleCharacters() {
        String word1 = "a";
        String word2 = "b";
        int expected = 1;
        int result = solution.minDistance(word1, word2);
        assertEquals(expected, result);
    }
}
