package com.blogspot.ostas.leetcode.all.easy.reformat_phone_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: number = "1-23-45 6"
    Output: "123-456"
    Explanation: The digits are "123456".
    Step 1: There are more than 4 digits, so group the next 3 digits. The 1st block is "123".
    Step 2: There are 3 digits remaining, so put them in a single block of length 3. The 2nd block is "456".
    Joining the blocks gives "123-456".
    Example 2:
    Input: number = "123 4-567"
    Output: "123-45-67"
    Explanation: The digits are "1234567".
    Step 1: There are more than 4 digits, so group the next 3 digits. The 1st block is "123".
    Step 2: There are 4 digits left, so split them into two blocks of length 2. The blocks are "45" and "67".
    Joining the blocks gives "123-45-67".
    Example 3:
    Input: number = "123 4-5678"
    Output: "123-456-78"
    Explanation: The digits are "12345678".
    Step 1: The 1st block is "123".
    Step 2: The 2nd block is "456".
    Step 3: There are 2 digits left, so put them in a single block of length 2. The 3rd block is "78".
    Joining the blocks gives "123-456-78".
      Constraints:
    2 <= number.length <= 100
    number consists of digits and the characters '-' and ' '.
    There are at least two digits in number.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String number = "1-23-45 6";
        String expected = "123-456";
        var result = solution.reformatNumber(number);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String number = "123 4-567";
        String expected = "123-45-67";
        var result = solution.reformatNumber(number);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String number = "123 4-5678";
        String expected = "123-456-78";
        var result = solution.reformatNumber(number);
        assertThat(result).isEqualTo(expected);
    }

}
