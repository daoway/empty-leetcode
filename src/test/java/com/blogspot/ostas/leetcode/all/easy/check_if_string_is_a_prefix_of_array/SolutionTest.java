package com.blogspot.ostas.leetcode.all.easy.check_if_string_is_a_prefix_of_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
    Output: true
    Explanation:
    s can be made by concatenating "i", "love", and "leetcode" together.
    Example 2:
    Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
    Output: false
    Explanation:
    It is impossible to make s using a prefix of arr.
      Constraints:
    1 <= words.length <= 100
    1 <= words[i].length <= 20
    1 <= s.length <= 1000
    words[i] and s consist of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "iloveleetcode";
        String[] words = new String[]{"i", "love", "leetcode", "apples"};
        boolean expected = true;
        var result = solution.isPrefixString(s, words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "iloveleetcode";
        String[] words = new String[]{"apples", "i", "love", "leetcode"};
        boolean expected = false;
        var result = solution.isPrefixString(s, words);
        assertThat(result).isEqualTo(expected);
    }

}
