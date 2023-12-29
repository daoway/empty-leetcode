package com.blogspot.ostas.leetcode.all.easy.largest_perimeter_triangle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,1,2]
    Output: 5
    Explanation: You can form a triangle with three side lengths: 1, 2, and 2.
    Example 2:
    Input: nums = [1,2,1,10]
    Output: 0
    Explanation:
    You cannot use the side lengths 1, 1, and 2 to form a triangle.
    You cannot use the side lengths 1, 1, and 10 to form a triangle.
    You cannot use the side lengths 1, 2, and 10 to form a triangle.
    As we cannot use any three side lengths to form a triangle of non-zero area, we return 0.
      Constraints:
    3 <= nums.length <= 104
    1 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 2};
        int expected = 5;
        var result = solution.largestPerimeter(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 10};
        int expected = 0;
        var result = solution.largestPerimeter(nums);
        assertThat(result).isEqualTo(expected);
    }

}
