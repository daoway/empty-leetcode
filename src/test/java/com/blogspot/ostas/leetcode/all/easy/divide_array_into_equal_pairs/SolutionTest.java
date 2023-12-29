package com.blogspot.ostas.leetcode.all.easy.divide_array_into_equal_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,2,3,2,2,2]
    Output: true
    Explanation:
    There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
    If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.
    Example 2:
    Input: nums = [1,2,3,4]
    Output: false
    Explanation:
    There is no way to divide nums into 4 / 2 = 2 pairs such that the pairs satisfy every condition.
      Constraints:
    nums.length == 2 * n
    1 <= n <= 500
    1 <= nums[i] <= 500
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 3, 2, 2, 2};
        boolean expected = true;
        var result = solution.divideArray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        boolean expected = false;
        var result = solution.divideArray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
