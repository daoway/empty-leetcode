package com.blogspot.ostas.leetcode.all.medium.form_array_by_concatenating_subarrays_of_another_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: groups = [[1,-1,-1],[3,-2,0]], nums = [1,-1,0,1,-1,-1,3,-2,0]
    Output: true
    Explanation: You can choose the 0th subarray as [1,-1,0,1,-1,-1,3,-2,0] and the 1st one as [1,-1,0,1,-1,-1,3,-2,0].
    These subarrays are disjoint as they share no common nums[k] element.
    Example 2:
    Input: groups = [[10,-2],[1,2,3,4]], nums = [1,2,3,4,10,-2]
    Output: false
    Explanation: Note that choosing the subarrays [1,2,3,4,10,-2] and [1,2,3,4,10,-2] is incorrect because they are not in the same order as in groups.
    [10,-2] must come before [1,2,3,4].
    Example 3:
    Input: groups = [[1,2,3],[3,4]], nums = [7,7,1,2,3,4,7,7]
    Output: false
    Explanation: Note that choosing the subarrays [7,7,1,2,3,4,7,7] and [7,7,1,2,3,4,7,7] is invalid because they are not disjoint.
    They share a common elements nums[4] (0-indexed).
      Constraints:
    groups.length == n
    1 <= n <= 103
    1 <= groups[i].length, sum(groups[i].length) <= 103
    1 <= nums.length <= 103
    -107 <= groups[i][j], nums[k] <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] groups = new int[][]{{1, -1, -1}, {3, -2, 0}};
        int[] nums = new int[]{1, -1, 0, 1, -1, -1, 3, -2, 0};
        boolean expected = true;
        var result = solution.canChoose(groups, nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] groups = new int[][]{{10, -2}, {1, 2, 3, 4}};
        int[] nums = new int[]{1, 2, 3, 4, 10, -2};
        boolean expected = false;
        var result = solution.canChoose(groups, nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] groups = new int[][]{{1, 2, 3}, {3, 4}};
        int[] nums = new int[]{7, 7, 1, 2, 3, 4, 7, 7};
        boolean expected = false;
        var result = solution.canChoose(groups, nums);
        assertThat(result).isEqualTo(expected);
    }

}
