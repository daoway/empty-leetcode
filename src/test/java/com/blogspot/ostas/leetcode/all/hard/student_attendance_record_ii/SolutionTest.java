package com.blogspot.ostas.leetcode.all.hard.student_attendance_record_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: 8
    Explanation: There are 8 records with length 2 that are eligible for an award:
    "PP", "AP", "PA", "LP", "PL", "AL", "LA", "LL"
    Only "AA" is not eligible because there are 2 absences (there need to be fewer than 2).
    Example 2:
    Input: n = 1
    Output: 3
    Example 3:
    Input: n = 10101
    Output: 183236316
      Constraints:
    1 <= n <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int expected = 8;
        var result = solution.checkRecord(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int expected = 3;
        var result = solution.checkRecord(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 10101;
        int expected = 183236316;
        var result = solution.checkRecord(n);
        assertThat(result).isEqualTo(expected);
    }

}
