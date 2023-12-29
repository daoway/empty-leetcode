package com.blogspot.ostas.leetcode.all.medium.top_k_frequent_elements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,1,2,2,3], k = 2
    Output: [1,2]
    Example 2:
    Input: nums = [1], k = 1
    Output: [1]
      Constraints:
    1 <= nums.length <= 105
    -104 <= nums[i] <= 104
    k is in the range [1, the number of unique elements in the array].
    It is guaranteed that the answer is unique.
      Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = new int[]{1, 2};
        var result = solution.topKFrequent(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        int k = 1;
        int[] expected = new int[]{1};
        var result = solution.topKFrequent(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
