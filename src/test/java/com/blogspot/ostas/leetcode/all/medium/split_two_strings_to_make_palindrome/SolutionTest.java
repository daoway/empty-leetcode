package com.blogspot.ostas.leetcode.all.medium.split_two_strings_to_make_palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = "x", b = "y"
    Output: true
    Explaination: If either a or b are palindromes the answer is true since you can split in the following way:
    aprefix = "", asuffix = "x"
    bprefix = "", bsuffix = "y"
    Then, aprefix + bsuffix = "" + "y" = "y", which is a palindrome.
    Example 2:
    Input: a = "xbdef", b = "xecab"
    Output: false
    Example 3:
    Input: a = "ulacfd", b = "jizalu"
    Output: true
    Explaination: Split them at index 3:
    aprefix = "ula", asuffix = "cfd"
    bprefix = "jiz", bsuffix = "alu"
    Then, aprefix + bsuffix = "ula" + "alu" = "ulaalu", which is a palindrome.
      Constraints:
    1 <= a.length, b.length <= 105
    a.length == b.length
    a and b consist of lowercase English letters
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String a = "x";
        String b = "y";
        boolean expected = true;
        var result = solution.checkPalindromeFormation(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String a = "xbdef";
        String b = "xecab";
        boolean expected = false;
        var result = solution.checkPalindromeFormation(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String a = "ulacfd";
        String b = "jizalu";
        boolean expected = true;
        var result = solution.checkPalindromeFormation(a, b);
        assertThat(result).isEqualTo(expected);
    }

}
