package com.blogspot.ostas.leetcode.all.easy.points_that_intersect_with_cars;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [[3,6],[1,5],[4,7]]
    Output: 7
    Explanation: All the points from 1 to 7 intersect at least one car, therefore the answer would be 7.
    Example 2:
    Input: nums = [[1,3],[5,8]]
    Output: 7
    Explanation: Points intersecting at least one car are 1, 2, 3, 5, 6, 7, 8. There are a total of 7 points, therefore the answer would be 7.
      Constraints:
    1 <= nums.length <= 100
    nums[i].length == 2
    1 <= starti <= endi <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<Integer>> nums = List.of(List.of(3, 6), List.of(1, 5), List.of(4, 7));
        int expected = 7;
        var result = solution.numberOfPoints(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<Integer>> nums = List.of(List.of(1, 3), List.of(5, 8));
        int expected = 7;
        var result = solution.numberOfPoints(nums);
        assertThat(result).isEqualTo(expected);
    }

}
