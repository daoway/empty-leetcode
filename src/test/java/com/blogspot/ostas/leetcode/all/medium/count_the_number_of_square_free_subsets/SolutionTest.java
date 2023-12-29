package com.blogspot.ostas.leetcode.all.medium.count_the_number_of_square_free_subsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,4,4,5]
    Output: 3
    Explanation: There are 3 square-free subsets in this example:
    - The subset consisting of the 0th element [3]. The product of its elements is 3, which is a square-free integer.
    - The subset consisting of the 3rd element [5]. The product of its elements is 5, which is a square-free integer.
    - The subset consisting of 0th and 3rd elements [3,5]. The product of its elements is 15, which is a square-free integer.
    It can be proven that there are no more than 3 square-free subsets in the given array.
    Example 2:
    Input: nums = [1]
    Output: 1
    Explanation: There is 1 square-free subset in this example:
    - The subset consisting of the 0th element [1]. The product of its elements is 1, which is a square-free integer.
    It can be proven that there is no more than 1 square-free subset in the given array.
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i] <= 30
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 4, 4, 5};
        int expected = 3;
        var result = solution.squareFreeSubsets(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        int expected = 1;
        var result = solution.squareFreeSubsets(nums);
        assertThat(result).isEqualTo(expected);
    }

}
