package com.blogspot.ostas.leetcode.all.medium.count_the_number_of_beautiful_subarrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,3,1,2,4]
    Output: 2
    Explanation: There are 2 beautiful subarrays in nums: [4,3,1,2,4] and [4,3,1,2,4].
    - We can make all elements in the subarray [3,1,2] equal to 0 in the following way:
      - Choose [3, 1, 2] and k = 1. Subtract 21 from both numbers. The subarray becomes [1, 1, 0].
      - Choose [1, 1, 0] and k = 0. Subtract 20 from both numbers. The subarray becomes [0, 0, 0].
    - We can make all elements in the subarray [4,3,1,2,4] equal to 0 in the following way:
      - Choose [4, 3, 1, 2, 4] and k = 2. Subtract 22 from both numbers. The subarray becomes [0, 3, 1, 2, 0].
      - Choose [0, 3, 1, 2, 0] and k = 0. Subtract 20 from both numbers. The subarray becomes [0, 2, 0, 2, 0].
      - Choose [0, 2, 0, 2, 0] and k = 1. Subtract 21 from both numbers. The subarray becomes [0, 0, 0, 0, 0].
    Example 2:
    Input: nums = [1,10,4]
    Output: 0
    Explanation: There are no beautiful subarrays in nums.
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 3, 1, 2, 4};
        long expected = 2;
        var result = solution.beautifulSubarrays(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 10, 4};
        long expected = 0;
        var result = solution.beautifulSubarrays(nums);
        assertThat(result).isEqualTo(expected);
    }

}
