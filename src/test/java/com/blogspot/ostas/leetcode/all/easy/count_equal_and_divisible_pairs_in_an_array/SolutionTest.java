package com.blogspot.ostas.leetcode.all.easy.count_equal_and_divisible_pairs_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,1,2,2,2,1,3], k = 2
    Output: 4
    Explanation:
    There are 4 pairs that meet all the requirements:
    - nums[0] == nums[6], and 0 * 6 == 0, which is divisible by 2.
    - nums[2] == nums[3], and 2 * 3 == 6, which is divisible by 2.
    - nums[2] == nums[4], and 2 * 4 == 8, which is divisible by 2.
    - nums[3] == nums[4], and 3 * 4 == 12, which is divisible by 2.
    Example 2:
    Input: nums = [1,2,3,4], k = 1
    Output: 0
    Explanation: Since no value in nums is repeated, there are no pairs (i,j) that meet all the requirements.
      Constraints:
    1 <= nums.length <= 100
    1 <= nums[i], k <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1, 2, 2, 2, 1, 3};
        int k = 2;
        int expected = 4;
        var result = solution.countPairs(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int k = 1;
        int expected = 0;
        var result = solution.countPairs(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
