package com.blogspot.ostas.leetcode.all.medium.find_the_minimum_possible_sum_of_a_beautiful_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, target = 3
    Output: 4
    Explanation: We can see that nums = [1,3] is beautiful.
    - The array nums has length n = 2.
    - The array nums consists of pairwise distinct positive integers.
    - There doesn't exist two distinct indices, i and j, with nums[i] + nums[j] == 3.
    It can be proven that 4 is the minimum possible sum that a beautiful array could have.
    Example 2:
    Input: n = 3, target = 3
    Output: 8
    Explanation: We can see that nums = [1,3,4] is beautiful.
    - The array nums has length n = 3.
    - The array nums consists of pairwise distinct positive integers.
    - There doesn't exist two distinct indices, i and j, with nums[i] + nums[j] == 3.
    It can be proven that 8 is the minimum possible sum that a beautiful array could have.
    Example 3:
    Input: n = 1, target = 1
    Output: 1
    Explanation: We can see, that nums = [1] is beautiful.
      Constraints:
    1 <= n <= 109
    1 <= target <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int target = 3;
        int expected = 4;
        var result = solution.minimumPossibleSum(n, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int target = 3;
        int expected = 8;
        var result = solution.minimumPossibleSum(n, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 1;
        int target = 1;
        int expected = 1;
        var result = solution.minimumPossibleSum(n, target);
        assertThat(result).isEqualTo(expected);
    }

}
