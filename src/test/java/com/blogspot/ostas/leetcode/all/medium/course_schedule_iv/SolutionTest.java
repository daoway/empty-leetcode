package com.blogspot.ostas.leetcode.all.medium.course_schedule_iv;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: numCourses = 2, prerequisites = [[1,0]], queries = [[0,1],[1,0]]
    Output: [false,true]
    Explanation: The pair [1, 0] indicates that you have to take course 1 before you can take course 0.
    Course 0 is not a prerequisite of course 1, but the opposite is true.
    Example 2:
    Input: numCourses = 2, prerequisites = [], queries = [[1,0],[0,1]]
    Output: [false,false]
    Explanation: There are no prerequisites, and each course is independent.
    Example 3:
    Input: numCourses = 3, prerequisites = [[1,2],[1,0],[2,0]], queries = [[1,0],[1,2]]
    Output: [true,true]
      Constraints:
    2 <= numCourses <= 100
    0 <= prerequisites.length <= (numCourses * (numCourses - 1) / 2)
    prerequisites[i].length == 2
    0 <= ai, bi <= n - 1
    ai != bi
    All the pairs [ai, bi] are unique.
    The prerequisites graph has no cycles.
    1 <= queries.length <= 104
    0 <= ui, vi <= n - 1
    ui != vi
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int numCourses = 2;
        int[][] prerequisites = new int[][]{{1, 0}};
        int[][] queries = new int[][]{{0, 1}, {1, 0}};
        List<Boolean> expected = List.of(false, true);
        var result = solution.checkIfPrerequisite(numCourses, prerequisites, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int numCourses = 2;
        int[][] prerequisites = new int[][]{};
        int[][] queries = new int[][]{{1, 0}, {0, 1}};
        List<Boolean> expected = List.of(false, false);
        var result = solution.checkIfPrerequisite(numCourses, prerequisites, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int numCourses = 3;
        int[][] prerequisites = new int[][]{{1, 2}, {1, 0}, {2, 0}};
        int[][] queries = new int[][]{{1, 0}, {1, 2}};
        List<Boolean> expected = List.of(true, true);
        var result = solution.checkIfPrerequisite(numCourses, prerequisites, queries);
        assertThat(result).isEqualTo(expected);
    }

}
