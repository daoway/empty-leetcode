package com.blogspot.ostas.leetcode.all.hard.split_the_array_to_make_coprime_products;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,7,8,15,3,5]
    Output: 2
    Explanation: The table above shows the values of the product of the first i + 1 elements, the remaining elements, and their gcd at each index i.
    The only valid split is at index 2.
    Example 2:
    Input: nums = [4,7,15,8,3,5]
    Output: -1
    Explanation: The table above shows the values of the product of the first i + 1 elements, the remaining elements, and their gcd at each index i.
    There is no valid split.
      Constraints:
    n == nums.length
    1 <= n <= 104
    1 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 7, 8, 15, 3, 5};
        int expected = 2;
        var result = solution.findValidSplit(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 7, 15, 8, 3, 5};
        int expected = -1;
        var result = solution.findValidSplit(nums);
        assertThat(result).isEqualTo(expected);
    }

}
