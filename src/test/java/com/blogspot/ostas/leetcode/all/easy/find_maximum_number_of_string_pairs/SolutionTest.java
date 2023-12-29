package com.blogspot.ostas.leetcode.all.easy.find_maximum_number_of_string_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["cd","ac","dc","ca","zz"]
    Output: 2
    Explanation: In this example, we can form 2 pair of strings in the following way:
    - We pair the 0th string with the 2nd string, as the reversed string of word[0] is "dc" and is equal to words[2].
    - We pair the 1st string with the 3rd string, as the reversed string of word[1] is "ca" and is equal to words[3].
    It can be proven that 2 is the maximum number of pairs that can be formed.
    Example 2:
    Input: words = ["ab","ba","cc"]
    Output: 1
    Explanation: In this example, we can form 1 pair of strings in the following way:
    - We pair the 0th string with the 1st string, as the reversed string of words[1] is "ab" and is equal to words[0].
    It can be proven that 1 is the maximum number of pairs that can be formed.
    Example 3:
    Input: words = ["aa","ab"]
    Output: 0
    Explanation: In this example, we are unable to form any pair of strings.
      Constraints:
    1 <= words.length <= 50
    words[i].length == 2
    words consists of distinct strings.
    words[i] contains only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"cd", "ac", "dc", "ca", "zz"};
        int expected = 2;
        var result = solution.maximumNumberOfStringPairs(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"ab", "ba", "cc"};
        int expected = 1;
        var result = solution.maximumNumberOfStringPairs(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] words = new String[]{"aa", "ab"};
        int expected = 0;
        var result = solution.maximumNumberOfStringPairs(words);
        assertThat(result).isEqualTo(expected);
    }

}
