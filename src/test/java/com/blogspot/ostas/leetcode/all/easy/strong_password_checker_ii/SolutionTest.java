package com.blogspot.ostas.leetcode.all.easy.strong_password_checker_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: password = "IloveLe3tcode!"
    Output: true
    Explanation: The password meets all the requirements. Therefore, we return true.
    Example 2:
    Input: password = "Me+You--IsMyDream"
    Output: false
    Explanation: The password does not contain a digit and also contains 2 of the same character in adjacent positions. Therefore, we return false.
    Example 3:
    Input: password = "1aB!"
    Output: false
    Explanation: The password does not meet the length requirement. Therefore, we return false.
      Constraints:
    1 <= password.length <= 100
    password consists of letters, digits, and special characters: "!@#$%^&*()-+".
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String password = "IloveLe3tcode!";
        boolean expected = true;
        var result = solution.strongPasswordCheckerII(password);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String password = "Me+You--IsMyDream";
        boolean expected = false;
        var result = solution.strongPasswordCheckerII(password);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String password = "1aB!";
        boolean expected = false;
        var result = solution.strongPasswordCheckerII(password);
        assertThat(result).isEqualTo(expected);
    }

}
