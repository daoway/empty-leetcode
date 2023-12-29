package com.blogspot.ostas.leetcode.all.easy.remove_all_adjacent_duplicates_in_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abbaca"
    Output: "ca"
    Explanation:
    For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
    Example 2:
    Input: s = "azxxzy"
    Output: "ay"
      Constraints:
    1 <= s.length <= 105
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abbaca";
        String expected = "ca";
        var result = solution.removeDuplicates(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "azxxzy";
        String expected = "ay";
        var result = solution.removeDuplicates(s);
        assertThat(result).isEqualTo(expected);
    }

}
