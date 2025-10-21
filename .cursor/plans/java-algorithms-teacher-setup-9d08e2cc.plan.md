<!-- 9d08e2cc-5779-4628-96f3-279958fbaf48 ccf7ad52-7dc7-4361-ace8-d17362841391 -->
# Java Algorithms Teacher Setup Plan

## Project Structure

Create a Maven/Gradle-based Java project with the following structure:

```
mastering-algorithms/
├── README.md (Main curriculum overview & progress tracker)
├── pom.xml or build.gradle (Java 17+, JUnit 5)
├── ASSESSMENT.md (Initial 3 assessment questions)
├── src/
│   ├── main/java/com/algorithms/
│   │   ├── week01_arrays_strings/
│   │   ├── week02_math_bits/
│   │   ├── week03_hashmaps_sets/
│   │   ├── week04_linkedlists/
│   │   ├── week05_stacks_queues/
│   │   ├── week06_trees_bst/
│   │   ├── week07_heaps_priorityqueues/
│   │   ├── week08_graphs/
│   │   ├── week09_recursion_backtracking/
│   │   ├── week10_dynamic_programming_1d/
│   │   ├── week11_dynamic_programming_2d/
│   │   └── week12_advanced_sorting_searching/
│   └── test/java/com/algorithms/
│       └── (mirrored structure with test classes)
```

## Content Creation

### 1. Root Level Files

- **README.md**: Welcome message, curriculum overview with all 12 weeks outlined, progress checklist (checkboxes for each week's completion), instructions on how to use the curriculum
- **ASSESSMENT.md**: 3 assessment questions covering Java syntax, OOP principles, and Big O notation with answer submission instructions
- **pom.xml**: Maven configuration with JUnit 5, Java 17+

### 2. Each Week Package Structure

Each `weekXX_topic/` will contain:

- **README.md**: Topic lesson with concept explanation, properties, Big O analysis, common applications
- **Implementation.java**: Clean, idiomatic Java implementation of the core data structure/algorithm
- **ProblemXX.java**: Skeleton classes for practice problems (initially 2-3 problems per topic, Easy to Medium difficulty)
- Corresponding test files in `test/` directory

### 3. Initial Content Detail

- **Assessment questions**: Fully written and ready
- **Week 1 (Arrays/Strings)**: Scaffolded structure with README template, problem descriptions ready (detailed content added when you reach this topic)
- **Weeks 2-12**: Package folders created, README templates with topic names, placeholders for problems

### 4. Progress Tracking

- Main README will include a comprehensive checklist table:
  - Week number, Topic, Concept Status, Problems Completed (X/Y), Date Completed
  - Assessment section at top to track initial evaluation

## Key Features

- **JUnit 5 test cases** for each problem to validate solutions
- **Structured progression** following the specified curriculum order
- **Big O complexity** discussions in every lesson
- **Problem constraints** included in each problem description
- **Thought process guidance** in lesson READMEs emphasizing "why" for data structure/algorithm choices
- **Code review checkpoints** (guidance in READMEs on what to look for when self-reviewing)

## Teaching Methodology Integration

Each topic README will follow the four-step process:

1. Concept Explanation section
2. Java Implementation section with annotated code
3. Guided Practice section with curated problems
4. Self-Review Checklist (correctness, efficiency, clarity, Java best practices)

## Next Steps After Setup

After the structure is created, you will:

1. Complete the 3 assessment questions in ASSESSMENT.md
2. Based on your answers (self-evaluated or reviewed), begin Week 1
3. Progress through topics sequentially, with detailed content being added as you advance

### To-dos

- [ ] Create Maven project structure with pom.xml (Java 17+, JUnit 5 dependencies)
- [ ] Create README.md with curriculum overview and progress tracking table, plus ASSESSMENT.md with 3 initial questions
- [ ] Create all 12 week packages under src/main/java/com/algorithms/ and corresponding test directories
- [ ] Create README.md templates for each week with topic names and lesson structure outline
- [ ] Add 2-3 problem skeleton files with descriptions for Week 1 as examples, with corresponding JUnit test files