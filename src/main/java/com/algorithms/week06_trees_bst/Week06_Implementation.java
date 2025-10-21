package com.algorithms.week06_trees_bst;

import java.util.*;

/**
 * Implementation examples for Week 6: Trees & Binary Search Trees
 * 
 * This class contains core implementations and utility methods for tree operations.
 * Study these implementations to understand the fundamental patterns before solving the practice problems.
 */
public class Implementation {
    
    /**
     * Definition for a binary tree node
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
     * Find maximum depth of binary tree using DFS
     * 
     * @param root root of the binary tree
     * @return maximum depth
     */
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        return Math.max(leftDepth, rightDepth) + 1;
    }
    
    /**
     * Validate Binary Search Tree using inorder traversal
     * 
     * @param root root of the binary tree
     * @return true if valid BST, false otherwise
     */
    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private static boolean isValidBST(TreeNode node, long min, long max) {
        if (node == null) return true;
        
        if (node.val <= min || node.val >= max) return false;
        
        return isValidBST(node.left, min, node.val) && 
               isValidBST(node.right, node.val, max);
    }
    
    /**
     * Construct Binary Tree from Preorder and Inorder Traversal
     * 
     * @param preorder preorder traversal array
     * @param inorder inorder traversal array
     * @return root of constructed binary tree
     */
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        
        return buildTreeHelper(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1, inorderMap);
    }
    
    private static TreeNode buildTreeHelper(int[] preorder, int[] inorder, 
                                          int preStart, int preEnd, int inStart, int inEnd,
                                          Map<Integer, Integer> inorderMap) {
        if (preStart > preEnd || inStart > inEnd) return null;
        
        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = inorderMap.get(root.val);
        int leftSize = rootIndex - inStart;
        
        root.left = buildTreeHelper(preorder, inorder, preStart + 1, preStart + leftSize, 
                                   inStart, rootIndex - 1, inorderMap);
        root.right = buildTreeHelper(preorder, inorder, preStart + leftSize + 1, preEnd, 
                                    rootIndex + 1, inEnd, inorderMap);
        
        return root;
    }
    
    /**
     * Inorder traversal of binary tree
     * 
     * @param root root of the binary tree
     * @return list of values in inorder
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }
    
    private static void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        
        inorderHelper(node.left, result);
        result.add(node.val);
        inorderHelper(node.right, result);
    }
    
    /**
     * Preorder traversal of binary tree
     * 
     * @param root root of the binary tree
     * @return list of values in preorder
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }
    
    private static void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        
        result.add(node.val);
        preorderHelper(node.left, result);
        preorderHelper(node.right, result);
    }
    
    /**
     * Postorder traversal of binary tree
     * 
     * @param root root of the binary tree
     * @return list of values in postorder
     */
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }
    
    private static void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        
        postorderHelper(node.left, result);
        postorderHelper(node.right, result);
        result.add(node.val);
    }
    
    /**
     * Search in Binary Search Tree
     * 
     * @param root root of the BST
     * @param val value to search for
     * @return node with the value, or null if not found
     */
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        
        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
    
    /**
     * Insert into Binary Search Tree
     * 
     * @param root root of the BST
     * @param val value to insert
     * @return root of the modified BST
     */
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        
        return root;
    }
    
    /**
     * Check if two trees are identical
     * 
     * @param p first tree root
     * @param q second tree root
     * @return true if identical, false otherwise
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    
    /**
     * Check if tree is symmetric
     * 
     * @param root root of the binary tree
     * @return true if symmetric, false otherwise
     */
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetricHelper(root.left, root.right);
    }
    
    private static boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        
        return left.val == right.val && 
               isSymmetricHelper(left.left, right.right) && 
               isSymmetricHelper(left.right, right.left);
    }
}
