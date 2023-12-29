package com.blogspot.ostas.leetcode.all.easy.valid_palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
    Example 2:
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.
    Example 3:
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.
      Constraints:
    1 <= s.length <= 2 * 105
    s consists only of printable ASCII characters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "A man, a plan, a canal: Panama";
        boolean expected = true;
        var result = solution.isPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "race a car";
        boolean expected = false;
        var result = solution.isPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = " ";
        boolean expected = true;
        var result = solution.isPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

}
