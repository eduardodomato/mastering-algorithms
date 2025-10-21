package com.algorithms.week10_dynamic_programming_1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 2: House Robber
 */
class Problem02_HouseRobberTest {
    
    private Problem02_HouseRobber solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem02_HouseRobber();
    }
    
    @Test
    void testRob_Example1() {
        int[] nums = {1,2,3,1};
        int expected = 4; // Rob house 1 (money = 1) and house 3 (money = 3)
        int result = solution.rob(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testRob_Example2() {
        int[] nums = {2,7,9,3,1};
        int expected = 12; // Rob house 1 (money = 2), house 3 (money = 9), house 5 (money = 1)
        int result = solution.rob(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testRob_SingleHouse() {
        int[] nums = {5};
        int expected = 5;
        int result = solution.rob(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testRob_TwoHouses() {
        int[] nums = {2,1};
        int expected = 2; // Rob house 1
        int result = solution.rob(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testRob_ThreeHouses() {
        int[] nums = {2,1,1,2};
        int expected = 4; // Rob house 1 and house 4
        int result = solution.rob(nums);
        assertEquals(expected, result);
    }
}
