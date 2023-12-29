package com.blogspot.ostas.leetcode.all.medium.maximize_greatness_of_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,5,2,1,3,1]
    Output: 4
    Explanation: One of the optimal rearrangements is perm = [2,5,1,3,3,1,1].
    At indices = 0, 1, 3, and 4, perm[i] > nums[i]. Hence, we return 4.
    Example 2:
    Input: nums = [1,2,3,4]
    Output: 3
    Explanation: We can prove the optimal perm is [2,3,4,1].
    At indices = 0, 1, and 2, perm[i] > nums[i]. Hence, we return 3.
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 5, 2, 1, 3, 1};
        int expected = 4;
        var result = solution.maximizeGreatness(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = 3;
        var result = solution.maximizeGreatness(nums);
        assertThat(result).isEqualTo(expected);
    }

}
