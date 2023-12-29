package com.blogspot.ostas.leetcode.all.medium.minimum_time_to_repair_cars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: ranks = [4,2,3,1], cars = 10
    Output: 16
    Explanation:
    - The first mechanic will repair two cars. The time required is 4 * 2 * 2 = 16 minutes.
    - The second mechanic will repair two cars. The time required is 2 * 2 * 2 = 8 minutes.
    - The third mechanic will repair two cars. The time required is 3 * 2 * 2 = 12 minutes.
    - The fourth mechanic will repair four cars. The time required is 1 * 4 * 4 = 16 minutes.
    It can be proved that the cars cannot be repaired in less than 16 minutes.
    Example 2:
    Input: ranks = [5,1,8], cars = 6
    Output: 16
    Explanation:
    - The first mechanic will repair one car. The time required is 5 * 1 * 1 = 5 minutes.
    - The second mechanic will repair four cars. The time required is 1 * 4 * 4 = 16 minutes.
    - The third mechanic will repair one car. The time required is 8 * 1 * 1 = 8 minutes.
    It can be proved that the cars cannot be repaired in less than 16 minutes.
      Constraints:
    1 <= ranks.length <= 105
    1 <= ranks[i] <= 100
    1 <= cars <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] ranks = new int[]{4, 2, 3, 1};
        int cars = 10;
        long expected = 16;
        var result = solution.repairCars(ranks, cars);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] ranks = new int[]{5, 1, 8};
        int cars = 6;
        long expected = 16;
        var result = solution.repairCars(ranks, cars);
        assertThat(result).isEqualTo(expected);
    }

}
