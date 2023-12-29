package com.blogspot.ostas.leetcode.all.easy.intersection_of_multiple_arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
    Output: [3,4]
    Explanation:
    The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and nums[2] = [3,4,5,6] are 3 and 4, so we return [3,4].
    Example 2:
    Input: nums = [[1,2,3],[4,5,6]]
    Output: []
    Explanation:
    There does not exist any integer present both in nums[0] and nums[1], so we return an empty list [].
      Constraints:
    1 <= nums.length <= 1000
    1 <= sum(nums[i].length) <= 1000
    1 <= nums[i][j] <= 1000
    All the values of nums[i] are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] nums = new int[][]{{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        List<Integer> expected = List.of(3, 4);
        var result = solution.intersection(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] nums = new int[][]{{1, 2, 3}, {4, 5, 6}};
        List<Integer> expected = List.of();
        var result = solution.intersection(nums);
        assertThat(result).isEqualTo(expected);
    }

}
