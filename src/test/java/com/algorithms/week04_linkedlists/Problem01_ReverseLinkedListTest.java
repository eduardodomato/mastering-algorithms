package com.algorithms.week04_linkedlists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Problem01_ReverseLinkedListTest {

    private Problem01_ReverseLinkedList.ListNode buildList(int... values) {
        Problem01_ReverseLinkedList.ListNode dummy = new Problem01_ReverseLinkedList.ListNode(0);
        Problem01_ReverseLinkedList.ListNode current = dummy;
        for (int value : values) {
            current.next = new Problem01_ReverseLinkedList.ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    private int[] toArray(Problem01_ReverseLinkedList.ListNode head) {
        int length = 0;
        Problem01_ReverseLinkedList.ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int[] result = new int[length];
        temp = head;
        int index = 0;
        while (temp != null) {
            result[index++] = temp.val;
            temp = temp.next;
        }

        return result;
    }

    @Test
    void reverseList_multipleNodes() {
        Problem01_ReverseLinkedList solution = new Problem01_ReverseLinkedList();
        Problem01_ReverseLinkedList.ListNode head = buildList(1, 2, 3, 4, 5);

        Problem01_ReverseLinkedList.ListNode reversed = solution.reverseList(head);

        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, toArray(reversed));
    }

    @Test
    void reverseList_twoNodes() {
        Problem01_ReverseLinkedList solution = new Problem01_ReverseLinkedList();
        Problem01_ReverseLinkedList.ListNode head = buildList(1, 2);

        Problem01_ReverseLinkedList.ListNode reversed = solution.reverseList(head);

        assertArrayEquals(new int[]{2, 1}, toArray(reversed));
    }

    @Test
    void reverseList_singleNode() {
        Problem01_ReverseLinkedList solution = new Problem01_ReverseLinkedList();
        Problem01_ReverseLinkedList.ListNode head = buildList(42);

        Problem01_ReverseLinkedList.ListNode reversed = solution.reverseList(head);

        assertArrayEquals(new int[]{42}, toArray(reversed));
    }

    @Test
    void reverseList_emptyList() {
        Problem01_ReverseLinkedList solution = new Problem01_ReverseLinkedList();

        Problem01_ReverseLinkedList.ListNode reversed = solution.reverseList(null);

        assertNull(reversed);
    }
}
