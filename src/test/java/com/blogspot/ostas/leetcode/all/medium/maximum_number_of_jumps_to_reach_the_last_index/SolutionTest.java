package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_jumps_to_reach_the_last_index;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,6,4,1,2], target = 2
    Output: 3
    Explanation: To go from index 0 to index n - 1 with the maximum number of jumps, you can perform the following jumping sequence:
    - Jump from index 0 to index 1.
    - Jump from index 1 to index 3.
    - Jump from index 3 to index 5.
    It can be proven that there is no other jumping sequence that goes from 0 to n - 1 with more than 3 jumps. Hence, the answer is 3.
    Example 2:
    Input: nums = [1,3,6,4,1,2], target = 3
    Output: 5
    Explanation: To go from index 0 to index n - 1 with the maximum number of jumps, you can perform the following jumping sequence:
    - Jump from index 0 to index 1.
    - Jump from index 1 to index 2.
    - Jump from index 2 to index 3.
    - Jump from index 3 to index 4.
    - Jump from index 4 to index 5.
    It can be proven that there is no other jumping sequence that goes from 0 to n - 1 with more than 5 jumps. Hence, the answer is 5.
    Example 3:
    Input: nums = [1,3,6,4,1,2], target = 0
    Output: -1
    Explanation: It can be proven that there is no jumping sequence that goes from 0 to n - 1. Hence, the answer is -1.
      Constraints:
    2 <= nums.length == n <= 1000
    -109 <= nums[i] <= 109
    0 <= target <= 2 * 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 6, 4, 1, 2};
        int target = 2;
        int expected = 3;
        var result = solution.maximumJumps(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 6, 4, 1, 2};
        int target = 3;
        int expected = 5;
        var result = solution.maximumJumps(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 6, 4, 1, 2};
        int target = 0;
        int expected = -1;
        var result = solution.maximumJumps(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
