package com.algorithms.week07_heaps_priorityqueues;

import java.util.*;

/**
 * Implementation examples for Week 7: Heaps & Priority Queues
 * 
 * This class contains core implementations and utility methods for heap and priority queue operations.
 * Study these implementations to understand the fundamental patterns before solving the practice problems.
 */
public class Week07_Implementation {
    
    /**
     * Find kth largest element using min heap
     * 
     * @param nums array of integers
     * @param k position of largest element to find
     * @return kth largest element
     */
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        return minHeap.peek();
    }
    
    /**
     * Merge k sorted linked lists using min heap
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    /**
     * Merge k sorted linked lists
     * 
     * @param lists array of sorted linked lists
     * @return head of merged sorted linked list
     */
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        
        // Add first node of each list to heap
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            current.next = node;
            current = current.next;
            
            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }
        
        return dummy.next;
    }
    
    /**
     * Find Median from Data Stream using two heaps
     */
    public static class MedianFinder {
        private PriorityQueue<Integer> maxHeap; // smaller half
        private PriorityQueue<Integer> minHeap; // larger half
        
        public MedianFinder() {
            maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            minHeap = new PriorityQueue<>();
        }
        
        public void addNum(int num) {
            if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }
            
            // Balance heaps
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.offer(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }
        }
        
        public double findMedian() {
            if (maxHeap.size() == minHeap.size()) {
                return (maxHeap.peek() + minHeap.peek()) / 2.0;
            } else {
                return maxHeap.peek();
            }
        }
    }
    
    /**
     * Top K Frequent Elements using heap
     * 
     * @param nums array of integers
     * @param k number of most frequent elements
     * @return array of k most frequent elements
     */
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            maxHeap.offer(entry);
        }
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }
        
        return result;
    }
    
    /**
     * Implement Min Heap
     */
    public static class MinHeap {
        private List<Integer> heap;
        
        public MinHeap() {
            heap = new ArrayList<>();
        }
        
        public void insert(int value) {
            heap.add(value);
            heapifyUp(heap.size() - 1);
        }
        
        public int extractMin() {
            if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");
            
            int min = heap.get(0);
            heap.set(0, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);
            
            if (!heap.isEmpty()) {
                heapifyDown(0);
            }
            
            return min;
        }
        
        public int peek() {
            if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");
            return heap.get(0);
        }
        
        public boolean isEmpty() {
            return heap.isEmpty();
        }
        
        public int size() {
            return heap.size();
        }
        
        private void heapifyUp(int index) {
            while (index > 0) {
                int parentIndex = (index - 1) / 2;
                if (heap.get(index) >= heap.get(parentIndex)) break;
                
                swap(index, parentIndex);
                index = parentIndex;
            }
        }
        
        private void heapifyDown(int index) {
            while (true) {
                int leftChild = 2 * index + 1;
                int rightChild = 2 * index + 2;
                int smallest = index;
                
                if (leftChild < heap.size() && heap.get(leftChild) < heap.get(smallest)) {
                    smallest = leftChild;
                }
                
                if (rightChild < heap.size() && heap.get(rightChild) < heap.get(smallest)) {
                    smallest = rightChild;
                }
                
                if (smallest == index) break;
                
                swap(index, smallest);
                index = smallest;
            }
        }
        
        private void swap(int i, int j) {
            int temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }
    }
    
    /**
     * Find K Closest Points to Origin using heap
     * 
     * @param points array of [x, y] coordinates
     * @param k number of closest points
     * @return array of k closest points
     */
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> 
            (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        
        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }
        
        return result;
    }
    
    /**
     * Connect Sticks with Minimum Cost using heap
     * 
     * @param sticks array of stick lengths
     * @return minimum cost to connect all sticks
     */
    public static int connectSticks(int[] sticks) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int stick : sticks) {
            minHeap.offer(stick);
        }
        
        int totalCost = 0;
        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            int cost = first + second;
            totalCost += cost;
            minHeap.offer(cost);
        }
        
        return totalCost;
    }
}
