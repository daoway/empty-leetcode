package com.blogspot.ostas.leetcode.all.medium.find_the_score_of_all_prefixes_of_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,7,5,10]
    Output: [4,10,24,36,56]
    Explanation:
    For the prefix [2], the conversion array is [4] hence the score is 4
    For the prefix [2, 3], the conversion array is [4, 6] hence the score is 10
    For the prefix [2, 3, 7], the conversion array is [4, 6, 14] hence the score is 24
    For the prefix [2, 3, 7, 5], the conversion array is [4, 6, 14, 12] hence the score is 36
    For the prefix [2, 3, 7, 5, 10], the conversion array is [4, 6, 14, 12, 20] hence the score is 56
    Example 2:
    Input: nums = [1,1,2,4,8,16]
    Output: [2,4,8,16,32,64]
    Explanation:
    For the prefix [1], the conversion array is [2] hence the score is 2
    For the prefix [1, 1], the conversion array is [2, 2] hence the score is 4
    For the prefix [1, 1, 2], the conversion array is [2, 2, 4] hence the score is 8
    For the prefix [1, 1, 2, 4], the conversion array is [2, 2, 4, 8] hence the score is 16
    For the prefix [1, 1, 2, 4, 8], the conversion array is [2, 2, 4, 8, 16] hence the score is 32
    For the prefix [1, 1, 2, 4, 8, 16], the conversion array is [2, 2, 4, 8, 16, 32] hence the score is 64
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 7, 5, 10};
        long[] expected = new long[]{4, 10, 24, 36, 56};
        var result = solution.findPrefixScore(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 2, 4, 8, 16};
        long[] expected = new long[]{2, 4, 8, 16, 32, 64};
        var result = solution.findPrefixScore(nums);
        assertThat(result).isEqualTo(expected);
    }

}
