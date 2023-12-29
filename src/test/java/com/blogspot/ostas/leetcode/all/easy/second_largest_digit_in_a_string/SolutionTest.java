package com.blogspot.ostas.leetcode.all.easy.second_largest_digit_in_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "dfa12321afd"
    Output: 2
    Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
    Example 2:
    Input: s = "abc1111"
    Output: -1
    Explanation: The digits that appear in s are [1]. There is no second largest digit.
      Constraints:
    1 <= s.length <= 500
    s consists of only lowercase English letters and/or digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "dfa12321afd";
        int expected = 2;
        var result = solution.secondHighest(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abc1111";
        int expected = -1;
        var result = solution.secondHighest(s);
        assertThat(result).isEqualTo(expected);
    }

}
