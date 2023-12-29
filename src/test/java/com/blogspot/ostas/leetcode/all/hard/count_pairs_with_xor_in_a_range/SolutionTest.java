package com.blogspot.ostas.leetcode.all.hard.count_pairs_with_xor_in_a_range;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,4,2,7], low = 2, high = 6
    Output: 6
    Explanation: All nice pairs (i, j) are as follows:
    - (0, 1): nums[0] XOR nums[1] = 5
    - (0, 2): nums[0] XOR nums[2] = 3
    - (0, 3): nums[0] XOR nums[3] = 6
    - (1, 2): nums[1] XOR nums[2] = 6
    - (1, 3): nums[1] XOR nums[3] = 3
    - (2, 3): nums[2] XOR nums[3] = 5
    Example 2:
    Input: nums = [9,8,4,2,1], low = 5, high = 14
    Output: 8
    Explanation: All nice pairs (i, j) are as follows:
    - (0, 2): nums[0] XOR nums[2] = 13
    - (0, 3): nums[0] XOR nums[3] = 11
    - (0, 4): nums[0] XOR nums[4] = 8
    - (1, 2): nums[1] XOR nums[2] = 12
    - (1, 3): nums[1] XOR nums[3] = 10
    - (1, 4): nums[1] XOR nums[4] = 9
    - (2, 3): nums[2] XOR nums[3] = 6
    - (2, 4): nums[2] XOR nums[4] = 5
      Constraints:
    1 <= nums.length <= 2 * 104
    1 <= nums[i] <= 2 * 104
    1 <= low <= high <= 2 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 4, 2, 7};
        int low = 2;
        int high = 6;
        int expected = 6;
        var result = solution.countPairs(nums, low, high);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{9, 8, 4, 2, 1};
        int low = 5;
        int high = 14;
        int expected = 8;
        var result = solution.countPairs(nums, low, high);
        assertThat(result).isEqualTo(expected);
    }

}
