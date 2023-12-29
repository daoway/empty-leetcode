package com.blogspot.ostas.leetcode.all.medium.maximum_or;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [12,9], k = 1
    Output: 30
    Explanation: If we apply the operation to index 1, our new array nums will be equal to [12,18]. Thus, we return the bitwise or of 12 and 18, which is 30.
    Example 2:
    Input: nums = [8,1,2], k = 2
    Output: 35
    Explanation: If we apply the operation twice on index 0, we yield a new array of [32,1,2]. Thus, we return 32|1|2 = 35.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    1 <= k <= 15
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{12, 9};
        int k = 1;
        long expected = 30;
        var result = solution.maximumOr(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{8, 1, 2};
        int k = 2;
        long expected = 35;
        var result = solution.maximumOr(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
