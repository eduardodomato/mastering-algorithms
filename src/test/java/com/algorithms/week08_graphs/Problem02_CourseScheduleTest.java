package com.algorithms.week08_graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 2: Course Schedule
 */
class Problem02_CourseScheduleTest {
    
    private Problem02_CourseSchedule solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem02_CourseSchedule();
    }
    
    @Test
    void testCanFinish_Example1() {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};
        assertTrue(solution.canFinish(numCourses, prerequisites));
    }
    
    @Test
    void testCanFinish_Example2() {
        int numCourses = 2;
        int[][] prerequisites = {{1,0},{0,1}};
        assertFalse(solution.canFinish(numCourses, prerequisites));
    }
    
    @Test
    void testCanFinish_NoPrerequisites() {
        int numCourses = 3;
        int[][] prerequisites = {};
        assertTrue(solution.canFinish(numCourses, prerequisites));
    }
    
    @Test
    void testCanFinish_SingleCourse() {
        int numCourses = 1;
        int[][] prerequisites = {};
        assertTrue(solution.canFinish(numCourses, prerequisites));
    }
}
