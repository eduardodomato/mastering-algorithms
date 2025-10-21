package com.algorithms.week12_advanced_sorting_searching;

/**
 * Problem 3: Kth Smallest Element in a Sorted Matrix
 * 
 * LeetCode #378 - Medium
 * 
 * Given an n x n matrix where each of the rows and columns is sorted in ascending order, 
 * return the kth smallest element in the matrix.
 * 
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 * 
 * Constraints:
 * - n == matrix.length == matrix[i].length
 * - 1 <= n <= 300
 * - -10^9 <= matrix[i][j] <= 10^9
 * - All rows and columns of matrix are guaranteed to be sorted in non-decreasing order.
 * - 1 <= k <= n^2
 * 
 * Example 1:
 * Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
 * Output: 13
 * Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13
 * 
 * Example 2:
 * Input: matrix = [[-5]], k = 1
 * Output: -5
 * 
 * Follow-up: Could you solve it in O(n) time complexity?
 */
public class Problem03_KthSmallestElementInSortedMatrix {
    
    /**
     * Find the kth smallest element in sorted matrix.
     * 
     * @param matrix sorted n x n matrix
     * @param k position of element to find
     * @return kth smallest element
     */
    public int kthSmallest(int[][] matrix, int k) {
        // TODO: Implement your solution here
        // Hint: Use binary search on answer - check if mid is the kth smallest
        // Time complexity: O(n * log(max - min))
        // Space complexity: O(1)
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
