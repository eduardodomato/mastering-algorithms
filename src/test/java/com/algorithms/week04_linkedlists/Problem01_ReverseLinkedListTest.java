package com.algorithms.week04_linkedlists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 1: Reverse Linked List
 */
class Problem01_ReverseLinkedListTest {
    
    private Problem01_ReverseLinkedList solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem01_ReverseLinkedList();
    }
    
    @Test
    void testReverseList_Example1() {
        // Create list: 1->2->3->4->5
        var head = new Problem01_ReverseLinkedList.ListNode(1);
        head.next = new Problem01_ReverseLinkedList.ListNode(2);
        head.next.next = new Problem01_ReverseLinkedList.ListNode(3);
        head.next.next.next = new Problem01_ReverseLinkedList.ListNode(4);
        head.next.next.next.next = new Problem01_ReverseLinkedList.ListNode(5);
        
        var result = solution.reverseList(head);
        
        // Verify: 5->4->3->2->1
        assertEquals(5, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(1, result.next.next.next.next.val);
        assertNull(result.next.next.next.next.next);
    }
    
    @Test
    void testReverseList_Example2() {
        // Create list: 1->2
        var head = new Problem01_ReverseLinkedList.ListNode(1);
        head.next = new Problem01_ReverseLinkedList.ListNode(2);
        
        var result = solution.reverseList(head);
        
        // Verify: 2->1
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertNull(result.next.next);
    }
    
    @Test
    void testReverseList_EmptyList() {
        var result = solution.reverseList(null);
        assertNull(result);
    }
    
    @Test
    void testReverseList_SingleNode() {
        var head = new Problem01_ReverseLinkedList.ListNode(1);
        var result = solution.reverseList(head);
        
        assertEquals(1, result.val);
        assertNull(result.next);
    }
}
