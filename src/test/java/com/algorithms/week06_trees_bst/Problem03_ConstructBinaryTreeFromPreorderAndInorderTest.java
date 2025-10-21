package com.algorithms.week06_trees_bst;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 3: Construct Binary Tree from Preorder and Inorder Traversal
 */
class Problem03_ConstructBinaryTreeFromPreorderAndInorderTest {
    
    private Problem03_ConstructBinaryTreeFromPreorderAndInorder solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem03_ConstructBinaryTreeFromPreorderAndInorder();
    }
    
    @Test
    void testBuildTree_Example1() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        
        var result = solution.buildTree(preorder, inorder);
        
        assertNotNull(result);
        assertEquals(3, result.val);
        assertEquals(9, result.left.val);
        assertEquals(20, result.right.val);
        assertEquals(15, result.right.left.val);
        assertEquals(7, result.right.right.val);
    }
    
    @Test
    void testBuildTree_Example2() {
        int[] preorder = {-1};
        int[] inorder = {-1};
        
        var result = solution.buildTree(preorder, inorder);
        
        assertNotNull(result);
        assertEquals(-1, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }
    
    @Test
    void testBuildTree_SingleNode() {
        int[] preorder = {1};
        int[] inorder = {1};
        
        var result = solution.buildTree(preorder, inorder);
        
        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }
}
