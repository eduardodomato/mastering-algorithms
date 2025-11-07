package com.algorithms.week04_linkedlists;

import java.util.Objects;

/**
 * Problem 3: Merge Two Sorted Lists
 *
 * LeetCode #21 - Easy
 *
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
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
 * Constraints:
 * - The number of nodes in both lists is in the range [0, 50].
 * - -100 <= Node.val <= 100
 * - Both list1 and list2 are sorted in non-decreasing order.
 */
public class Problem03_MergeTwoSortedLists {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Merge two sorted linked lists into a single sorted list.
     *
     * @param list1 the head of the first sorted list
     * @param list2 the head of the second sorted list
     * @return the head of the merged sorted list
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // TODO: Merge the lists by choosing the smaller head node at each step
        // Hint: Use a dummy head node to simplify pointer manipulation
        return (Objects.nonNull(list1)) ? list1 : list2;
    }
}
