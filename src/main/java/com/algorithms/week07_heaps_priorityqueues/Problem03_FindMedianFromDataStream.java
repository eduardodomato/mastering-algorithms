package com.algorithms.week07_heaps_priorityqueues;

/**
 * Problem 3: Find Median from Data Stream
 * 
 * LeetCode #295 - Hard
 * 
 * The median is the middle value in an ordered integer list. If the size of the list is even, 
 * there is no middle value, and the median is the mean of the two middle values.
 * 
 * For example, for arr = [2,3,4], the median is 3.
 * For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
 * 
 * Implement the MedianFinder class:
 * - MedianFinder() initializes the MedianFinder object.
 * - void addNum(int num) adds the integer num from the data stream to the data structure.
 * - double findMedian() returns the median of all elements so far.
 * 
 * Constraints:
 * - -10^5 <= num <= 10^5
 * - There will be at least one element in the data structure before calling findMedian.
 * - At most 5 * 10^4 calls will be made to addNum and findMedian.
 * 
 * Example 1:
 * Input: ["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
 * [[], [1], [2], [], [3], []]
 * Output: [null, null, null, 1.5, null, 2.0]
 * 
 * Follow-up: If all integer numbers from the stream are in the range [0, 100], how would you optimize your solution?
 */
public class Problem03_FindMedianFromDataStream {
    
    /**
     * Initialize the MedianFinder object.
     */
    public Problem03_FindMedianFromDataStream() {
        // TODO: Initialize two heaps - max heap for smaller half, min heap for larger half
    }
    
    /**
     * Add a number to the data structure.
     * 
     * @param num number to add
     */
    public void addNum(int num) {
        // TODO: Implement your solution here
        // Hint: Maintain two heaps with equal size (or max heap has one more)
        // Time complexity: O(log n)
        // Space complexity: O(n)
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
    
    /**
     * Find the median of all elements.
     * 
     * @return median value
     */
    public double findMedian() {
        // TODO: Implement your solution here
        // Hint: If even number of elements, return average of two middle elements
        // If odd, return the middle element from the larger heap
        // Time complexity: O(1)
        // Space complexity: O(1)
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
