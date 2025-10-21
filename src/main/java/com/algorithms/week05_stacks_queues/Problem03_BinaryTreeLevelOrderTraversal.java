package com.algorithms.week05_stacks_queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Problem 3: Binary Tree Level Order Traversal
 * 
 * LeetCode #102 - Medium
 * 
 * Given the root of a binary tree, return the level order traversal of its nodes' values. 
 * (i.e., from left to right, level by level).
 * 
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 2000].
 * - -1000 <= Node.val <= 1000
 * 
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[9,20],[15,7]]
 * 
 * Example 2:
 * Input: root = [1]
 * Output: [[1]]
 * 
 * Example 3:
 * Input: root = []
 * Output: []
 * 
 * Follow-up: Can you solve it recursively?
 */
public class Problem03_BinaryTreeLevelOrderTraversal {
    
    /**
     * Definition for a binary tree node.
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    /**
     * Perform level order traversal of binary tree.
     * 
     * @param root root of the binary tree
     * @return list of lists containing values level by level
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // TODO: Implement your solution here
        // Hint: Use BFS with queue to process level by level
        // Time complexity: O(n)
        // Space complexity: O(w) where w is maximum width of tree
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
