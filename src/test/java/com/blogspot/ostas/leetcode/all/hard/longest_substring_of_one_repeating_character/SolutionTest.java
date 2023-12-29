package com.blogspot.ostas.leetcode.all.hard.longest_substring_of_one_repeating_character;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "babacc", queryCharacters = "bcb", queryIndices = [1,3,3]
    Output: [3,3,4]
    Explanation:
    - 1st query updates s = "bbbacc". The longest substring consisting of one repeating character is "bbb" with length 3.
    - 2nd query updates s = "bbbccc".
      The longest substring consisting of one repeating character can be "bbb" or "ccc" with length 3.
    - 3rd query updates s = "bbbbcc". The longest substring consisting of one repeating character is "bbbb" with length 4.
    Thus, we return [3,3,4].
    Example 2:
    Input: s = "abyzz", queryCharacters = "aa", queryIndices = [2,1]
    Output: [2,3]
    Explanation:
    - 1st query updates s = "abazz". The longest substring consisting of one repeating character is "zz" with length 2.
    - 2nd query updates s = "aaazz". The longest substring consisting of one repeating character is "aaa" with length 3.
    Thus, we return [2,3].
      Constraints:
    1 <= s.length <= 105
    s consists of lowercase English letters.
    k == queryCharacters.length == queryIndices.length
    1 <= k <= 105
    queryCharacters consists of lowercase English letters.
    0 <= queryIndices[i] < s.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "babacc";
        String queryCharacters = "bcb";
        int[] queryIndices = new int[]{1, 3, 3};
        int[] expected = new int[]{3, 3, 4};
        var result = solution.longestRepeating(s, queryCharacters, queryIndices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abyzz";
        String queryCharacters = "aa";
        int[] queryIndices = new int[]{2, 1};
        int[] expected = new int[]{2, 3};
        var result = solution.longestRepeating(s, queryCharacters, queryIndices);
        assertThat(result).isEqualTo(expected);
    }

}
