package com.algorithms.week04_linkedlists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Problem02_LinkedListCycleTest {

    private Problem02_LinkedListCycle.ListNode buildCyclicList(int[] values, int pos) {
        Problem02_LinkedListCycle.ListNode dummy = new Problem02_LinkedListCycle.ListNode(0);
        Problem02_LinkedListCycle.ListNode current = dummy;
        Problem02_LinkedListCycle.ListNode cycleNode = null;

        for (int i = 0; i < values.length; i++) {
            current.next = new Problem02_LinkedListCycle.ListNode(values[i]);
            current = current.next;
            if (i == pos) {
                cycleNode = current;
            }
        }

        if (cycleNode != null) {
            current.next = cycleNode;
        }

        return dummy.next;
    }

    @Test
    void hasCycle_withCycle() {
        Problem02_LinkedListCycle solution = new Problem02_LinkedListCycle();
        Problem02_LinkedListCycle.ListNode head = buildCyclicList(new int[]{3, 2, 0, -4}, 1);

        assertTrue(solution.hasCycle(head));
    }

    @Test
    void hasCycle_twoNodesCycle() {
        Problem02_LinkedListCycle solution = new Problem02_LinkedListCycle();
        Problem02_LinkedListCycle.ListNode head = buildCyclicList(new int[]{1, 2}, 0);

        assertTrue(solution.hasCycle(head));
    }

    @Test
    void hasCycle_noCycle() {
        Problem02_LinkedListCycle solution = new Problem02_LinkedListCycle();
        Problem02_LinkedListCycle.ListNode head = buildCyclicList(new int[]{1}, -1);

        assertFalse(solution.hasCycle(head));
    }

    @Test
    void hasCycle_emptyList() {
        Problem02_LinkedListCycle solution = new Problem02_LinkedListCycle();

        assertFalse(solution.hasCycle(null));
    }
}
