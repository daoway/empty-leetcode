package com.blogspot.ostas.leetcode.all.easy.binary_search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    /*
      Example 1:
    Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Explanation: 9 exists in nums and its index is 4
    Example 2:
    Input: nums = [-1,0,3,5,9,12], target = 2
    Output: -1
    Explanation: 2 does not exist in nums so return -1
      Constraints:
    1 <= nums.length <= 104
    -104 < nums[i], target < 104
    All the integers in nums are unique.
    nums is sorted in ascending order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expected = 4;
        var result = solution.search(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 2;
        int expected = -1;
        var result = solution.search(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
