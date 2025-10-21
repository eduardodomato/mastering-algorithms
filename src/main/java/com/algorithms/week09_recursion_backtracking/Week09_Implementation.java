package com.algorithms.week09_recursion_backtracking;

import java.util.*;

/**
 * Implementation examples for Week 9: Recursion & Backtracking
 * 
 * This class contains core implementations and utility methods for recursive and backtracking algorithms.
 * Study these implementations to understand the fundamental patterns before solving the practice problems.
 */
public class Week09_Implementation {
    
    /**
     * Generate all combinations of well-formed parentheses using backtracking
     * 
     * @param n number of pairs of parentheses
     * @return list of all valid combinations
     */
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
    
    /**
     * Solve N-Queens problem using backtracking
     * 
     * @param n size of the chessboard
     * @return list of all distinct solutions
     */
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queens = new int[n]; // queens[i] = column position of queen in row i
        solveNQueensHelper(result, queens, 0, n);
        return result;
    }
    
    private static void solveNQueensHelper(List<List<String>> result, int[] queens, int row, int n) {
        if (row == n) {
            result.add(buildBoard(queens, n));
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (isValid(queens, row, col)) {
                queens[row] = col;
                solveNQueensHelper(result, queens, row + 1, n);
            }
        }
    }
    
    private static boolean isValid(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(queens[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
    
    private static List<String> buildBoard(int[] queens, int n) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                row.append(queens[i] == j ? 'Q' : '.');
            }
            board.add(row.toString());
        }
        return board;
    }
    
    /**
     * Word Search using DFS backtracking
     * 
     * @param board 2D character grid
     * @param word word to search for
     * @return true if word exists, false otherwise
     */
    public static boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null || word.isEmpty()) {
            return false;
        }
        
        int rows = board.length;
        int cols = board[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private static boolean dfs(char[][] board, String word, int row, int col, int index) {
        if (index == word.length()) return true;
        
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length ||
            board[row][col] != word.charAt(index)) {
            return false;
        }
        
        char temp = board[row][col];
        board[row][col] = '#'; // Mark as visited
        
        boolean found = dfs(board, word, row + 1, col, index + 1) ||
                       dfs(board, word, row - 1, col, index + 1) ||
                       dfs(board, word, row, col + 1, index + 1) ||
                       dfs(board, word, row, col - 1, index + 1);
        
        board[row][col] = temp; // Restore
        return found;
    }
    
    /**
     * Generate all subsets using backtracking
     * 
     * @param nums array of integers
     * @return list of all possible subsets
     */
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrackSubsets(result, new ArrayList<>(), nums, 0);
        return result;
    }
    
    private static void backtrackSubsets(List<List<Integer>> result, List<Integer> current, int[] nums, int start) {
        result.add(new ArrayList<>(current));
        
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrackSubsets(result, current, nums, i + 1);
            current.remove(current.size() - 1);
        }
    }
    
    /**
     * Generate all permutations using backtracking
     * 
     * @param nums array of integers
     * @return list of all possible permutations
     */
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrackPermute(result, new ArrayList<>(), nums);
        return result;
    }
    
    private static void backtrackPermute(List<List<Integer>> result, List<Integer> current, int[] nums) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int num : nums) {
            if (!current.contains(num)) {
                current.add(num);
                backtrackPermute(result, current, nums);
                current.remove(current.size() - 1);
            }
        }
    }
    
    /**
     * Combination Sum using backtracking
     * 
     * @param candidates array of candidate numbers
     * @param target target sum
     * @return list of all unique combinations that sum to target
     */
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrackCombinationSum(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
    
    private static void backtrackCombinationSum(List<List<Integer>> result, List<Integer> current, 
                                              int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) break;
            
            current.add(candidates[i]);
            backtrackCombinationSum(result, current, candidates, target - candidates[i], i);
            current.remove(current.size() - 1);
        }
    }
    
    /**
     * Sudoku Solver using backtracking
     * 
     * @param board 9x9 Sudoku board
     * @return true if solvable, false otherwise
     */
    public static boolean solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValidSudoku(board, i, j, c)) {
                            board[i][j] = c;
                            if (solveSudoku(board)) {
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    private static boolean isValidSudoku(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c) return false;
            if (board[row][i] == c) return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
        }
        return true;
    }
    
    /**
     * Tower of Hanoi using recursion
     * 
     * @param n number of disks
     * @param source source rod
     * @param destination destination rod
     * @param auxiliary auxiliary rod
     */
    public static void towerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        
        towerOfHanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, auxiliary, destination, source);
    }
}
