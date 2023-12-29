package com.blogspot.ostas.leetcode.all.easy.build_array_from_permutation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [0,2,1,5,3,4]
    Output: [0,1,2,4,5,3]
    Explanation: The array ans is built as follows:
    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
    Example 2:
    Input: nums = [5,0,1,2,3,4]
    Output: [4,5,0,1,2,3]
    Explanation: The array ans is built as follows:
    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
      Constraints:
    1 <= nums.length <= 1000
    0 <= nums[i] < nums.length
    The elements in nums are distinct.
      Follow-up: Can you solve it without using an extra space (i.e., O(1) memory)?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{0, 2, 1, 5, 3, 4};
        int[] expected = new int[]{0, 1, 2, 4, 5, 3};
        var result = solution.buildArray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 0, 1, 2, 3, 4};
        int[] expected = new int[]{4, 5, 0, 1, 2, 3};
        var result = solution.buildArray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
