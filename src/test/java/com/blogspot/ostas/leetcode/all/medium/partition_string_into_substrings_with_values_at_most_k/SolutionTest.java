package com.blogspot.ostas.leetcode.all.medium.partition_string_into_substrings_with_values_at_most_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "165462", k = 60
    Output: 4
    Explanation: We can partition the string into substrings "16", "54", "6", and "2". Each substring has a value less than or equal to k = 60.
    It can be shown that we cannot partition the string into less than 4 substrings.
    Example 2:
    Input: s = "238182", k = 5
    Output: -1
    Explanation: There is no good partition for this string.
      Constraints:
    1 <= s.length <= 105
    s[i] is a digit from '1' to '9'.
    1 <= k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "165462";
        int k = 60;
        int expected = 4;
        var result = solution.minimumPartition(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "238182";
        int k = 5;
        int expected = -1;
        var result = solution.minimumPartition(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
