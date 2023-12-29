package com.blogspot.ostas.leetcode.all.medium.sort_the_students_by_their_kth_score;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: score = [[10,6,9,1],[7,5,11,2],[4,8,3,15]], k = 2
    Output: [[7,5,11,2],[10,6,9,1],[4,8,3,15]]
    Explanation: In the above diagram, S denotes the student, while E denotes the exam.
    - The student with index 1 scored 11 in exam 2, which is the highest score, so they got first place.
    - The student with index 0 scored 9 in exam 2, which is the second highest score, so they got second place.
    - The student with index 2 scored 3 in exam 2, which is the lowest score, so they got third place.
    Example 2:
    Input: score = [[3,4],[5,6]], k = 0
    Output: [[5,6],[3,4]]
    Explanation: In the above diagram, S denotes the student, while E denotes the exam.
    - The student with index 1 scored 5 in exam 0, which is the highest score, so they got first place.
    - The student with index 0 scored 3 in exam 0, which is the lowest score, so they got second place.
      Constraints:
    m == score.length
    n == score[i].length
    1 <= m, n <= 250
    1 <= score[i][j] <= 105
    score consists of distinct integers.
    0 <= k < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] score = new int[][]{{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};
        int k = 2;
        int[][] expected = new int[][]{{7, 5, 11, 2}, {10, 6, 9, 1}, {4, 8, 3, 15}};
        var result = solution.sortTheStudents(score, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] score = new int[][]{{3, 4}, {5, 6}};
        int k = 0;
        int[][] expected = new int[][]{{5, 6}, {3, 4}};
        var result = solution.sortTheStudents(score, k);
        assertThat(result).isEqualTo(expected);
    }

}
