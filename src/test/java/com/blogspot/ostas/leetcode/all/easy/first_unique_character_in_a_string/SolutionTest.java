package com.blogspot.ostas.leetcode.all.easy.first_unique_character_in_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "leetcode"
    Output: 0
    Example 2:
    Input: s = "loveleetcode"
    Output: 2
    Example 3:
    Input: s = "aabb"
    Output: -1
      Constraints:
    1 <= s.length <= 105
    s consists of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "leetcode";
        int expected = 0;
        var result = solution.firstUniqChar(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "loveleetcode";
        int expected = 2;
        var result = solution.firstUniqChar(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "aabb";
        int expected = -1;
        var result = solution.firstUniqChar(s);
        assertThat(result).isEqualTo(expected);
    }

}
