package com.blogspot.ostas.leetcode.all.medium.minimum_deletions_to_make_character_frequencies_unique;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aab"
    Output: 0
    Explanation: s is already good.
    Example 2:
    Input: s = "aaabbbcc"
    Output: 2
    Explanation: You can delete two 'b's resulting in the good string "aaabcc".
    Another way it to delete one 'b' and one 'c' resulting in the good string "aaabbc".
    Example 3:
    Input: s = "ceabaacb"
    Output: 2
    Explanation: You can delete both 'c's resulting in the good string "eabaab".
    Note that we only care about characters that are still in the string at the end (i.e. frequency of 0 is ignored).
      Constraints:
    1 <= s.length <= 105
    s contains only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aab";
        int expected = 0;
        var result = solution.minDeletions(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aaabbbcc";
        int expected = 2;
        var result = solution.minDeletions(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "ceabaacb";
        int expected = 2;
        var result = solution.minDeletions(s);
        assertThat(result).isEqualTo(expected);
    }

}
