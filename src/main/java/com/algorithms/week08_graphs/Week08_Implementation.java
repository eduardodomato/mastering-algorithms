package com.algorithms.week08_graphs;

import java.util.*;

/**
 * Implementation examples for Week 8: Graphs
 * 
 * This class contains core implementations and utility methods for graph operations.
 * Study these implementations to understand the fundamental patterns before solving the practice problems.
 */
public class Week08_Implementation {
    
    /**
     * Number of Islands using DFS
     * 
     * @param grid 2D binary grid representing land and water
     * @return number of islands
     */
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        int islandCount = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    islandCount++;
                }
            }
        }
        
        return islandCount;
    }
    
    private static void dfs(char[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] != '1') {
            return;
        }
        
        grid[row][col] = '0'; // Mark as visited
        
        // Visit all 4 directions
        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
    
    /**
     * Course Schedule using Topological Sort (DFS)
     * 
     * @param numCourses total number of courses
     * @param prerequisites array of course dependencies
     * @return true if all courses can be finished, false otherwise
     */
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] prereq : prerequisites) {
            graph.get(prereq[1]).add(prereq[0]);
        }
        
        int[] visited = new int[numCourses]; // 0: unvisited, 1: visiting, 2: visited
        
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (hasCycle(graph, i, visited)) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private static boolean hasCycle(List<List<Integer>> graph, int course, int[] visited) {
        visited[course] = 1; // Mark as visiting
        
        for (int neighbor : graph.get(course)) {
            if (visited[neighbor] == 1) return true; // Cycle detected
            if (visited[neighbor] == 0 && hasCycle(graph, neighbor, visited)) {
                return true;
            }
        }
        
        visited[course] = 2; // Mark as visited
        return false;
    }
    
    /**
     * Network Delay Time using Dijkstra's Algorithm
     * 
     * @param times array of [source, target, time] edges
     * @param n number of nodes
     * @param k source node
     * @return minimum time to reach all nodes, or -1 if impossible
     */
    public static int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] time : times) {
            graph.computeIfAbsent(time[0], x -> new ArrayList<>()).add(new int[]{time[1], time[2]});
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{k, 0});
        
        Map<Integer, Integer> dist = new HashMap<>();
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int time = curr[1];
            
            if (dist.containsKey(node)) continue;
            dist.put(node, time);
            
            if (graph.containsKey(node)) {
                for (int[] edge : graph.get(node)) {
                    int neighbor = edge[0];
                    int weight = edge[1];
                    if (!dist.containsKey(neighbor)) {
                        pq.offer(new int[]{neighbor, time + weight});
                    }
                }
            }
        }
        
        if (dist.size() != n) return -1;
        
        int maxTime = 0;
        for (int time : dist.values()) {
            maxTime = Math.max(maxTime, time);
        }
        
        return maxTime;
    }
    
    /**
     * BFS implementation for graph traversal
     * 
     * @param graph adjacency list representation
     * @param start starting node
     * @return list of nodes visited in BFS order
     */
    public static List<Integer> bfs(List<List<Integer>> graph, int start) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);
            
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        
        return result;
    }
    
    /**
     * DFS implementation for graph traversal
     * 
     * @param graph adjacency list representation
     * @param start starting node
     * @return list of nodes visited in DFS order
     */
    public static List<Integer> dfs(List<List<Integer>> graph, int start) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[graph.size()];
        dfsHelper(graph, start, visited, result);
        return result;
    }
    
    private static void dfsHelper(List<List<Integer>> graph, int node, boolean[] visited, List<Integer> result) {
        visited[node] = true;
        result.add(node);
        
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfsHelper(graph, neighbor, visited, result);
            }
        }
    }
    
    /**
     * Find shortest path using BFS (unweighted graph)
     * 
     * @param graph adjacency list representation
     * @param start starting node
     * @param end target node
     * @return shortest path as list of nodes, or empty list if no path
     */
    public static List<Integer> shortestPath(List<List<Integer>> graph, int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];
        int[] parent = new int[graph.size()];
        Arrays.fill(parent, -1);
        
        queue.offer(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            
            if (node == end) {
                return reconstructPath(parent, start, end);
            }
            
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = node;
                    queue.offer(neighbor);
                }
            }
        }
        
        return new ArrayList<>(); // No path found
    }
    
    private static List<Integer> reconstructPath(int[] parent, int start, int end) {
        List<Integer> path = new ArrayList<>();
        int current = end;
        
        while (current != -1) {
            path.add(current);
            current = parent[current];
        }
        
        Collections.reverse(path);
        return path;
    }
    
    /**
     * Detect cycle in directed graph using DFS
     * 
     * @param graph adjacency list representation
     * @return true if cycle exists, false otherwise
     */
    public static boolean hasCycle(List<List<Integer>> graph) {
        int n = graph.size();
        int[] visited = new int[n]; // 0: unvisited, 1: visiting, 2: visited
        
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                if (hasCycleDFS(graph, i, visited)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private static boolean hasCycleDFS(List<List<Integer>> graph, int node, int[] visited) {
        visited[node] = 1; // Mark as visiting
        
        for (int neighbor : graph.get(node)) {
            if (visited[neighbor] == 1) return true; // Back edge found
            if (visited[neighbor] == 0 && hasCycleDFS(graph, neighbor, visited)) {
                return true;
            }
        }
        
        visited[node] = 2; // Mark as visited
        return false;
    }
}
