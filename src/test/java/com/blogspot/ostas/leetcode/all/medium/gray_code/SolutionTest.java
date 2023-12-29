package com.blogspot.ostas.leetcode.all.medium.gray_code;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: [0,1,3,2]
    Explanation:
    The binary representation of [0,1,3,2] is [00,01,11,10].
    - 00 and 01 differ by one bit
    - 01 and 11 differ by one bit
    - 11 and 10 differ by one bit
    - 10 and 00 differ by one bit
    [0,2,3,1] is also a valid gray code sequence, whose binary representation is [00,10,11,01].
    - 00 and 10 differ by one bit
    - 10 and 11 differ by one bit
    - 11 and 01 differ by one bit
    - 01 and 00 differ by one bit
    Example 2:
    Input: n = 1
    Output: [0,1]
      Constraints:
    1 <= n <= 16
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        List<Integer> expected = List.of(0, 1, 3, 2);
        var result = solution.grayCode(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        List<Integer> expected = List.of(0, 1);
        var result = solution.grayCode(n);
        assertThat(result).isEqualTo(expected);
    }

}
