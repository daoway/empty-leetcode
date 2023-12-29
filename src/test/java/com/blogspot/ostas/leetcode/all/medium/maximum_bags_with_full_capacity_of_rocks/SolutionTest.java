package com.blogspot.ostas.leetcode.all.medium.maximum_bags_with_full_capacity_of_rocks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: capacity = [2,3,4,5], rocks = [1,2,4,4], additionalRocks = 2
    Output: 3
    Explanation:
    Place 1 rock in bag 0 and 1 rock in bag 1.
    The number of rocks in each bag are now [2,3,4,4].
    Bags 0, 1, and 2 have full capacity.
    There are 3 bags at full capacity, so we return 3.
    It can be shown that it is not possible to have more than 3 bags at full capacity.
    Note that there may be other ways of placing the rocks that result in an answer of 3.
    Example 2:
    Input: capacity = [10,2,2], rocks = [2,2,0], additionalRocks = 100
    Output: 3
    Explanation:
    Place 8 rocks in bag 0 and 2 rocks in bag 2.
    The number of rocks in each bag are now [10,2,2].
    Bags 0, 1, and 2 have full capacity.
    There are 3 bags at full capacity, so we return 3.
    It can be shown that it is not possible to have more than 3 bags at full capacity.
    Note that we did not use all of the additional rocks.
      Constraints:
    n == capacity.length == rocks.length
    1 <= n <= 5 * 104
    1 <= capacity[i] <= 109
    0 <= rocks[i] <= capacity[i]
    1 <= additionalRocks <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] capacity = new int[]{2, 3, 4, 5};
        int[] rocks = new int[]{1, 2, 4, 4};
        int additionalRocks = 2;
        int expected = 3;
        var result = solution.maximumBags(capacity, rocks, additionalRocks);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] capacity = new int[]{10, 2, 2};
        int[] rocks = new int[]{2, 2, 0};
        int additionalRocks = 100;
        int expected = 3;
        var result = solution.maximumBags(capacity, rocks, additionalRocks);
        assertThat(result).isEqualTo(expected);
    }

}
