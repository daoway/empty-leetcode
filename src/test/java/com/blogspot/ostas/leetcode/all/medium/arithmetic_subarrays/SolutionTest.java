package com.blogspot.ostas.leetcode.all.medium.arithmetic_subarrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,6,5,9,3,7], l = [0,0,2], r = [2,3,5]
    Output: [true,false,true]
    Explanation:
    In the 0th query, the subarray is [4,6,5]. This can be rearranged as [6,5,4], which is an arithmetic sequence.
    In the 1st query, the subarray is [4,6,5,9]. This cannot be rearranged as an arithmetic sequence.
    In the 2nd query, the subarray is [5,9,3,7]. This can be rearranged as [3,5,7,9], which is an arithmetic sequence.
    Example 2:
    Input: nums = [-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10], l = [0,1,6,4,8,7], r = [4,4,9,7,9,10]
    Output: [false,true,false,false,true,true]
      Constraints:
    n == nums.length
    m == l.length
    m == r.length
    2 <= n <= 500
    1 <= m <= 500
    0 <= l[i] < r[i] < n
    -105 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 6, 5, 9, 3, 7};
        int[] l = new int[]{0, 0, 2};
        int[] r = new int[]{2, 3, 5};
        List<Boolean> expected = List.of(true, false, true);
        var result = solution.checkArithmeticSubarrays(nums, l, r);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10};
        int[] l = new int[]{0, 1, 6, 4, 8, 7};
        int[] r = new int[]{4, 4, 9, 7, 9, 10};
        List<Boolean> expected = List.of(false, true, false, false, true, true);
        var result = solution.checkArithmeticSubarrays(nums, l, r);
        assertThat(result).isEqualTo(expected);
    }

}
