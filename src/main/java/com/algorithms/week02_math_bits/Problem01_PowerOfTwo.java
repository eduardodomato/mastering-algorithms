package com.algorithms.week02_math_bits;

/**
 * Problem 1: Power of Two
 * 
 * LeetCode #231 - Easy
 * 
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 * 
 * An integer n is a power of two, if there exists an integer x such that n == 2^x.
 * 
 * Constraints:
 * - -2^31 <= n <= 2^31 - 1
 * 
 * Example 1:
 * Input: n = 1
 * Output: true
 * Explanation: 2^0 = 1
 * 
 * Example 2:
 * Input: n = 16
 * Output: true
 * Explanation: 2^4 = 16
 * 
 * Example 3:
 * Input: n = 3
 * Output: false
 * 
 * Example 4:
 * Input: n = -2
 * Output: false
 * 
 * Follow-up: Could you solve it without loops/recursion?
 */
public class Problem01_PowerOfTwo {
    
    /**
     * Check if n is a power of two.
     * 
     * @param n integer to check
     * @return true if n is a power of two, false otherwise
     */
    public boolean isPowerOfTwo(int n) {
        // Hint: Consider bit manipulation. A power of two has only one bit set.
        // Hint: Think about what happens when you subtract 1 from a power of two.
        // Time complexity: O(1)
        // Space complexity: O(1)
        
        if(n <= 0) return false;
        return (n & (n - 1)) == 0;
       
    }
}

