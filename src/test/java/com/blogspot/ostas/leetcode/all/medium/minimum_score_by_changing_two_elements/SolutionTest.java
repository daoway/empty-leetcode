package com.blogspot.ostas.leetcode.all.medium.minimum_score_by_changing_two_elements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,4,3]
    Output: 0
    Explanation: Change value of nums[1] and nums[2] to 1 so that nums becomes [1,1,1]. Now, the value of |nums[i] - nums[j]| is always equal to 0, so we return 0 + 0 = 0.
    Example 2:
    Input: nums = [1,4,7,8,5]
    Output: 3
    Explanation: Change nums[0] and nums[1] to be 6. Now nums becomes [6,6,7,8,5].
    Our low score is achieved when i = 0 and j = 1, in which case |nums[i] - nums[j]| = |6 - 6| = 0.
    Our high score is achieved when i = 3 and j = 4, in which case |nums[i] - nums[j]| = |8 - 5| = 3.
    The sum of our high and low score is 3, which we can prove to be minimal.
      Constraints:
    3 <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 4, 3};
        int expected = 0;
        var result = solution.minimizeSum(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 4, 7, 8, 5};
        int expected = 3;
        var result = solution.minimizeSum(nums);
        assertThat(result).isEqualTo(expected);
    }

}
