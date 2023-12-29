package com.blogspot.ostas.leetcode.all.easy.find_first_palindromic_string_in_the_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["abc","car","ada","racecar","cool"]
    Output: "ada"
    Explanation: The first string that is palindromic is "ada".
    Note that "racecar" is also palindromic, but it is not the first.
    Example 2:
    Input: words = ["notapalindrome","racecar"]
    Output: "racecar"
    Explanation: The first and only string that is palindromic is "racecar".
    Example 3:
    Input: words = ["def","ghi"]
    Output: ""
    Explanation: There are no palindromic strings, so the empty string is returned.
      Constraints:
    1 <= words.length <= 100
    1 <= words[i].length <= 100
    words[i] consists only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"abc", "car", "ada", "racecar", "cool"};
        String expected = "ada";
        var result = solution.firstPalindrome(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"notapalindrome", "racecar"};
        String expected = "racecar";
        var result = solution.firstPalindrome(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] words = new String[]{"def", "ghi"};
        String expected = "";
        var result = solution.firstPalindrome(words);
        assertThat(result).isEqualTo(expected);
    }

}
