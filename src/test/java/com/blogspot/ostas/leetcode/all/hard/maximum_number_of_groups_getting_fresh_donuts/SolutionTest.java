package com.blogspot.ostas.leetcode.all.hard.maximum_number_of_groups_getting_fresh_donuts;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: batchSize = 3, groups = [1,2,3,4,5,6]
    Output: 4
    Explanation: You can arrange the groups as [6,2,4,5,1,3]. Then the 1st, 2nd, 4th, and 6th groups will be happy.
    Example 2:
    Input: batchSize = 4, groups = [1,3,2,5,2,2,1,6]
    Output: 4
      Constraints:
    1 <= batchSize <= 9
    1 <= groups.length <= 30
    1 <= groups[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int batchSize = 3;
        int[] groups = new int[]{1, 2, 3, 4, 5, 6};
        int expected = 4;
        var result = solution.maxHappyGroups(batchSize, groups);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int batchSize = 4;
        int[] groups = new int[]{1, 3, 2, 5, 2, 2, 1, 6};
        int expected = 4;
        var result = solution.maxHappyGroups(batchSize, groups);
        assertThat(result).isEqualTo(expected);
    }

}
