package com.blogspot.ostas.leetcode.all.easy.minimum_string_length_after_removing_substrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "ABFCACDB"
    Output: 2
    Explanation: We can do the following operations:
    - Remove the substring "ABFCACDB", so s = "FCACDB".
    - Remove the substring "FCACDB", so s = "FCAB".
    - Remove the substring "FCAB", so s = "FC".
    So the resulting length of the string is 2.
    It can be shown that it is the minimum length that we can obtain.
    Example 2:
    Input: s = "ACBBD"
    Output: 5
    Explanation: We cannot do any operations on the string so the length remains the same.
      Constraints:
    1 <= s.length <= 100
    s consists only of uppercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "ABFCACDB";
        int expected = 2;
        var result = solution.minLength(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "ACBBD";
        int expected = 5;
        var result = solution.minLength(s);
        assertThat(result).isEqualTo(expected);
    }

}
