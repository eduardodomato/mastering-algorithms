# Initial Assessment Questions 📝

Welcome! Before we begin your algorithms journey, let's assess your current Java and algorithmic knowledge. This will help tailor the learning experience to your level.

## Instructions

Please answer the following 3 questions thoughtfully. There are no "wrong" answers - this assessment helps determine the best starting point for your learning path.

**Time Limit**: Take as much time as you need, but aim to complete within 30 minutes.

---

## Question 1: Java Syntax & Object-Oriented Programming 🏗️

**Scenario**: You need to create a class to represent a `Student` with the following requirements:
- Each student has a `name` (String) and `age` (int)
- Students can be compared by age for sorting
- The class should be immutable (values cannot be changed after creation)
- Include a method to get student information as a formatted string

**Task**: Write the complete Java class implementation.

**Your Answer**:
```java
// Write your Student class here
    
    public class Student implements Comparable<Student>{

        private final String name;
        private final int age;

        public Student(String name, int age){
            this.name =  name;
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        @Override
        public int compareTo(Student other){
            if (other == null) {
                throw new NullPointerException("Cannot compare Student to null");
            }
            return Integer.compare(this.age, other.age);
        }
        
        @Override
        public String toString() {
            return String.format("Student{name='%s', age=%d}", name, age);
        }

    }

```

---

## Question 2: Basic Algorithm Concepts & Big O Notation 📊

**Problem**: Given an array of integers, find the two numbers that add up to a target value.

**Example**:
- Input: `nums = [2, 7, 11, 15]`, `target = 9`
- Output: `[0, 1]` (because `nums[0] + nums[1] = 2 + 7 = 9`)

**Constraints**:
- Array length: `2 ≤ n ≤ 10^4`
- Each number: `-10^9 ≤ nums[i] ≤ 10^9`
- Target: `-10^9 ≤ target ≤ 10^9`
- Only one valid solution exists

**Tasks**:
1. **Describe your approach** (2-3 sentences)
2. **What is the time complexity** of your solution?
3. **What is the space complexity** of your solution?
4. **Write the Java method signature** (you don't need to implement the full solution)

**Your Answer**:
```
Approach: 
Can use a HashMap to storing the complement between the target and the current value as key, and the index as value. So that we only traverse the array as much up to "n". Asking if the current calculation matches some of the previous stored.

Time Complexity: O(n)
Space Complexity: O(n)

Method Signature:
public int[] twoNumbers(int[] arr, int target);
```

---

## Question 3: Data Structure Selection & Problem-Solving Thinking 🧠

**Scenario**: You're building a system to track the frequency of words in a document. You need to:
1. Count how many times each word appears
2. Find the most frequent word
3. Get all words that appear exactly twice
4. Handle case-insensitive matching

**Question**: Which data structure would you choose and why? Consider both time and space efficiency.

**Options to consider**:
- Array
- ArrayList
- HashMap
- HashSet
- TreeMap
- Other (specify)

**Your Answer**:
```
Primary Data Structure: HashMap

Reasoning:

Because it can store key/value pairs, having the word as key, and the frecuency as value, for case insensitive cases, before storing or incrementing I can convert toLowerCase(). Then to pull the required information can take advantage of the entrySet() and using the Streams API or filtering matters. Time complexity O(n) I bet, because is O(n) to traverse the document, and O(m) the filtering if remember well.

Alternative approaches considered:
Something similar using TreeMap if by the case I need something related to natural ordering.
```

```java
Map<String, Integer> wordFreq = new HashMap<>();

// Count frequencies
for (String word : document) {
    wordFreq.merge(word.toLowerCase(), 1, Integer::sum);
}

// Find most frequent word
String mostFrequent = wordFreq.entrySet().stream()
    .max(Map.Entry.comparingByValue())
    .map(Map.Entry::getKey)
    .orElse("");

// Find words appearing exactly twice
List<String> twiceWords = wordFreq.entrySet().stream()
    .filter(entry -> entry.getValue() == 2)
    .map(Map.Entry::getKey)
    .collect(Collectors.toList());

```
---

## Self-Evaluation Guide 📋

After completing your answers, use this guide to assess your level:

### **Beginner Level** (0-1 questions answered confidently)
- **Focus**: Strengthen Java fundamentals and basic algorithmic thinking
- **Approach**: Start with Week 1, spend extra time on implementation details
- **Pace**: Take your time with each concept

### **Intermediate Level** (2 questions answered confidently)
- **Focus**: Build on existing knowledge, emphasize optimization techniques
- **Approach**: Begin with Week 1, but can move through concepts more quickly
- **Pace**: Standard pace, focus on advanced problem-solving patterns

### **Advanced Level** (All 3 questions answered confidently)
- **Focus**: Refine problem-solving skills and master advanced algorithms
- **Approach**: Can start with Week 2-3, focus on complex problem variations
- **Pace**: Accelerated pace, emphasis on interview-style problems

---

## Next Steps 🚀

1. **Complete your answers** in the spaces provided above
2. **Self-evaluate** using the guide above
3. **Proceed to Week 1** in the curriculum (or the week that matches your level)
4. **Update the main README.md** progress tracker when you complete this assessment

**Remember**: This assessment is for your benefit - be honest about your current level. The curriculum is designed to meet you where you are and take you to mastery level!

---

*Good luck! The journey to algorithmic mastery begins with understanding where you are today.* 🌟
