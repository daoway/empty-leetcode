package com.blogspot.ostas.leetcode.all.medium.decremental_string_concatenation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["aa","ab","bc"]
    Output: 4
    Explanation: In this example, we can perform join operations in the following order to minimize the length of str2:
    str0 = "aa"
    str1 = join(str0, "ab") = "aab"
    str2 = join(str1, "bc") = "aabc"
    It can be shown that the minimum possible length of str2 is 4.
    Example 2:
    Input: words = ["ab","b"]
    Output: 2
    Explanation: In this example, str0 = "ab", there are two ways to get str1:
    join(str0, "b") = "ab" or join("b", str0) = "bab".
    The first string, "ab", has the minimum length. Hence, the answer is 2.
    Example 3:
    Input: words = ["aaa","c","aba"]
    Output: 6
    Explanation: In this example, we can perform join operations in the following order to minimize the length of str2:
    str0 = "aaa"
    str1 = join(str0, "c") = "aaac"
    str2 = join("aba", str1) = "abaaac"
    It can be shown that the minimum possible length of str2 is 6.
    Constraints:
    1 <= words.length <= 1000
    1 <= words[i].length <= 50
    Each character in words[i] is an English lowercase letter
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"aa", "ab", "bc"};
        int expected = 4;
        var result = solution.minimizeConcatenatedLength(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"ab", "b"};
        int expected = 2;
        var result = solution.minimizeConcatenatedLength(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] words = new String[]{"aaa", "c", "aba"};
        int expected = 6;
        var result = solution.minimizeConcatenatedLength(words);
        assertThat(result).isEqualTo(expected);
    }

}
