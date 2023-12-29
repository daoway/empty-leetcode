package com.blogspot.ostas.leetcode.all.medium.find_the_duplicate_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,4,2,2]
    Output: 2
    Example 2:
    Input: nums = [3,1,3,4,2]
    Output: 3
      Constraints:
    1 <= n <= 105
    nums.length == n + 1
    1 <= nums[i] <= n
    All the integers in nums appear only once except for precisely one integer which appears two or more times.
      Follow up:
    How can we prove that at least one duplicate number must exist in nums?
    Can you solve the problem in linear runtime complexity?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 4, 2, 2};
        int expected = 2;
        var result = solution.findDuplicate(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1, 3, 4, 2};
        int expected = 3;
        var result = solution.findDuplicate(nums);
        assertThat(result).isEqualTo(expected);
    }

}
