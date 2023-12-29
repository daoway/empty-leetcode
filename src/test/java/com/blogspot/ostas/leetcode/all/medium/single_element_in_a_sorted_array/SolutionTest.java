package com.blogspot.ostas.leetcode.all.medium.single_element_in_a_sorted_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,2,3,3,4,4,8,8]
    Output: 2
    Example 2:
    Input: nums = [3,3,7,7,10,11,11]
    Output: 10
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        int expected = 2;
        var result = solution.singleNonDuplicate(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 3, 7, 7, 10, 11, 11};
        int expected = 10;
        var result = solution.singleNonDuplicate(nums);
        assertThat(result).isEqualTo(expected);
    }

}
