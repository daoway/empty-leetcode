package com.blogspot.ostas.leetcode.all.medium.count_number_of_homogenous_substrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abbcccaa"
    Output: 13
    Explanation: The homogenous substrings are listed as below:
    "a"   appears 3 times.
    "aa"  appears 1 time.
    "b"   appears 2 times.
    "bb"  appears 1 time.
    "c"   appears 3 times.
    "cc"  appears 2 times.
    "ccc" appears 1 time.
    3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.
    Example 2:
    Input: s = "xy"
    Output: 2
    Explanation: The homogenous substrings are "x" and "y".
    Example 3:
    Input: s = "zzzzz"
    Output: 15
      Constraints:
    1 <= s.length <= 105
    s consists of lowercase letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abbcccaa";
        int expected = 13;
        var result = solution.countHomogenous(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "xy";
        int expected = 2;
        var result = solution.countHomogenous(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "zzzzz";
        int expected = 15;
        var result = solution.countHomogenous(s);
        assertThat(result).isEqualTo(expected);
    }

}
