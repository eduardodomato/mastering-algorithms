package com.algorithms.week02_math_bits;

/**
 * Implementation examples for Week 2: Basic Math & Bit Manipulation
 * 
 * This class contains core implementations and utility methods for mathematical operations and bit manipulation.
 * Study these implementations to understand the fundamental patterns before solving the practice problems.
 */
public class Week02_Implementation {
    
    /**
     * Check if a number is power of two using bit manipulation
     * 
     * @param n number to check
     * @return true if n is power of two, false otherwise
     */
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    
    /**
     * Find single number using XOR (for array where every element appears twice except one)
     * 
     * @param nums array where every element appears twice except one
     * @return the single number
     */
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }
    
    /**
     * Count number of set bits (1s) in binary representation
     * 
     * @param n number to count bits for
     * @return number of set bits
     */
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1; // Check if last bit is 1
            n >>= 1; // Right shift by 1
        }
        return count;
    }
    
    /**
     * Get the rightmost set bit
     * 
     * @param n number
     * @return position of rightmost set bit (1-indexed), 0 if no set bits
     */
    public static int getRightmostSetBit(int n) {
        if (n == 0) return 0;
        return (int) (Math.log(n & -n) / Math.log(2)) + 1;
    }
    
    /**
     * Calculate Greatest Common Divisor (GCD) using Euclidean algorithm
     * 
     * @param a first number
     * @param b second number
     * @return GCD of a and b
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    /**
     * Calculate Least Common Multiple (LCM)
     * 
     * @param a first number
     * @param b second number
     * @return LCM of a and b
     */
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
    
    /**
     * Check if a number is prime
     * 
     * @param n number to check
     * @return true if prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Sieve of Eratosthenes - Find all primes up to n
     * 
     * @param n upper limit
     * @return boolean array where true indicates prime number
     */
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        return isPrime;
    }
    
    /**
     * Calculate factorial of a number
     * 
     * @param n number
     * @return factorial of n
     */
    public static long factorial(int n) {
        if (n < 0) return -1; // Invalid input
        if (n <= 1) return 1;
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    /**
     * Calculate power using fast exponentiation
     * 
     * @param base base number
     * @param exponent exponent
     * @return base raised to the power of exponent
     */
    public static long power(int base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent == 1) return base;
        
        long result = 1;
        long currentBase = base;
        
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= currentBase;
            }
            currentBase *= currentBase;
            exponent /= 2;
        }
        
        return result;
    }
    
    /**
     * Reverse bits of a 32-bit integer
     * 
     * @param n 32-bit integer
     * @return integer with reversed bits
     */
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        return result;
    }
}
