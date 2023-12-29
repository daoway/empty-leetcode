package com.blogspot.ostas.leetcode.all.medium.maximum_length_of_a_concatenated_string_with_unique_characters;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = ["un","iq","ue"]
    Output: 4
    Explanation: All the valid concatenations are:
    - ""
    - "un"
    - "iq"
    - "ue"
    - "uniq" ("un" + "iq")
    - "ique" ("iq" + "ue")
    Maximum length is 4.
    Example 2:
    Input: arr = ["cha","r","act","ers"]
    Output: 6
    Explanation: Possible longest valid concatenations are "chaers" ("cha" + "ers") and "acters" ("act" + "ers").
    Example 3:
    Input: arr = ["abcdefghijklmnopqrstuvwxyz"]
    Output: 26
    Explanation: The only string in arr has all 26 characters.
      Constraints:
    1 <= arr.length <= 16
    1 <= arr[i].length <= 26
    arr[i] contains only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<String> arr = List.of("un", "iq", "ue");
        int expected = 4;
        var result = solution.maxLength(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<String> arr = List.of("cha", "r", "act", "ers");
        int expected = 6;
        var result = solution.maxLength(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<String> arr = List.of("abcdefghijklmnopqrstuvwxyz");
        int expected = 26;
        var result = solution.maxLength(arr);
        assertThat(result).isEqualTo(expected);
    }

}
