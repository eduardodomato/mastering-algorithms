package com.algorithms.week02_math_bits;

/**
 * Problem 3: Count Primes
 * 
 * LeetCode #204 - Medium
 * 
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 * 
 * A prime number is a natural number greater than 1 that has no positive divisors other 
 * than 1 and itself.
 * 
 * Constraints:
 * - 0 <= n <= 5 * 10^6
 * 
 * Example 1:
 * Input: n = 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * 
 * Example 2:
 * Input: n = 0
 * Output: 0
 * 
 * Example 3:
 * Input: n = 1
 * Output: 0
 * 
 * Example 4:
 * Input: n = 2
 * Output: 0
 * 
 * Example 5:
 * Input: n = 3
 * Output: 1
 * 
 * Follow-up: Can you implement the Sieve of Eratosthenes algorithm?
 */
public class Problem03_CountPrimes {
    
    /**
     * Count the number of prime numbers less than n.
     * 
     * @param n upper limit (exclusive)
     * @return count of prime numbers less than n
     */
    public int countPrimes(int n) {
        // Hint: Use Sieve of Eratosthenes algorithm for efficiency
        // Hint: Create a boolean array to mark non-primes
        // Time complexity: O(n log log n)
        // Space complexity: O(n)
        
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}

