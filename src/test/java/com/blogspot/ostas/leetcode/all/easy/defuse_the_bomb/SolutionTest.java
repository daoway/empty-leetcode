package com.blogspot.ostas.leetcode.all.easy.defuse_the_bomb;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: code = [5,7,1,4], k = 3
    Output: [12,10,16,13]
    Explanation: Each number is replaced by the sum of the next 3 numbers. The decrypted code is [7+1+4, 1+4+5, 4+5+7, 5+7+1]. Notice that the numbers wrap around.
    Example 2:
    Input: code = [1,2,3,4], k = 0
    Output: [0,0,0,0]
    Explanation: When k is zero, the numbers are replaced by 0.
    Example 3:
    Input: code = [2,4,9,3], k = -2
    Output: [12,5,6,13]
    Explanation: The decrypted code is [3+9, 2+3, 4+2, 9+4]. Notice that the numbers wrap around again. If k is negative, the sum is of the previous numbers.
      Constraints:
    n == code.length
    1 <= n <= 100
    1 <= code[i] <= 100
    -(n - 1) <= k <= n - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] code = new int[]{5, 7, 1, 4};
        int k = 3;
        int[] expected = new int[]{12, 10, 16, 13};
        var result = solution.decrypt(code, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] code = new int[]{1, 2, 3, 4};
        int k = 0;
        int[] expected = new int[]{0, 0, 0, 0};
        var result = solution.decrypt(code, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] code = new int[]{2, 4, 9, 3};
        int k = -2;
        int[] expected = new int[]{12, 5, 6, 13};
        var result = solution.decrypt(code, k);
        assertThat(result).isEqualTo(expected);
    }

}
