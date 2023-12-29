package com.blogspot.ostas.leetcode.all.medium.remove_duplicates_from_sorted_array_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,1,2,2,3]
    Output: 5, nums = [1,1,2,2,3,_]
    Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).
    Example 2:
    Input: nums = [0,0,1,1,1,1,2,3,3]
    Output: 7, nums = [0,0,1,1,2,3,3,_,_]
    Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).
      Constraints:
    1 <= nums.length <= 3 * 104
    -104 <= nums[i] <= 104
    nums is sorted in non-decreasing order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int expected = 5;
        var result = solution.removeDuplicates(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        int expected = 7;
        var result = solution.removeDuplicates(nums);
        assertThat(result).isEqualTo(expected);
    }

}
