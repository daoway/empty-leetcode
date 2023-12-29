package com.blogspot.ostas.leetcode.all.easy.maximum_sum_with_exactly_k_elements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4,5], k = 3
    Output: 18
    Explanation: We need to choose exactly 3 elements from nums to maximize the sum.
    For the first iteration, we choose 5. Then sum is 5 and nums = [1,2,3,4,6]
    For the second iteration, we choose 6. Then sum is 5 + 6 and nums = [1,2,3,4,7]
    For the third iteration, we choose 7. Then sum is 5 + 6 + 7 = 18 and nums = [1,2,3,4,8]
    So, we will return 18.
    It can be proven, that 18 is the maximum answer that we can achieve.
    Example 2:
    Input: nums = [5,5,5], k = 2
    Output: 11
    Explanation: We need to choose exactly 2 elements from nums to maximize the sum.
    For the first iteration, we choose 5. Then sum is 5 and nums = [5,5,6]
    For the second iteration, we choose 6. Then sum is 5 + 6 = 11 and nums = [5,5,7]
    So, we will return 11.
    It can be proven, that 11 is the maximum answer that we can achieve.
      Constraints:
    1 <= nums.length <= 100
    1 <= nums[i] <= 100
    1 <= k <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 3;
        int expected = 18;
        var result = solution.maximizeSum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 5, 5};
        int k = 2;
        int expected = 11;
        var result = solution.maximizeSum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
