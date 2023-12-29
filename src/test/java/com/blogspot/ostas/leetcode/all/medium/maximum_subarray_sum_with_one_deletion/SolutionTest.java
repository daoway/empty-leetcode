package com.blogspot.ostas.leetcode.all.medium.maximum_subarray_sum_with_one_deletion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,-2,0,3]
    Output: 4
    Explanation: Because we can choose [1, -2, 0, 3] and drop -2, thus the subarray [1, 0, 3] becomes the maximum value.
    Example 2:
    Input: arr = [1,-2,-2,3]
    Output: 3
    Explanation: We just choose [3] and it's the maximum sum.
    Example 3:
    Input: arr = [-1,-1,-1,-1]
    Output: -1
    Explanation: The final subarray needs to be non-empty. You can't choose [-1] and delete -1 from it, then get an empty subarray to make the sum equals to 0.
      Constraints:
    1 <= arr.length <= 105
    -104 <= arr[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, -2, 0, 3};
        int expected = 4;
        var result = solution.maximumSum(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, -2, -2, 3};
        int expected = 3;
        var result = solution.maximumSum(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{-1, -1, -1, -1};
        int expected = -1;
        var result = solution.maximumSum(arr);
        assertThat(result).isEqualTo(expected);
    }

}
