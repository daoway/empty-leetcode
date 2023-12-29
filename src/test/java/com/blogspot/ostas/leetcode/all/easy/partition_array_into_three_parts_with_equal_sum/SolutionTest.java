package com.blogspot.ostas.leetcode.all.easy.partition_array_into_three_parts_with_equal_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [0,2,1,-6,6,-7,9,1,2,0,1]
    Output: true
    Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
    Example 2:
    Input: arr = [0,2,1,-6,6,7,9,-1,2,0,1]
    Output: false
    Example 3:
    Input: arr = [3,3,6,5,-2,2,5,1,-9,4]
    Output: true
    Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
      Constraints:
    3 <= arr.length <= 5 * 104
    -104 <= arr[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        boolean expected = true;
        var result = solution.canThreePartsEqualSum(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1};
        boolean expected = false;
        var result = solution.canThreePartsEqualSum(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4};
        boolean expected = true;
        var result = solution.canThreePartsEqualSum(arr);
        assertThat(result).isEqualTo(expected);
    }

}
