package com.blogspot.ostas.leetcode.all.hard.maximum_and_sum_of_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4,5,6], numSlots = 3
    Output: 9
    Explanation: One possible placement is [1, 4] into slot 1, [2, 6] into slot 2, and [3, 5] into slot 3.
    This gives the maximum AND sum of (1 AND 1) + (4 AND 1) + (2 AND 2) + (6 AND 2) + (3 AND 3) + (5 AND 3) = 1 + 0 + 2 + 2 + 3 + 1 = 9.
    Example 2:
    Input: nums = [1,3,10,4,7,1], numSlots = 9
    Output: 24
    Explanation: One possible placement is [1, 1] into slot 1, [3] into slot 3, [4] into slot 4, [7] into slot 7, and [10] into slot 9.
    This gives the maximum AND sum of (1 AND 1) + (1 AND 1) + (3 AND 3) + (4 AND 4) + (7 AND 7) + (10 AND 9) = 1 + 1 + 3 + 4 + 7 + 8 = 24.
    Note that slots 2, 5, 6, and 8 are empty which is permitted.
      Constraints:
    n == nums.length
    1 <= numSlots <= 9
    1 <= n <= 2 * numSlots
    1 <= nums[i] <= 15
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int numSlots = 3;
        int expected = 9;
        var result = solution.maximumANDSum(nums, numSlots);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 10, 4, 7, 1};
        int numSlots = 9;
        int expected = 24;
        var result = solution.maximumANDSum(nums, numSlots);
        assertThat(result).isEqualTo(expected);
    }

}
