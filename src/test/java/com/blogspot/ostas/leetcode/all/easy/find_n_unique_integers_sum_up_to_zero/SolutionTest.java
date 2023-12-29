package com.blogspot.ostas.leetcode.all.easy.find_n_unique_integers_sum_up_to_zero;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5
    Output: [-7,-1,1,3,4]
    Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
    Example 2:
    Input: n = 3
    Output: [-1,0,1]
    Example 3:
    Input: n = 1
    Output: [0]
      Constraints:
    1 <= n <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[] expected1 = new int[]{-7, -1, 1, 3, 4};
        int[] expected2 = new int[]{-5, -1, 1, 2, 3};
        int[] expected3 = new int[]{-3, -1, 2, -2, 4};
        int[] expected4 = new int[]{-4, -2, 0, 2, 4};
        var result = solution.sumZero(n);
        assertThat(result).isIn(expected1, expected2, expected3, expected4);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[] expected1 = new int[]{-1, 0, 1};
        int[] expected2 = new int[]{-2, 0, 2};
        var result = solution.sumZero(n);
        assertThat(result).isIn(expected1, expected2);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 1;
        int[] expected = new int[]{0};
        var result = solution.sumZero(n);
        assertThat(result).isEqualTo(expected);
    }

}
