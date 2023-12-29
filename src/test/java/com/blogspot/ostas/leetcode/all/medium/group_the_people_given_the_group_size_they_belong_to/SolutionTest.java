package com.blogspot.ostas.leetcode.all.medium.group_the_people_given_the_group_size_they_belong_to;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: groupSizes = [3,3,3,3,3,1,3]
    Output: [[5],[0,1,2],[3,4,6]]
    Explanation:
    The first group is [5]. The size is 1, and groupSizes[5] = 1.
    The second group is [0,1,2]. The size is 3, and groupSizes[0] = groupSizes[1] = groupSizes[2] = 3.
    The third group is [3,4,6]. The size is 3, and groupSizes[3] = groupSizes[4] = groupSizes[6] = 3.
    Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
    Example 2:
    Input: groupSizes = [2,1,3,3,3,2]
    Output: [[1],[0,5],[2,3,4]]
      Constraints:
    groupSizes.length == n
    1 <= n <= 500
    1 <= groupSizes[i] <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] groupSizes = new int[]{3, 3, 3, 3, 3, 1, 3};
        List<List<Integer>> expected = List.of(List.of(5), List.of(0, 1, 2), List.of(3, 4, 6));
        var result = solution.groupThePeople(groupSizes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] groupSizes = new int[]{2, 1, 3, 3, 3, 2};
        List<List<Integer>> expected = List.of(List.of(1), List.of(0, 5), List.of(2, 3, 4));
        var result = solution.groupThePeople(groupSizes);
        assertThat(result).isEqualTo(expected);
    }

}
