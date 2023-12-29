package com.blogspot.ostas.leetcode.all.medium.the_kth_factor_of_n;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 12, k = 3
    Output: 3
    Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
    Example 2:
    Input: n = 7, k = 2
    Output: 7
    Explanation: Factors list is [1, 7], the 2nd factor is 7.
    Example 3:
    Input: n = 4, k = 4
    Output: -1
    Explanation: Factors list is [1, 2, 4], there is only 3 factors. We should return -1.
      Constraints:
    1 <= k <= n <= 1000
      Follow up:
    Could you solve this problem in less than O(n) complexity?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 12;
        int k = 3;
        int expected = 3;
        var result = solution.kthFactor(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 7;
        int k = 2;
        int expected = 7;
        var result = solution.kthFactor(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        int k = 4;
        int expected = -1;
        var result = solution.kthFactor(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
