package com.blogspot.ostas.leetcode.all.hard.minimum_operations_to_form_subsequence_with_target_sum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,8], target = 7
    Output: 1
    Explanation: In the first operation, we choose element nums[2]. The array becomes equal to nums = [1,2,4,4].
    At this stage, nums contains the subsequence [1,2,4] which sums up to 7.
    It can be shown that there is no shorter sequence of operations that results in a subsequnce that sums up to 7.
    Example 2:
    Input: nums = [1,32,1,2], target = 12
    Output: 2
    Explanation: In the first operation, we choose element nums[1]. The array becomes equal to nums = [1,1,2,16,16].
    In the second operation, we choose element nums[3]. The array becomes equal to nums = [1,1,2,16,8,8]
    At this stage, nums contains the subsequence [1,1,2,8] which sums up to 12.
    It can be shown that there is no shorter sequence of operations that results in a subsequence that sums up to 12.
    Example 3:
    Input: nums = [1,32,1], target = 35
    Output: -1
    Explanation: It can be shown that no sequence of operations results in a subsequence that sums up to 35.
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i] <= 230
    nums consists only of non-negative powers of two.
    1 <= target < 231
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 2, 8);
        int target = 7;
        int expected = 1;
        var result = solution.minOperations(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 32, 1, 2);
        int target = 12;
        int expected = 2;
        var result = solution.minOperations(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 32, 1);
        int target = 35;
        int expected = -1;
        var result = solution.minOperations(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
