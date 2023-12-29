package com.blogspot.ostas.leetcode.all.hard.parallel_courses_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, relations = [[2,1],[3,1],[1,4]], k = 2
    Output: 3
    Explanation: The figure above represents the given graph.
    In the first semester, you can take courses 2 and 3.
    In the second semester, you can take course 1.
    In the third semester, you can take course 4.
    Example 2:
    Input: n = 5, relations = [[2,1],[3,1],[4,1],[1,5]], k = 2
    Output: 4
    Explanation: The figure above represents the given graph.
    In the first semester, you can only take courses 2 and 3 since you cannot take more than two per semester.
    In the second semester, you can take course 4.
    In the third semester, you can take course 1.
    In the fourth semester, you can take course 5.
      Constraints:
    1 <= n <= 15
    1 <= k <= n
    0 <= relations.length <= n * (n-1) / 2
    relations[i].length == 2
    1 <= prevCoursei, nextCoursei <= n
    prevCoursei != nextCoursei
    All the pairs [prevCoursei, nextCoursei] are unique.
    The given graph is a directed acyclic graph.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[][] relations = new int[][]{{2, 1}, {3, 1}, {1, 4}};
        int k = 2;
        int expected = 3;
        var result = solution.minNumberOfSemesters(n, relations, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int[][] relations = new int[][]{{2, 1}, {3, 1}, {4, 1}, {1, 5}};
        int k = 2;
        int expected = 4;
        var result = solution.minNumberOfSemesters(n, relations, k);
        assertThat(result).isEqualTo(expected);
    }

}
