package com.blogspot.ostas.leetcode.all.easy.merge_two_two_d_arrays_by_summing_values;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
    Output: [[1,6],[2,3],[3,2],[4,6]]
    Explanation: The resulting array contains the following:
    - id = 1, the value of this id is 2 + 4 = 6.
    - id = 2, the value of this id is 3.
    - id = 3, the value of this id is 2.
    - id = 4, the value of this id is 5 + 1 = 6.
    Example 2:
    Input: nums1 = [[2,4],[3,6],[5,5]], nums2 = [[1,3],[4,3]]
    Output: [[1,3],[2,4],[3,6],[4,3],[5,5]]
    Explanation: There are no common ids, so we just include each id with its value in the resulting list.
      Constraints:
    1 <= nums1.length, nums2.length <= 200
    nums1[i].length == nums2[j].length == 2
    1 <= idi, vali <= 1000
    Both arrays contain unique ids.
    Both arrays are in strictly ascending order by id.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] nums1 = new int[][]{{1, 2}, {2, 3}, {4, 5}};
        int[][] nums2 = new int[][]{{1, 4}, {3, 2}, {4, 1}};
        int[][] expected = new int[][]{{1, 6}, {2, 3}, {3, 2}, {4, 6}};
        var result = solution.mergeArrays(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] nums1 = new int[][]{{2, 4}, {3, 6}, {5, 5}};
        int[][] nums2 = new int[][]{{1, 3}, {4, 3}};
        int[][] expected = new int[][]{{1, 3}, {2, 4}, {3, 6}, {4, 3}, {5, 5}};
        var result = solution.mergeArrays(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
