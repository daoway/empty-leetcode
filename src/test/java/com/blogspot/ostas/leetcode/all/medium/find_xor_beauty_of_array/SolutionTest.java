package com.blogspot.ostas.leetcode.all.medium.find_xor_beauty_of_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,4]
    Output: 5
    Explanation:
    The triplets and their corresponding effective values are listed below:
    - (0,0,0) with effective value ((1 | 1) & 1) = 1
    - (0,0,1) with effective value ((1 | 1) & 4) = 0
    - (0,1,0) with effective value ((1 | 4) & 1) = 1
    - (0,1,1) with effective value ((1 | 4) & 4) = 4
    - (1,0,0) with effective value ((4 | 1) & 1) = 1
    - (1,0,1) with effective value ((4 | 1) & 4) = 4
    - (1,1,0) with effective value ((4 | 4) & 1) = 0
    - (1,1,1) with effective value ((4 | 4) & 4) = 4
    Xor-beauty of array will be bitwise XOR of all beauties = 1 ^ 0 ^ 1 ^ 4 ^ 1 ^ 4 ^ 0 ^ 4 = 5.
    Example 2:
    Input: nums = [15,45,20,2,34,35,5,44,32,30]
    Output: 34
    Explanation: The xor-beauty of the given array is 34.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 4};
        int expected = 5;
        var result = solution.xorBeauty(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{15, 45, 20, 2, 34, 35, 5, 44, 32, 30};
        int expected = 34;
        var result = solution.xorBeauty(nums);
        assertThat(result).isEqualTo(expected);
    }

}
