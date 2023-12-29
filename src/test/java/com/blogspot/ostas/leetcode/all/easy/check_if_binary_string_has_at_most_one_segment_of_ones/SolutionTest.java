package com.blogspot.ostas.leetcode.all.easy.check_if_binary_string_has_at_most_one_segment_of_ones;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "1001"
    Output: false
    Explanation: The ones do not form a contiguous segment.
    Example 2:
    Input: s = "110"
    Output: true
      Constraints:
    1 <= s.length <= 100
    s[i] is either '0' or '1'.
    s[0] is '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "1001";
        boolean expected = false;
        var result = solution.checkOnesSegment(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "110";
        boolean expected = true;
        var result = solution.checkOnesSegment(s);
        assertThat(result).isEqualTo(expected);
    }

}
