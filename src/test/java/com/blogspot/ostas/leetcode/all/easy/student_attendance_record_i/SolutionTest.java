package com.blogspot.ostas.leetcode.all.easy.student_attendance_record_i;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "PPALLP"
    Output: true
    Explanation: The student has fewer than 2 absences and was never late 3 or more consecutive days.
    Example 2:
    Input: s = "PPALLL"
    Output: false
    Explanation: The student was late 3 consecutive days in the last 3 days, so is not eligible for the award.
      Constraints:
    1 <= s.length <= 1000
    s[i] is either 'A', 'L', or 'P'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "PPALLP";
        boolean expected = true;
        var result = solution.checkRecord(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "PPALLL";
        boolean expected = false;
        var result = solution.checkRecord(s);
        assertThat(result).isEqualTo(expected);
    }

}
