package com.blogspot.ostas.leetcode.all.medium.masking_personal_information;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "LeetCode@LeetCode.com"
    Output: "l*****e@leetcode.com"
    Explanation: s is an email address.
    The name and domain are converted to lowercase, and the middle of the name is replaced by 5 asterisks.
    Example 2:
    Input: s = "AB@qq.com"
    Output: "a*****b@qq.com"
    Explanation: s is an email address.
    The name and domain are converted to lowercase, and the middle of the name is replaced by 5 asterisks.
    Note that even though "ab" is 2 characters, it still must have 5 asterisks in the middle.
    Example 3:
    Input: s = "1(234)567-890"
    Output: "***-***-7890"
    Explanation: s is a phone number.
    There are 10 digits, so the local number is 10 digits and the country code is 0 digits.
    Thus, the resulting masked number is "***-***-7890".
      Constraints:
    s is either a valid email or a phone number.
    If s is an email:
    8 <= s.length <= 40
    s consists of uppercase and lowercase English letters and exactly one '@' symbol and '.' symbol.
    If s is a phone number:
    10 <= s.length <= 20
    s consists of digits, spaces, and the symbols '(', ')', '-', and '+'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "LeetCode@LeetCode.com";
        String expected = "l*****e@leetcode.com";
        var result = solution.maskPII(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "AB@qq.com";
        String expected = "a*****b@qq.com";
        var result = solution.maskPII(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "1(234)567-890";
        String expected = "***-***-7890";
        var result = solution.maskPII(s);
        assertThat(result).isEqualTo(expected);
    }

}
