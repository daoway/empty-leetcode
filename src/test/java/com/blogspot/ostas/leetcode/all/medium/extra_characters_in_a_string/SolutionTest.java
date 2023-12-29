package com.blogspot.ostas.leetcode.all.medium.extra_characters_in_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "leetscode", dictionary = ["leet","code","leetcode"]
    Output: 1
    Explanation: We can break s in two substrings: "leet" from index 0 to 3 and "code" from index 5 to 8. There is only 1 unused character (at index 4), so we return 1.
    Example 2:
    Input: s = "sayhelloworld", dictionary = ["hello","world"]
    Output: 3
    Explanation: We can break s in two substrings: "hello" from index 3 to 7 and "world" from index 8 to 12. The characters at indices 0, 1, 2 are not used in any substring and thus are considered as extra characters. Hence, we return 3.
      Constraints:
    1 <= s.length <= 50
    1 <= dictionary.length <= 50
    1 <= dictionary[i].length <= 50
    dictionary[i] and s consists of only lowercase English letters
    dictionary contains distinct words
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "leetscode";
        String[] dictionary = new String[]{"leet", "code", "leetcode"};
        int expected = 1;
        var result = solution.minExtraChar(s, dictionary);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "sayhelloworld";
        String[] dictionary = new String[]{"hello", "world"};
        int expected = 3;
        var result = solution.minExtraChar(s, dictionary);
        assertThat(result).isEqualTo(expected);
    }

}
