package com.blogspot.ostas.leetcode.all.medium.number_of_ways_to_split_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [10,4,-8,7]
    Output: 2
    Explanation:
    There are three ways of splitting nums into two non-empty parts:
    - Split nums at index 0. Then, the first part is [10], and its sum is 10. The second part is [4,-8,7], and its sum is 3. Since 10 >= 3, i = 0 is a valid split.
    - Split nums at index 1. Then, the first part is [10,4], and its sum is 14. The second part is [-8,7], and its sum is -1. Since 14 >= -1, i = 1 is a valid split.
    - Split nums at index 2. Then, the first part is [10,4,-8], and its sum is 6. The second part is [7], and its sum is 7. Since 6 < 7, i = 2 is not a valid split.
    Thus, the number of valid splits in nums is 2.
    Example 2:
    Input: nums = [2,3,1,0]
    Output: 2
    Explanation:
    There are two valid splits in nums:
    - Split nums at index 1. Then, the first part is [2,3], and its sum is 5. The second part is [1,0], and its sum is 1. Since 5 >= 1, i = 1 is a valid split.
    - Split nums at index 2. Then, the first part is [2,3,1], and its sum is 6. The second part is [0], and its sum is 0. Since 6 >= 0, i = 2 is a valid split.
      Constraints:
    2 <= nums.length <= 105
    -105 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{10, 4, -8, 7};
        int expected = 2;
        var result = solution.waysToSplitArray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 1, 0};
        int expected = 2;
        var result = solution.waysToSplitArray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
