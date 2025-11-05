package com.algorithms.week03_hashmaps_sets;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

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
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        
        assertEquals(3, result.size());
        
        // Sort each group and the result for comparison
        List<List<String>> sortedResult = new ArrayList<>();
        for (List<String> group : result) {
            List<String> sortedGroup = new ArrayList<>(group);
            Collections.sort(sortedGroup);
            sortedResult.add(sortedGroup);
        }
        sortedResult.sort(Comparator.comparing(list -> list.get(0)));
        
        // Verify groups
        boolean foundBat = false, foundEatGroup = false, foundTanGroup = false;
        for (List<String> group : sortedResult) {
            Collections.sort(group);
            if (group.size() == 1 && group.contains("bat")) {
                foundBat = true;
            } else if (group.size() == 3 && group.contains("eat") && group.contains("tea") && group.contains("ate")) {
                foundEatGroup = true;
            } else if (group.size() == 2 && group.contains("tan") && group.contains("nat")) {
                foundTanGroup = true;
            }
        }
        
        assertTrue(foundBat);
        assertTrue(foundEatGroup);
        assertTrue(foundTanGroup);
    }
    
    @Test
    void testGroupAnagrams_Example2() {
        String[] strs = {""};
        List<List<String>> result = solution.groupAnagrams(strs);
        
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals("", result.get(0).get(0));
    }
    
    @Test
    void testGroupAnagrams_Example3() {
        String[] strs = {"a"};
        List<List<String>> result = solution.groupAnagrams(strs);
        
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals("a", result.get(0).get(0));
    }
    
    @Test
    void testGroupAnagrams_Example4() {
        String[] strs = {"listen", "silent", "enlist", "inlets", "listen"};
        List<List<String>> result = solution.groupAnagrams(strs);
        
        // All strings are anagrams, so they should be in one group
        // The duplicate "listen" will appear twice in the same group
        assertEquals(1, result.size());
        
        // Find the group with all anagrams
        List<String> group = result.get(0);
        assertEquals(5, group.size()); // All 5 strings (including duplicate) in one group
        
        // Verify all anagrams are present
        assertTrue(group.contains("listen"));
        assertTrue(group.contains("silent"));
        assertTrue(group.contains("enlist"));
        assertTrue(group.contains("inlets"));
        
        // Count occurrences of "listen" - should be 2
        long listenCount = group.stream().filter(s -> s.equals("listen")).count();
        assertEquals(2, listenCount);
    }
    
    @Test
    void testGroupAnagrams_EmptyArray() {
        String[] strs = {};
        List<List<String>> result = solution.groupAnagrams(strs);
        
        assertEquals(0, result.size());
    }
    
    @Test
    void testGroupAnagrams_AllSame() {
        String[] strs = {"abc", "abc", "abc"};
        List<List<String>> result = solution.groupAnagrams(strs);
        
        assertEquals(1, result.size());
        assertEquals(3, result.get(0).size());
    }
    
    @Test
    void testGroupAnagrams_NoAnagrams() {
        String[] strs = {"abc", "def", "ghi"};
        List<List<String>> result = solution.groupAnagrams(strs);
        
        assertEquals(3, result.size());
        for (List<String> group : result) {
            assertEquals(1, group.size());
        }
    }
    
    @Test
    void testGroupAnagrams_MultipleGroups() {
        String[] strs = {"abc", "bca", "cab", "xyz", "zyx", "def"};
        List<List<String>> result = solution.groupAnagrams(strs);
        
        assertEquals(3, result.size());
        
        // Verify abc group has 3 elements
        boolean foundAbcGroup = false;
        for (List<String> group : result) {
            if (group.size() == 3 && group.contains("abc")) {
                foundAbcGroup = true;
                assertTrue(group.contains("bca"));
                assertTrue(group.contains("cab"));
            }
        }
        assertTrue(foundAbcGroup);
    }
    
    @Test
    void testGroupAnagrams_SingleCharStrings() {
        String[] strs = {"a", "b", "c", "a", "b"};
        List<List<String>> result = solution.groupAnagrams(strs);
        
        assertEquals(3, result.size());
        
        // Find groups
        int aCount = 0, bCount = 0, cCount = 0;
        for (List<String> group : result) {
            String first = group.get(0);
            if (first.equals("a")) aCount = group.size();
            else if (first.equals("b")) bCount = group.size();
            else if (first.equals("c")) cCount = group.size();
        }
        
        assertEquals(2, aCount);
        assertEquals(2, bCount);
        assertEquals(1, cCount);
    }
}

