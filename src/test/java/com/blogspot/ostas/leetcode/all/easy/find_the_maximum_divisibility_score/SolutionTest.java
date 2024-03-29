package com.blogspot.ostas.leetcode.all.easy.find_the_maximum_divisibility_score;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,7,9,3,9], divisors = [5,2,3]
    Output: 3
    Explanation: The divisibility score for every element in divisors is:
    The divisibility score of divisors[0] is 0 since no number in nums is divisible by 5.
    The divisibility score of divisors[1] is 1 since nums[0] is divisible by 2.
    The divisibility score of divisors[2] is 3 since nums[2], nums[3], and nums[4] are divisible by 3.
    Since divisors[2] has the maximum divisibility score, we return it.
    Example 2:
    Input: nums = [20,14,21,10], divisors = [5,7,5]
    Output: 5
    Explanation: The divisibility score for every element in divisors is:
    The divisibility score of divisors[0] is 2 since nums[0] and nums[3] are divisible by 5.
    The divisibility score of divisors[1] is 2 since nums[1] and nums[2] are divisible by 7.
    The divisibility score of divisors[2] is 2 since nums[0] and nums[3] are divisible by 5.
    Since divisors[0], divisors[1], and divisors[2] all have the maximum divisibility score, we return the minimum of them (i.e., divisors[2]).
    Example 3:
    Input: nums = [12], divisors = [10,16]
    Output: 10
    Explanation: The divisibility score for every element in divisors is:
    The divisibility score of divisors[0] is 0 since no number in nums is divisible by 10.
    The divisibility score of divisors[1] is 0 since no number in nums is divisible by 16.
    Since divisors[0] and divisors[1] both have the maximum divisibility score, we return the minimum of them (i.e., divisors[0]).
      Constraints:
    1 <= nums.length, divisors.length <= 1000
    1 <= nums[i], divisors[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 7, 9, 3, 9};
        int[] divisors = new int[]{5, 2, 3};
        int expected = 3;
        var result = solution.maxDivScore(nums, divisors);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{20, 14, 21, 10};
        int[] divisors = new int[]{5, 7, 5};
        int expected = 5;
        var result = solution.maxDivScore(nums, divisors);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{12};
        int[] divisors = new int[]{10, 16};
        int expected = 10;
        var result = solution.maxDivScore(nums, divisors);
        assertThat(result).isEqualTo(expected);
    }

}
