package com.blogspot.ostas.leetcode.all.hard.sliding_window_median;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
    Output: [1.00000,-1.00000,-1.00000,3.00000,5.00000,6.00000]
    Explanation:
    Window position                Median
    ---------------                -----
    [1  3  -1] -3  5  3  6  7        1
     1 [3  -1  -3] 5  3  6  7       -1
     1  3 [-1  -3  5] 3  6  7       -1
     1  3  -1 [-3  5  3] 6  7        3
     1  3  -1  -3 [5  3  6] 7        5
     1  3  -1  -3  5 [3  6  7]       6
    Example 2:
    Input: nums = [1,2,3,4,2,3,1,4,2], k = 3
    Output: [2.00000,3.00000,3.00000,3.00000,2.00000,3.00000,2.00000]
      Constraints:
    1 <= k <= nums.length <= 105
    -231 <= nums[i] <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        double[] expected = new double[]{1.00000, -1.00000, -1.00000, 3.00000, 5.00000, 6.00000};
        var result = solution.medianSlidingWindow(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 2, 3, 1, 4, 2};
        int k = 3;
        double[] expected =
                new double[]{2.00000, 3.00000, 3.00000, 3.00000, 2.00000, 3.00000, 2.00000};
        var result = solution.medianSlidingWindow(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
