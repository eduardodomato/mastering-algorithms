package com.algorithms.week08_graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 3: Network Delay Time
 */
class Problem03_NetworkDelayTimeTest {
    
    private Problem03_NetworkDelayTime solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem03_NetworkDelayTime();
    }
    
    @Test
    void testNetworkDelayTime_Example1() {
        int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4;
        int k = 2;
        int expected = 2;
        int result = solution.networkDelayTime(times, n, k);
        assertEquals(expected, result);
    }
    
    @Test
    void testNetworkDelayTime_Example2() {
        int[][] times = {{1,2,1}};
        int n = 2;
        int k = 1;
        int expected = 1;
        int result = solution.networkDelayTime(times, n, k);
        assertEquals(expected, result);
    }
    
    @Test
    void testNetworkDelayTime_Example3() {
        int[][] times = {{1,2,1}};
        int n = 2;
        int k = 2;
        int expected = -1;
        int result = solution.networkDelayTime(times, n, k);
        assertEquals(expected, result);
    }
    
    @Test
    void testNetworkDelayTime_SingleNode() {
        int[][] times = {};
        int n = 1;
        int k = 1;
        int expected = 0;
        int result = solution.networkDelayTime(times, n, k);
        assertEquals(expected, result);
    }
}
