package com.blogspot.ostas.leetcode.all.easy.shuffle_the_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7]
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
    Example 2:
    Input: nums = [1,2,3,4,4,3,2,1], n = 4
    Output: [1,4,2,3,3,2,4,1]
    Example 3:
    Input: nums = [1,1,2,2], n = 2
    Output: [1,2,1,2]
      Constraints:
    1 <= n <= 500
    nums.length == 2n
    1 <= nums[i] <= 10^3
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] expected = new int[]{2, 3, 5, 4, 1, 7};
        var result = solution.shuffle(nums, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] expected = new int[]{1, 4, 2, 3, 3, 2, 4, 1};
        var result = solution.shuffle(nums, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 2, 2};
        int n = 2;
        int[] expected = new int[]{1, 2, 1, 2};
        var result = solution.shuffle(nums, n);
        assertThat(result).isEqualTo(expected);
    }

}
