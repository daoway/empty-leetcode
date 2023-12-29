package com.blogspot.ostas.leetcode.all.medium.next_greater_element_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,1]
    Output: [2,-1,2]
    Explanation: The first 1's next greater number is 2;
    The number 2 can't find next greater number.
    The second 1's next greater number needs to search circularly, which is also 2.
    Example 2:
    Input: nums = [1,2,3,4,3]
    Output: [2,3,4,-1,4]
      Constraints:
    1 <= nums.length <= 104
    -109 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1};
        int[] expected = new int[]{2, -1, 2};
        var result = solution.nextGreaterElements(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 3};
        int[] expected = new int[]{2, 3, 4, -1, 4};
        var result = solution.nextGreaterElements(nums);
        assertThat(result).isEqualTo(expected);
    }

}
