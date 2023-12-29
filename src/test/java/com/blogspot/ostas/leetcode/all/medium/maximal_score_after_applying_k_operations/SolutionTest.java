package com.blogspot.ostas.leetcode.all.medium.maximal_score_after_applying_k_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [10,10,10,10,10], k = 5
    Output: 50
    Explanation: Apply the operation to each array element exactly once. The final score is 10 + 10 + 10 + 10 + 10 = 50.
    Example 2:
    Input: nums = [1,10,3,3,3], k = 3
    Output: 17
    Explanation: You can do the following operations:
    Operation 1: Select i = 1, so nums becomes [1,4,3,3,3]. Your score increases by 10.
    Operation 2: Select i = 1, so nums becomes [1,2,3,3,3]. Your score increases by 4.
    Operation 3: Select i = 2, so nums becomes [1,1,1,3,3]. Your score increases by 3.
    The final score is 10 + 4 + 3 = 17.
      Constraints:
    1 <= nums.length, k <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{10, 10, 10, 10, 10};
        int k = 5;
        long expected = 50;
        var result = solution.maxKelements(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 10, 3, 3, 3};
        int k = 3;
        long expected = 17;
        var result = solution.maxKelements(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
