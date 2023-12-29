package com.blogspot.ostas.leetcode.all.medium.adding_spaces_to_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "LeetcodeHelpsMeLearn", spaces = [8,13,15]
    Output: "Leetcode Helps Me Learn"
    Explanation:
    The indices 8, 13, and 15 correspond to the underlined characters in "LeetcodeHelpsMeLearn".
    We then place spaces before those characters.
    Example 2:
    Input: s = "icodeinpython", spaces = [1,5,7,9]
    Output: "i code in py thon"
    Explanation:
    The indices 1, 5, 7, and 9 correspond to the underlined characters in "icodeinpython".
    We then place spaces before those characters.
    Example 3:
    Input: s = "spacing", spaces = [0,1,2,3,4,5,6]
    Output: " s p a c i n g"
    Explanation:
    We are also able to place spaces before the first character of the string.
      Constraints:
    1 <= s.length <= 3 * 105
    s consists only of lowercase and uppercase English letters.
    1 <= spaces.length <= 3 * 105
    0 <= spaces[i] <= s.length - 1
    All the values of spaces are strictly increasing.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = new int[]{8, 13, 15};
        String expected = "Leetcode Helps Me Learn";
        var result = solution.addSpaces(s, spaces);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "icodeinpython";
        int[] spaces = new int[]{1, 5, 7, 9};
        String expected = "i code in py thon";
        var result = solution.addSpaces(s, spaces);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "spacing";
        int[] spaces = new int[]{0, 1, 2, 3, 4, 5, 6};
        String expected = " s p a c i n g";
        var result = solution.addSpaces(s, spaces);
        assertThat(result).isEqualTo(expected);
    }

}
