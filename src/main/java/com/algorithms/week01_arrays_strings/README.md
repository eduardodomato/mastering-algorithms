# Week 1: Arrays & Strings 📊

Welcome to Week 1! This week focuses on fundamental array and string manipulation techniques that form the foundation of many algorithmic problems.

## 🎯 Learning Objectives

By the end of this week, you will be able to:
- Manipulate arrays efficiently using various techniques
- Apply the two pointers technique to solve array problems
- Process strings using common patterns
- Implement sliding window algorithms
- Analyze time and space complexity for array/string operations

## 📚 Core Concepts

### 1. Array Manipulation
- **Access patterns**: Sequential, random access
- **Common operations**: Search, sort, reverse, rotate
- **Time complexity**: O(1) access, O(n) search, O(n log n) sort
- **Space complexity**: O(1) in-place operations

### 2. Two Pointers Technique
- **When to use**: Sorted arrays, palindromes, finding pairs
- **Patterns**: 
  - Opposite ends (left/right)
  - Same direction (fast/slow)
  - Fixed window size
- **Time complexity**: Usually O(n)
- **Space complexity**: O(1)

### 3. String Processing
- **Character manipulation**: ASCII values, case conversion
- **Pattern matching**: Substring search, pattern recognition
- **String building**: StringBuilder vs String concatenation
- **Time complexity**: Varies by operation
- **Space complexity**: O(n) for new strings

### 4. Sliding Window
- **When to use**: Subarray/substring problems with constraints
- **Types**: Fixed size, variable size
- **Key insight**: Maintain window invariants
- **Time complexity**: O(n)
- **Space complexity**: O(1) to O(k) where k is window size

## 🛠️ Java Implementation

### Array Utilities
```java
// Basic array operations
public class ArrayUtils {
    // Two pointers: find two numbers that sum to target
    public static int[] twoSum(int[] nums, int target) {
        // Implementation will be added when you reach this topic
    }
    
    // Sliding window: maximum sum of subarray of size k
    public static int maxSumSubarray(int[] nums, int k) {
        // Implementation will be added when you reach this topic
    }
}
```

### String Utilities
```java
// String manipulation techniques
public class StringUtils {
    // Check if string is palindrome
    public static boolean isPalindrome(String s) {
        // Implementation will be added when you reach this topic
    }
    
    // Find longest substring without repeating characters
    public static int longestUniqueSubstring(String s) {
        // Implementation will be added when you reach this topic
    }
}
```

## 🎯 Practice Problems

### Problem 1: Two Sum (Easy)
**LeetCode #1** - Find two numbers that add up to target

### Problem 2: Maximum Subarray (Medium)  
**LeetCode #53** - Find contiguous subarray with maximum sum

### Problem 3: Longest Substring Without Repeating Characters (Medium)
**LeetCode #3** - Find length of longest substring with unique characters

## 📋 Self-Review Checklist

After solving each problem, check:

### Correctness ✅
- [ ] Handles edge cases (empty arrays, single elements)
- [ ] Returns correct data types
- [ ] Handles boundary conditions properly

### Efficiency ⚡
- [ ] Time complexity is optimal for the problem
- [ ] Space complexity is reasonable
- [ ] No unnecessary nested loops
- [ ] Uses appropriate data structures

### Code Quality 🧹
- [ ] Clear variable names
- [ ] Proper indentation and formatting
- [ ] Comments for complex logic
- [ ] Follows Java naming conventions

### Java Best Practices ☕
- [ ] Uses StringBuilder for string concatenation in loops
- [ ] Proper use of primitive vs wrapper types
- [ ] Appropriate use of Java collections
- [ ] Handles null inputs gracefully

## 🚀 Next Steps

1. **Study the concepts** above
2. **Review the implementation** patterns
3. **Solve the practice problems** in order
4. **Run the JUnit tests** to validate your solutions
5. **Self-review** using the checklist above
6. **Move to Week 2** when you're comfortable with these concepts

---

**Remember**: Master the fundamentals before moving forward. Arrays and strings are the building blocks of most algorithmic problems!
