package com.blogspot.ostas.leetcode.all.easy.find_all_numbers_disappeared_in_an_array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,3,2,7,8,2,3,1]
    Output: [5,6]
    Example 2:
    Input: nums = [1,1]
    Output: [2]
      Constraints:
    n == nums.length
    1 <= n <= 105
    1 <= nums[i] <= n
      Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = List.of(5, 6);
        var result = solution.findDisappearedNumbers(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1};
        List<Integer> expected = List.of(2);
        var result = solution.findDisappearedNumbers(nums);
        assertThat(result).isEqualTo(expected);
    }

}
