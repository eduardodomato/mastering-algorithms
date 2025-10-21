package com.algorithms.week08_graphs;

/**
 * Problem 3: Network Delay Time
 * 
 * LeetCode #743 - Medium
 * 
 * You are given a network of n nodes, labeled from 1 to n. You are also given times, 
 * a list of travel times as directed edges times[i] = (ui, vi, wi), where ui is the 
 * source node, vi is the target node, and wi is the time it takes for a signal to 
 * travel from source to target.
 * 
 * We will send a signal from a given node k. Return the minimum time it takes for the 
 * signal to reach all nodes. If it is impossible for the signal to reach all nodes, 
 * return -1.
 * 
 * Constraints:
 * - 1 <= k <= n <= 100
 * - 1 <= times.length <= 6000
 * - times[i].length == 3
 * - 1 <= ui, vi <= n
 * - ui != vi
 * - 0 <= wi <= 100
 * - All the pairs (ui, vi) are unique. (i.e., no multiple edges.)
 * 
 * Example 1:
 * Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
 * Output: 2
 * 
 * Example 2:
 * Input: times = [[1,2,1]], n = 2, k = 1
 * Output: 1
 * 
 * Example 3:
 * Input: times = [[1,2,1]], n = 2, k = 2
 * Output: -1
 * 
 * Follow-up: Can you solve it using Dijkstra's algorithm?
 */
public class Problem03_NetworkDelayTime {
    
    /**
     * Find minimum time for signal to reach all nodes.
     * 
     * @param times array of [source, target, time] edges
     * @param n number of nodes
     * @param k source node
     * @return minimum time to reach all nodes, or -1 if impossible
     */
    public int networkDelayTime(int[][] times, int n, int k) {
        // TODO: Implement your solution here
        // Hint: Use Dijkstra's algorithm to find shortest paths from source
        // Time complexity: O(E log V) with priority queue
        // Space complexity: O(V + E)
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
