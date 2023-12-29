package com.blogspot.ostas.leetcode.all.hard.smallest_range_covering_elements_from_k_lists;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [[4,10,15,24,26],[0,9,12,20],[5,18,22,30]]
    Output: [20,24]
    Explanation:
    List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
    List 2: [0, 9, 12, 20], 20 is in range [20,24].
    List 3: [5, 18, 22, 30], 22 is in range [20,24].
    Example 2:
    Input: nums = [[1,2,3],[1,2,3],[1,2,3]]
    Output: [1,1]
      Constraints:
    nums.length == k
    1 <= k <= 3500
    1 <= nums[i].length <= 50
    -105 <= nums[i][j] <= 105
    nums[i] is sorted in non-decreasing order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<Integer>> nums =
                List.of(List.of(4, 10, 15, 24, 26), List.of(0, 9, 12, 20), List.of(5, 18, 22, 30));
        int[] expected = new int[]{20, 24};
        var result = solution.smallestRange(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<Integer>> nums = List.of(List.of(1, 2, 3), List.of(1, 2, 3), List.of(1, 2, 3));
        int[] expected = new int[]{1, 1};
        var result = solution.smallestRange(nums);
        assertThat(result).isEqualTo(expected);
    }

}
