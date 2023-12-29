package com.blogspot.ostas.leetcode.all.easy.apply_operations_to_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,2,1,1,0]
    Output: [1,4,2,0,0,0]
    Explanation: We do the following operations:
    - i = 0: nums[0] and nums[1] are not equal, so we skip this operation.
    - i = 1: nums[1] and nums[2] are equal, we multiply nums[1] by 2 and change nums[2] to 0. The array becomes [1,4,0,1,1,0].
    - i = 2: nums[2] and nums[3] are not equal, so we skip this operation.
    - i = 3: nums[3] and nums[4] are equal, we multiply nums[3] by 2 and change nums[4] to 0. The array becomes [1,4,0,2,0,0].
    - i = 4: nums[4] and nums[5] are equal, we multiply nums[4] by 2 and change nums[5] to 0. The array becomes [1,4,0,2,0,0].
    After that, we shift the 0's to the end, which gives the array [1,4,2,0,0,0].
    Example 2:
    Input: nums = [0,1]
    Output: [1,0]
    Explanation: No operation can be applied, we just shift the 0 to the end.
      Constraints:
    2 <= nums.length <= 2000
    0 <= nums[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 2, 1, 1, 0};
        int[] expected = new int[]{1, 4, 2, 0, 0, 0};
        var result = solution.applyOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1};
        int[] expected = new int[]{1, 0};
        var result = solution.applyOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

}
