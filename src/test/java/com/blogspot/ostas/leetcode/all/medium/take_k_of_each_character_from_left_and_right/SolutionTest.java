package com.blogspot.ostas.leetcode.all.medium.take_k_of_each_character_from_left_and_right;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aabaaaacaabc", k = 2
    Output: 8
    Explanation:
    Take three characters from the left of s. You now have two 'a' characters, and one 'b' character.
    Take five characters from the right of s. You now have four 'a' characters, two 'b' characters, and two 'c' characters.
    A total of 3 + 5 = 8 minutes is needed.
    It can be proven that 8 is the minimum number of minutes needed.
    Example 2:
    Input: s = "a", k = 1
    Output: -1
    Explanation: It is not possible to take one 'b' or 'c' so return -1.
      Constraints:
    1 <= s.length <= 105
    s consists of only the letters 'a', 'b', and 'c'.
    0 <= k <= s.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aabaaaacaabc";
        int k = 2;
        int expected = 8;
        var result = solution.takeCharacters(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "a";
        int k = 1;
        int expected = -1;
        var result = solution.takeCharacters(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
