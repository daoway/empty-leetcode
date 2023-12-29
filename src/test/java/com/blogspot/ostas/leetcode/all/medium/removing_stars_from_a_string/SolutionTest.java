package com.blogspot.ostas.leetcode.all.medium.removing_stars_from_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "leet**cod*e"
    Output: "lecoe"
    Explanation: Performing the removals from left to right:
    - The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
    - The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
    - The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
    There are no more stars, so we return "lecoe".
    Example 2:
    Input: s = "erase*****"
    Output: ""
    Explanation: The entire string is removed, so we return an empty string.
      Constraints:
    1 <= s.length <= 105
    s consists of lowercase English letters and stars *.
    The operation above can be performed on s.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "leet**cod*e";
        String expected = "lecoe";
        var result = solution.removeStars(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "erase*****";
        String expected = "";
        var result = solution.removeStars(s);
        assertThat(result).isEqualTo(expected);
    }

}
