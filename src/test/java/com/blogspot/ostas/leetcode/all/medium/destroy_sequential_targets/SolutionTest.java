package com.blogspot.ostas.leetcode.all.medium.destroy_sequential_targets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,7,8,1,1,5], space = 2
    Output: 1
    Explanation: If we seed the machine with nums[3], then we destroy all targets equal to 1,3,5,7,9,...
    In this case, we would destroy 5 total targets (all except for nums[2]).
    It is impossible to destroy more than 5 targets, so we return nums[3].
    Example 2:
    Input: nums = [1,3,5,2,4,6], space = 2
    Output: 1
    Explanation: Seeding the machine with nums[0], or nums[3] destroys 3 targets.
    It is not possible to destroy more than 3 targets.
    Since nums[0] is the minimal integer that can destroy 3 targets, we return 1.
    Example 3:
    Input: nums = [6,2,5], space = 100
    Output: 2
    Explanation: Whatever initial seed we select, we can only destroy 1 target. The minimal seed is nums[1].
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    1 <= space <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 7, 8, 1, 1, 5};
        int space = 2;
        int expected = 1;
        var result = solution.destroyTargets(nums, space);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 5, 2, 4, 6};
        int space = 2;
        int expected = 1;
        var result = solution.destroyTargets(nums, space);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{6, 2, 5};
        int space = 100;
        int expected = 2;
        var result = solution.destroyTargets(nums, space);
        assertThat(result).isEqualTo(expected);
    }

}
