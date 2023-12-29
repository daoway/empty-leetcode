package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_steps_to_make_two_strings_anagram_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "leetcode", t = "coats"
    Output: 7
    Explanation:
    - In 2 steps, we can append the letters in "as" onto s = "leetcode", forming s = "leetcodeas".
    - In 5 steps, we can append the letters in "leede" onto t = "coats", forming t = "coatsleede".
    "leetcodeas" and "coatsleede" are now anagrams of each other.
    We used a total of 2 + 5 = 7 steps.
    It can be shown that there is no way to make them anagrams of each other with less than 7 steps.
    Example 2:
    Input: s = "night", t = "thing"
    Output: 0
    Explanation: The given strings are already anagrams of each other. Thus, we do not need any further steps.
      Constraints:
    1 <= s.length, t.length <= 2 * 105
    s and t consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "leetcode";
        String t = "coats";
        int expected = 7;
        var result = solution.minSteps(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "night";
        String t = "thing";
        int expected = 0;
        var result = solution.minSteps(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
