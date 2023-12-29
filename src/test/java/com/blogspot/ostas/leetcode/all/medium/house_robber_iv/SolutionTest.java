package com.blogspot.ostas.leetcode.all.medium.house_robber_iv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,5,9], k = 2
    Output: 5
    Explanation:
    There are three ways to rob at least 2 houses:
    - Rob the houses at indices 0 and 2. Capability is max(nums[0], nums[2]) = 5.
    - Rob the houses at indices 0 and 3. Capability is max(nums[0], nums[3]) = 9.
    - Rob the houses at indices 1 and 3. Capability is max(nums[1], nums[3]) = 9.
    Therefore, we return min(5, 9, 9) = 5.
    Example 2:
    Input: nums = [2,7,9,3,1], k = 2
    Output: 2
    Explanation: There are 7 ways to rob the houses. The way which leads to minimum capability is to rob the house at index 0 and 4. Return max(nums[0], nums[4]) = 2.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    1 <= k <= (nums.length + 1)/2
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 5, 9};
        int k = 2;
        int expected = 5;
        var result = solution.minCapability(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 7, 9, 3, 1};
        int k = 2;
        int expected = 2;
        var result = solution.minCapability(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
