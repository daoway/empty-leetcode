package com.blogspot.ostas.leetcode.all.medium.sorting_three_groups;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,1,3,2,1]
    Output: 3
    Explanation: It's optimal to perform three operations:
    1. change nums[0] to 1.
    2. change nums[2] to 1.
    3. change nums[3] to 1.
    After performing the operations and sorting the numbers in each group, group 1 becomes equal to [0,1,2,3,4] and group 2 and group 3 become empty. Hence, res is equal to [0,1,2,3,4] which is sorted in non-decreasing order.
    It can be proven that there is no valid sequence of less than three operations.
    Example 2:
    Input: nums = [1,3,2,1,3,3]
    Output: 2
    Explanation: It's optimal to perform two operations:
    1. change nums[1] to 1.
    2. change nums[2] to 1.
    After performing the operations and sorting the numbers in each group, group 1 becomes equal to [0,1,2,3], group 2 becomes empty, and group 3 becomes equal to [4,5]. Hence, res is equal to [0,1,2,3,4,5] which is sorted in non-decreasing order.
    It can be proven that there is no valid sequence of less than two operations.
    Example 3:
    Input: nums = [2,2,2,2,3,3]
    Output: 0
    Explanation: It's optimal to not perform operations.
    After sorting the numbers in each group, group 1 becomes empty, group 2 becomes equal to [0,1,2,3] and group 3 becomes equal to [4,5]. Hence, res is equal to [0,1,2,3,4,5] which is sorted in non-decreasing order.
      Constraints:
    1 <= nums.length <= 100
    1 <= nums[i] <= 3
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> nums = List.of(2, 1, 3, 2, 1);
        int expected = 3;
        var result = solution.minimumOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 3, 2, 1, 3, 3);
        int expected = 2;
        var result = solution.minimumOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<Integer> nums = List.of(2, 2, 2, 2, 3, 3);
        int expected = 0;
        var result = solution.minimumOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

}
