package com.blogspot.ostas.leetcode.all.easy.odd_string_difference;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["adc","wzy","abc"]
    Output: "abc"
    Explanation:
    - The difference integer array of "adc" is [3 - 0, 2 - 3] = [3, -1].
    - The difference integer array of "wzy" is [25 - 22, 24 - 25]= [3, -1].
    - The difference integer array of "abc" is [1 - 0, 2 - 1] = [1, 1].
    The odd array out is [1, 1], so we return the corresponding string, "abc".
    Example 2:
    Input: words = ["aaa","bob","ccc","ddd"]
    Output: "bob"
    Explanation: All the integer arrays are [0, 0] except for "bob", which corresponds to [13, -13].
      Constraints:
    3 <= words.length <= 100
    n == words[i].length
    2 <= n <= 20
    words[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"adc", "wzy", "abc"};
        String expected = "abc";
        var result = solution.oddString(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"aaa", "bob", "ccc", "ddd"};
        String expected = "bob";
        var result = solution.oddString(words);
        assertThat(result).isEqualTo(expected);
    }

}
