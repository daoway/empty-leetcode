package com.blogspot.ostas.leetcode.all.hard.make_the_xor_of_all_segments_equal_to_zero;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,0,3,0], k = 1
    Output: 3
    Explanation: Modify the array from [1,2,0,3,0] to from [0,0,0,0,0].
    Example 2:
    Input: nums = [3,4,5,2,1,7,3,4,7], k = 3
    Output: 3
    Explanation: Modify the array from [3,4,5,2,1,7,3,4,7] to [3,4,7,3,4,7,3,4,7].
    Example 3:
    Input: nums = [1,2,4,1,2,5,1,2,6], k = 3
    Output: 3
    Explanation: Modify the array from [1,2,4,1,2,5,1,2,6] to [1,2,3,1,2,3,1,2,3].
      Constraints:
    1 <= k <= nums.length <= 2000
    0 <= nums[i] < 210
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 0, 3, 0};
        int k = 1;
        int expected = 3;
        var result = solution.minChanges(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 4, 5, 2, 1, 7, 3, 4, 7};
        int k = 3;
        int expected = 3;
        var result = solution.minChanges(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 4, 1, 2, 5, 1, 2, 6};
        int k = 3;
        int expected = 3;
        var result = solution.minChanges(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
