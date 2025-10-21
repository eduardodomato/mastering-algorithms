package com.algorithms.week04_linkedlists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 2: Linked List Cycle
 */
class Problem02_LinkedListCycleTest {
    
    private Problem02_LinkedListCycle solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem02_LinkedListCycle();
    }
    
    @Test
    void testHasCycle_Example1() {
        // Create list: 3->2->0->-4->2 (cycle)
        var head = new Problem02_LinkedListCycle.ListNode(3);
        var node2 = new Problem02_LinkedListCycle.ListNode(2);
        var node0 = new Problem02_LinkedListCycle.ListNode(0);
        var node4 = new Problem02_LinkedListCycle.ListNode(-4);
        
        head.next = node2;
        node2.next = node0;
        node0.next = node4;
        node4.next = node2; // Create cycle
        
        assertTrue(solution.hasCycle(head));
    }
    
    @Test
    void testHasCycle_Example2() {
        // Create list: 1->2->1 (cycle)
        var head = new Problem02_LinkedListCycle.ListNode(1);
        var node2 = new Problem02_LinkedListCycle.ListNode(2);
        
        head.next = node2;
        node2.next = head; // Create cycle
        
        assertTrue(solution.hasCycle(head));
    }
    
    @Test
    void testHasCycle_Example3() {
        // Create list: 1 (no cycle)
        var head = new Problem02_LinkedListCycle.ListNode(1);
        
        assertFalse(solution.hasCycle(head));
    }
    
    @Test
    void testHasCycle_NoCycle() {
        // Create list: 1->2->3->4 (no cycle)
        var head = new Problem02_LinkedListCycle.ListNode(1);
        head.next = new Problem02_LinkedListCycle.ListNode(2);
        head.next.next = new Problem02_LinkedListCycle.ListNode(3);
        head.next.next.next = new Problem02_LinkedListCycle.ListNode(4);
        
        assertFalse(solution.hasCycle(head));
    }
    
    @Test
    void testHasCycle_EmptyList() {
        assertFalse(solution.hasCycle(null));
    }
}
