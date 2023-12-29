package com.blogspot.ostas.leetcode.all.hard.maximum_xor_with_an_element_from_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [0,1,2,3,4], queries = [[3,1],[1,3],[5,6]]
    Output: [3,3,7]
    Explanation:
    1) 0 and 1 are the only two integers not greater than 1. 0 XOR 3 = 3 and 1 XOR 3 = 2. The larger of the two is 3.
    2) 1 XOR 2 = 3.
    3) 5 XOR 2 = 7.
    Example 2:
    Input: nums = [5,2,4,6,6,3], queries = [[12,4],[8,1],[6,3]]
    Output: [15,-1,5]
      Constraints:
    1 <= nums.length, queries.length <= 105
    queries[i].length == 2
    0 <= nums[j], xi, mi <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 2, 3, 4};
        int[][] queries = new int[][]{{3, 1}, {1, 3}, {5, 6}};
        int[] expected = new int[]{3, 3, 7};
        var result = solution.maximizeXor(nums, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 2, 4, 6, 6, 3};
        int[][] queries = new int[][]{{12, 4}, {8, 1}, {6, 3}};
        int[] expected = new int[]{15, -1, 5};
        var result = solution.maximizeXor(nums, queries);
        assertThat(result).isEqualTo(expected);
    }

}
