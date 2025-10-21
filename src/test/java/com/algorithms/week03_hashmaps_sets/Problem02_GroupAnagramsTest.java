package com.algorithms.week03_hashmaps_sets;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 2: Group Anagrams
 */
class Problem02_GroupAnagramsTest {
    
    private Problem02_GroupAnagrams solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem02_GroupAnagrams();
    }
    
    @Test
    void testGroupAnagrams_Example1() {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        var result = solution.groupAnagrams(strs);
        
        assertEquals(3, result.size());
        // Should have 3 groups: ["eat","tea","ate"], ["tan","nat"], ["bat"]
    }
    
    @Test
    void testGroupAnagrams_Example2() {
        String[] strs = {""};
        var result = solution.groupAnagrams(strs);
        
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals("", result.get(0).get(0));
    }
    
    @Test
    void testGroupAnagrams_Example3() {
        String[] strs = {"a"};
        var result = solution.groupAnagrams(strs);
        
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals("a", result.get(0).get(0));
    }
    
    @Test
    void testGroupAnagrams_NoAnagrams() {
        String[] strs = {"abc", "def", "ghi"};
        var result = solution.groupAnagrams(strs);
        
        assertEquals(3, result.size());
    }
    
    @Test
    void testGroupAnagrams_AllSame() {
        String[] strs = {"abc", "abc", "abc"};
        var result = solution.groupAnagrams(strs);
        
        assertEquals(1, result.size());
        assertEquals(3, result.get(0).size());
    }
}
