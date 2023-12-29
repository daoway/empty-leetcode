package com.blogspot.ostas.leetcode.all.medium.smallest_subarrays_with_maximum_bitwise_or;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,0,2,1,3]
    Output: [3,3,2,2,1]
    Explanation:
    The maximum possible bitwise OR starting at any index is 3.
    - Starting at index 0, the shortest subarray that yields it is [1,0,2].
    - Starting at index 1, the shortest subarray that yields the maximum bitwise OR is [0,2,1].
    - Starting at index 2, the shortest subarray that yields the maximum bitwise OR is [2,1].
    - Starting at index 3, the shortest subarray that yields the maximum bitwise OR is [1,3].
    - Starting at index 4, the shortest subarray that yields the maximum bitwise OR is [3].
    Therefore, we return [3,3,2,2,1].
    Example 2:
    Input: nums = [1,2]
    Output: [2,1]
    Explanation:
    Starting at index 0, the shortest subarray that yields the maximum bitwise OR is of length 2.
    Starting at index 1, the shortest subarray that yields the maximum bitwise OR is of length 1.
    Therefore, we return [2,1].
      Constraints:
    n == nums.length
    1 <= n <= 105
    0 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 0, 2, 1, 3};
        int[] expected = new int[]{3, 3, 2, 2, 1};
        var result = solution.smallestSubarrays(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2};
        int[] expected = new int[]{2, 1};
        var result = solution.smallestSubarrays(nums);
        assertThat(result).isEqualTo(expected);
    }

}
