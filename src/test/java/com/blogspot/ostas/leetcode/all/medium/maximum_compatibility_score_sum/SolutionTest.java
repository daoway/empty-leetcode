package com.blogspot.ostas.leetcode.all.medium.maximum_compatibility_score_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: students = [[1,1,0],[1,0,1],[0,0,1]], mentors = [[1,0,0],[0,0,1],[1,1,0]]
    Output: 8
    Explanation: We assign students to mentors in the following way:
    - student 0 to mentor 2 with a compatibility score of 3.
    - student 1 to mentor 0 with a compatibility score of 2.
    - student 2 to mentor 1 with a compatibility score of 3.
    The compatibility score sum is 3 + 2 + 3 = 8.
    Example 2:
    Input: students = [[0,0],[0,0],[0,0]], mentors = [[1,1],[1,1],[1,1]]
    Output: 0
    Explanation: The compatibility score of any student-mentor pair is 0.
      Constraints:
    m == students.length == mentors.length
    n == students[i].length == mentors[j].length
    1 <= m, n <= 8
    students[i][k] is either 0 or 1.
    mentors[j][k] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] students = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 1}};
        int[][] mentors = new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 1, 0}};
        int expected = 8;
        var result = solution.maxCompatibilitySum(students, mentors);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] students = new int[][]{{0, 0}, {0, 0}, {0, 0}};
        int[][] mentors = new int[][]{{1, 1}, {1, 1}, {1, 1}};
        int expected = 0;
        var result = solution.maxCompatibilitySum(students, mentors);
        assertThat(result).isEqualTo(expected);
    }

}
