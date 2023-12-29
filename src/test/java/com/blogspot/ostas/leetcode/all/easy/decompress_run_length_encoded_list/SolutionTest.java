package com.blogspot.ostas.leetcode.all.easy.decompress_run_length_encoded_list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4]
    Output: [2,4,4,4]
    Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
    The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
    At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
    Example 2:
    Input: nums = [1,1,2,3]
    Output: [1,3,3]
      Constraints:
    2 <= nums.length <= 100
    nums.length % 2 == 0
    1 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{2, 4, 4, 4};
        var result = solution.decompressRLElist(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 2, 3};
        int[] expected = new int[]{1, 3, 3};
        var result = solution.decompressRLElist(nums);
        assertThat(result).isEqualTo(expected);
    }

}
