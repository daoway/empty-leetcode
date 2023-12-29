package com.blogspot.ostas.leetcode.all.easy.calculate_digit_sum_of_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "11111222223", k = 3
    Output: "135"
    Explanation:
    - For the first round, we divide s into groups of size 3: "111", "112", "222", and "23".
      Then we calculate the digit sum of each group: 1 + 1 + 1 = 3, 1 + 1 + 2 = 4, 2 + 2 + 2 = 6, and 2 + 3 = 5.
      So, s becomes "3" + "4" + "6" + "5" = "3465" after the first round.
    - For the second round, we divide s into "346" and "5".
      Then we calculate the digit sum of each group: 3 + 4 + 6 = 13, 5 = 5.
      So, s becomes "13" + "5" = "135" after second round.
    Now, s.length <= k, so we return "135" as the answer.
    Example 2:
    Input: s = "00000000", k = 3
    Output: "000"
    Explanation:
    We divide s into "000", "000", and "00".
    Then we calculate the digit sum of each group: 0 + 0 + 0 = 0, 0 + 0 + 0 = 0, and 0 + 0 = 0.
    s becomes "0" + "0" + "0" = "000", whose length is equal to k, so we return "000".
      Constraints:
    1 <= s.length <= 100
    2 <= k <= 100
    s consists of digits only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "11111222223";
        int k = 3;
        String expected = "135";
        var result = solution.digitSum(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "00000000";
        int k = 3;
        String expected = "000";
        var result = solution.digitSum(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
