package com.blogspot.ostas.leetcode.all.easy.maximum_count_of_positive_integer_and_negative_integer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [-2,-1,-1,1,2,3]
    Output: 3
    Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
    Example 2:
    Input: nums = [-3,-2,-1,0,0,1,2]
    Output: 3
    Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
    Example 3:
    Input: nums = [5,20,66,1314]
    Output: 4
    Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.
      Constraints:
    1 <= nums.length <= 2000
    -2000 <= nums[i] <= 2000
    nums is sorted in a non-decreasing order.
      Follow up: Can you solve the problem in O(log(n)) time complexity?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{-2, -1, -1, 1, 2, 3};
        int expected = 3;
        var result = solution.maximumCount(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-3, -2, -1, 0, 0, 1, 2};
        int expected = 3;
        var result = solution.maximumCount(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{5, 20, 66, 1314};
        int expected = 4;
        var result = solution.maximumCount(nums);
        assertThat(result).isEqualTo(expected);
    }

}
