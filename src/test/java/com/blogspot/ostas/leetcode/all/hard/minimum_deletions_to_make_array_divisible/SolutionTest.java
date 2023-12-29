package com.blogspot.ostas.leetcode.all.hard.minimum_deletions_to_make_array_divisible;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,2,4,3], numsDivide = [9,6,9,3,15]
    Output: 2
    Explanation:
    The smallest element in [2,3,2,4,3] is 2, which does not divide all the elements of numsDivide.
    We use 2 deletions to delete the elements in nums that are equal to 2 which makes nums = [3,4,3].
    The smallest element in [3,4,3] is 3, which divides all the elements of numsDivide.
    It can be shown that 2 is the minimum number of deletions needed.
    Example 2:
    Input: nums = [4,3,6], numsDivide = [8,2,6,10]
    Output: -1
    Explanation:
    We want the smallest element in nums to divide all the elements of numsDivide.
    There is no way to delete elements from nums to allow this.
      Constraints:
    1 <= nums.length, numsDivide.length <= 105
    1 <= nums[i], numsDivide[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 2, 4, 3};
        int[] numsDivide = new int[]{9, 6, 9, 3, 15};
        int expected = 2;
        var result = solution.minOperations(nums, numsDivide);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 3, 6};
        int[] numsDivide = new int[]{8, 2, 6, 10};
        int expected = -1;
        var result = solution.minOperations(nums, numsDivide);
        assertThat(result).isEqualTo(expected);
    }

}
