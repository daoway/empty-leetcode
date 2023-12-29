package com.blogspot.ostas.leetcode.all.hard.find_xor_sum_of_all_pairs_bitwise_and;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr1 = [1,2,3], arr2 = [6,5]
    Output: 0
    Explanation: The list = [1 AND 6, 1 AND 5, 2 AND 6, 2 AND 5, 3 AND 6, 3 AND 5] = [0,1,2,0,2,1].
    The XOR sum = 0 XOR 1 XOR 2 XOR 0 XOR 2 XOR 1 = 0.
    Example 2:
    Input: arr1 = [12], arr2 = [4]
    Output: 4
    Explanation: The list = [12 AND 4] = [4]. The XOR sum = 4.
      Constraints:
    1 <= arr1.length, arr2.length <= 105
    0 <= arr1[i], arr2[j] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{6, 5};
        int expected = 0;
        var result = solution.getXORSum(arr1, arr2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr1 = new int[]{12};
        int[] arr2 = new int[]{4};
        int expected = 4;
        var result = solution.getXORSum(arr1, arr2);
        assertThat(result).isEqualTo(expected);
    }

}
