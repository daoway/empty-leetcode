package com.blogspot.ostas.leetcode.all.medium.split_a_string_into_the_max_number_of_unique_substrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "ababccc"
    Output: 5
    Explanation: One way to split maximally is ['a', 'b', 'ab', 'c', 'cc']. Splitting like ['a', 'b', 'a', 'b', 'c', 'cc'] is not valid as you have 'a' and 'b' multiple times.
    Example 2:
    Input: s = "aba"
    Output: 2
    Explanation: One way to split maximally is ['a', 'ba'].
    Example 3:
    Input: s = "aa"
    Output: 1
    Explanation: It is impossible to split the string any further.
      Constraints:
    1 <= s.length <= 16
    s contains only lower case English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "ababccc";
        int expected = 5;
        var result = solution.maxUniqueSplit(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aba";
        int expected = 2;
        var result = solution.maxUniqueSplit(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "aa";
        int expected = 1;
        var result = solution.maxUniqueSplit(s);
        assertThat(result).isEqualTo(expected);
    }

}
