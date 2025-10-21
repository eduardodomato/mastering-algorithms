package com.algorithms.week07_heaps_priorityqueues;

import java.util.List;

/**
 * Problem 2: Merge k Sorted Lists
 * 
 * LeetCode #23 - Hard
 * 
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * 
 * Merge all the linked-lists into one sorted linked-list and return it.
 * 
 * Constraints:
 * - k == lists.length
 * - 0 <= k <= 10^4
 * - 0 <= lists[i].length <= 500
 * - -10^4 <= lists[i][j] <= 10^4
 * - lists[i] is sorted in ascending order.
 * - The sum of lists[i].length will not exceed 10^4.
 * 
 * Example 1:
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * merging them into one sorted list:
 * 1->1->2->3->4->4->5->6
 * 
 * Example 2:
 * Input: lists = []
 * Output: []
 * 
 * Example 3:
 * Input: lists = [[]]
 * Output: []
 * 
 * Follow-up: Can you solve it in O(n log k) time complexity?
 */
public class Problem02_MergeKSortedLists {
    
    /**
     * Definition for singly-linked list node.
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    /**
     * Merge k sorted linked lists.
     * 
     * @param lists array of sorted linked lists
     * @return head of merged sorted linked list
     */
    public ListNode mergeKLists(ListNode[] lists) {
        // TODO: Implement your solution here
        // Hint: Use min heap to always get the smallest element
        // Time complexity: O(n log k) where n is total number of nodes
        // Space complexity: O(k)
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
