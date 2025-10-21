package com.algorithms.week06_trees_bst;

/**
 * Problem 1: Maximum Depth of Binary Tree
 * 
 * LeetCode #104 - Easy
 * 
 * Given the root of a binary tree, return its maximum depth.
 * 
 * A binary tree's maximum depth is the number of nodes along the longest path 
 * from the root node down to the farthest leaf node.
 * 
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 10^4].
 * - -100 <= Node.val <= 100
 * 
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * 
 * Example 2:
 * Input: root = [1,null,2]
 * Output: 2
 * 
 * Example 3:
 * Input: root = []
 * Output: 0
 * 
 * Follow-up: Can you solve it both recursively and iteratively?
 */
public class Problem01_MaximumDepthOfBinaryTree {
    
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
     * Find the maximum depth of the binary tree.
     * 
     * @param root root of the binary tree
     * @return maximum depth
     */
    public int maxDepth(TreeNode root) {
        // TODO: Implement your solution here
        // Hint: Use DFS recursion - max depth = 1 + max(left depth, right depth)
        // Time complexity: O(n)
        // Space complexity: O(h) where h is height of tree
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
