package com.algorithms.week04_linkedlists;

/**
 * Problem 3: Merge Two Sorted Lists
 * 
 * LeetCode #21 - Easy
 * 
 * You are given the heads of two sorted linked lists list1 and list2.
 * 
 * Merge the two lists in a one sorted list. The list should be made by splicing together 
 * the nodes of the first two lists.
 * 
 * Return the head of the merged linked list.
 * 
 * Constraints:
 * - The number of nodes in both lists is in the range [0, 50].
 * - -100 <= Node.val <= 100
 * - Both list1 and list2 are sorted in non-decreasing order.
 * 
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * 
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 * 
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 * 
 * Follow-up: Can you solve it recursively?
 */
public class Problem03_MergeTwoSortedLists {
    
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
     * Merge two sorted linked lists.
     * 
     * @param list1 head of first sorted list
     * @param list2 head of second sorted list
     * @return head of merged sorted list
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // TODO: Implement your solution here
        // Hint: Use dummy node and compare values from both lists
        // Time complexity: O(n + m)
        // Space complexity: O(1)
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
