package com.blogspot.ostas.leetcode.all.medium.array_nesting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,4,0,3,1,6,2]
    Output: 4
    Explanation:
    nums[0] = 5, nums[1] = 4, nums[2] = 0, nums[3] = 3, nums[4] = 1, nums[5] = 6, nums[6] = 2.
    One of the longest sets s[k]:
    s[0] = {nums[0], nums[5], nums[6], nums[2]} = {5, 6, 2, 0}
    Example 2:
    Input: nums = [0,1,2]
    Output: 1
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] < nums.length
    All the values of nums are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, 4, 0, 3, 1, 6, 2};
        int expected = 4;
        var result = solution.arrayNesting(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 2};
        int expected = 1;
        var result = solution.arrayNesting(nums);
        assertThat(result).isEqualTo(expected);
    }

}
