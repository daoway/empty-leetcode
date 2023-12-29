package com.blogspot.ostas.leetcode.all.medium.construct_the_longest_new_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: x = 2, y = 5, z = 1
    Output: 12
    Explanation: We can concactenate the strings "BB", "AA", "BB", "AA", "BB", and "AB" in that order. Then, our new string is "BBAABBAABBAB".
    That string has length 12, and we can show that it is impossible to construct a string of longer length.
    Example 2:
    Input: x = 3, y = 2, z = 2
    Output: 14
    Explanation: We can concactenate the strings "AB", "AB", "AA", "BB", "AA", "BB", and "AA" in that order. Then, our new string is "ABABAABBAABBAA".
    That string has length 14, and we can show that it is impossible to construct a string of longer length.
      Constraints:
    1 <= x, y, z <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int x = 2;
        int y = 5;
        int z = 1;
        int expected = 12;
        var result = solution.longestString(x, y, z);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int x = 3;
        int y = 2;
        int z = 2;
        int expected = 14;
        var result = solution.longestString(x, y, z);
        assertThat(result).isEqualTo(expected);
    }

}
