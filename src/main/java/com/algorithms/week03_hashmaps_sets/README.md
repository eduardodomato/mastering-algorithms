# Week 3: Hash Maps & Sets 🗂️

## 🎯 Learning Objectives

By the end of this week, you will be able to:
- Use HashMap for efficient lookups
- Apply HashSet for duplicate detection
- Implement frequency counting patterns
- Handle hash collisions
- Choose appropriate hash-based data structures

## 📚 Core Concepts

### 1. Hash Tables
- **HashMap**: Key-value storage with O(1) average access
- **HashSet**: Unique element storage
- **Collision handling**: Chaining, open addressing
- **Time complexity**: O(1) average, O(n) worst case

### 2. Frequency Counting
- **Pattern**: Count occurrences of elements
- **Applications**: Anagrams, duplicates, statistics
- **Implementation**: HashMap with counts
- **Time complexity**: O(n) for counting

### 3. Set Operations
- **Union, intersection, difference**
- **Subset/superset checking**
- **Duplicate removal**
- **Time complexity**: O(n) for most operations

## 🛠️ Java Implementation

The `Week03_Implementation.java` file contains comprehensive examples of hash-based data structures and common patterns:

- **Frequency Counting**: Using HashMap to count character/element occurrences
- **Anagram Detection**: Comparing character frequencies between strings
- **Grouping Patterns**: Using HashMap keys to group related elements
- **Set Operations**: HashSet for O(1) lookup and duplicate detection
- **Sequence Detection**: Finding consecutive sequences using HashSet
- **Two Sum Pattern**: Using HashMap for complement-based lookups

### Key Implementation Patterns:

1. **Character Frequency Counting**
   ```java
   Map<Character, Integer> charCount = new HashMap<>();
   for (char c : s.toCharArray()) {
       charCount.put(c, charCount.getOrDefault(c, 0) + 1);
   }
   ```

2. **Grouping with HashMap**
   ```java
   Map<String, List<String>> groups = new HashMap<>();
   groups.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
   ```

3. **HashSet for Fast Lookup**
   ```java
   Set<Integer> numSet = new HashSet<>();
   for (int num : nums) {
       numSet.add(num);
   }
   if (numSet.contains(target)) { /* O(1) lookup */ }
   ```

## 🎯 Practice Problems

### Problem 1: Valid Anagram (Easy) ✅
**LeetCode #242** - Check if two strings are anagrams

**Solution Approach:**
- Use HashMap to count character frequencies in first string
- Decrement counts while iterating through second string
- Early return if any count becomes negative or character not found
- Time Complexity: O(n) where n is string length
- Space Complexity: O(1) since at most 26 characters (or O(k) for k unique chars)

**Key Learning:**
- Frequency counting pattern for string comparison
- Early termination optimization
- Handling Unicode characters (can use HashMap instead of array)

### Problem 2: Group Anagrams (Medium) ✅
**LeetCode #49** - Group strings that are anagrams

**Solution Approach:**
- Use character frequency array as HashMap key (alternative to sorting)
- All anagrams produce the same frequency array when converted to string
- Group strings with identical frequency patterns together
- Time Complexity: O(n * k) where n is number of strings, k is max string length
- Space Complexity: O(n * k) for storing all strings

**Key Learning:**
- Using non-string keys in HashMap (converted frequency array to string)
- Efficient anagram grouping without sorting each string
- `computeIfAbsent()` method for cleaner code

### Problem 3: Longest Consecutive Sequence (Medium) ✅
**LeetCode #128** - Find longest consecutive sequence

**Solution Approach:**
- Use HashSet for O(1) number lookup
- Only start counting sequences from the beginning (check if num-1 exists)
- For each sequence start, count consecutive numbers using while loop
- Track maximum sequence length found
- Time Complexity: O(n) - each number visited at most twice
- Space Complexity: O(n) for the HashSet

**Key Learning:**
- HashSet optimization for sequence detection
- Avoiding redundant work by starting only from sequence beginnings
- One-pass algorithm with clever sequence detection pattern

## 📋 Self-Review Checklist

After completing each problem, review your solution using this checklist:

### Correctness ✓
- [ ] Solution handles all edge cases (empty strings, single characters, etc.)
- [ ] Solution handles constraints correctly (string lengths, array sizes)
- [ ] All test cases pass
- [ ] Solution works for Unicode characters (if applicable)

### Efficiency ✓
- [ ] Time complexity is optimal (O(n) for most hash-based problems)
- [ ] Space complexity is reasonable (O(n) for storing hash structures)
- [ ] No unnecessary iterations or operations
- [ ] Early termination used where possible

### Code Quality ✓
- [ ] Code is readable and well-commented
- [ ] Variable names are descriptive
- [ ] Follows Java best practices
- [ ] Proper use of HashMap/HashSet methods (getOrDefault, computeIfAbsent, etc.)

### Algorithm Understanding ✓
- [ ] Understand why HashMap/HashSet was chosen over other structures
- [ ] Can explain the time/space complexity trade-offs
- [ ] Understand when to use frequency counting vs. set operations
- [ ] Recognize similar patterns in other problems

## 🎓 Key Takeaways

After completing Week 3, you should understand:

1. **When to Use HashMap**: Key-value relationships, frequency counting, grouping
2. **When to Use HashSet**: Duplicate detection, fast membership testing, O(1) lookups
3. **Frequency Counting Pattern**: Essential for anagram and pattern-matching problems
4. **Optimization Techniques**: Early termination, sequence detection, avoiding redundant work
5. **Constraint Analysis**: Understanding Integer vs Long for large numbers (see Problem 1 notes)

## 🚀 Next Steps

1. ✅ All three problems completed with passing tests
2. Review your solutions and compare with `Week03_Implementation.java`
3. Practice additional hash-based problems on LeetCode:
   - Contains Duplicate (Easy)
   - Two Sum (Easy) - review from Week 1 with hash approach
   - Intersection of Two Arrays (Easy)
4. Move on to **Week 4: Linked Lists**
