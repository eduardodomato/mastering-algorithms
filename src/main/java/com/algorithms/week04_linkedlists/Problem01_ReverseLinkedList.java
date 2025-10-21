package com.algorithms.week04_linkedlists;

/**
 * Problem 1: Reverse Linked List
 * 
 * LeetCode #206 - Easy
 * 
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * 
 * Constraints:
 * - The number of nodes in the list is the range [0, 5000].
 * - -5000 <= Node.val <= 5000
 * 
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * 
 * Example 2:
 * Input: head = [1,2]
 * Output: [2,1]
 * 
 * Example 3:
 * Input: head = []
 * Output: []
 * 
 * Follow-up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class Problem01_ReverseLinkedList {
    
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
     * Reverse the linked list iteratively.
     * 
     * @param head head of the linked list
     * @return head of the reversed list
     */
    public ListNode reverseList(ListNode head) {
        // TODO: Implement your solution here
        // Hint: Use three pointers: prev, current, next
        // Time complexity: O(n)
        // Space complexity: O(1)
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
