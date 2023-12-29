package com.blogspot.ostas.leetcode.all.hard.subarrays_with_k_different_integers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,1,2,3], k = 2
    Output: 7
    Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]
    Example 2:
    Input: nums = [1,2,1,3,4], k = 3
    Output: 3
    Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].
      Constraints:
    1 <= nums.length <= 2 * 104
    1 <= nums[i], k <= nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 2, 3};
        int k = 2;
        int expected = 7;
        var result = solution.subarraysWithKDistinct(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 3, 4};
        int k = 3;
        int expected = 3;
        var result = solution.subarraysWithKDistinct(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
