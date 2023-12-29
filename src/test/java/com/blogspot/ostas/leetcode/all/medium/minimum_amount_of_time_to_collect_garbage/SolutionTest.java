package com.blogspot.ostas.leetcode.all.medium.minimum_amount_of_time_to_collect_garbage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: garbage = ["G","P","GP","GG"], travel = [2,4,3]
    Output: 21
    Explanation:
    The paper garbage truck:
    1. Travels from house 0 to house 1
    2. Collects the paper garbage at house 1
    3. Travels from house 1 to house 2
    4. Collects the paper garbage at house 2
    Altogether, it takes 8 minutes to pick up all the paper garbage.
    The glass garbage truck:
    1. Collects the glass garbage at house 0
    2. Travels from house 0 to house 1
    3. Travels from house 1 to house 2
    4. Collects the glass garbage at house 2
    5. Travels from house 2 to house 3
    6. Collects the glass garbage at house 3
    Altogether, it takes 13 minutes to pick up all the glass garbage.
    Since there is no metal garbage, we do not need to consider the metal garbage truck.
    Therefore, it takes a total of 8 + 13 = 21 minutes to collect all the garbage.
    Example 2:
    Input: garbage = ["MMM","PGM","GP"], travel = [3,10]
    Output: 37
    Explanation:
    The metal garbage truck takes 7 minutes to pick up all the metal garbage.
    The paper garbage truck takes 15 minutes to pick up all the paper garbage.
    The glass garbage truck takes 15 minutes to pick up all the glass garbage.
    It takes a total of 7 + 15 + 15 = 37 minutes to collect all the garbage.
      Constraints:
    2 <= garbage.length <= 105
    garbage[i] consists of only the letters 'M', 'P', and 'G'.
    1 <= garbage[i].length <= 10
    travel.length == garbage.length - 1
    1 <= travel[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] garbage = new String[]{"G", "P", "GP", "GG"};
        int[] travel = new int[]{2, 4, 3};
        int expected = 21;
        var result = solution.garbageCollection(garbage, travel);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] garbage = new String[]{"MMM", "PGM", "GP"};
        int[] travel = new int[]{3, 10};
        int expected = 37;
        var result = solution.garbageCollection(garbage, travel);
        assertThat(result).isEqualTo(expected);
    }

}
