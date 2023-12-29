package com.blogspot.ostas.leetcode.all.easy.palindrome_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
    Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
      Constraints:
    -231 <= x <= 231 - 1
      Follow up: Could you solve it without converting the integer to a string?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int x = 121;
        boolean expected = true;
        var result = solution.isPalindrome(x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int x = -121;
        boolean expected = false;
        var result = solution.isPalindrome(x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int x = 10;
        boolean expected = false;
        var result = solution.isPalindrome(x);
        assertThat(result).isEqualTo(expected);
    }

}
