package com.blogspot.ostas.leetcode.all.medium.count_number_of_ways_to_place_houses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1
    Output: 4
    Explanation:
    Possible arrangements:
    1. All plots are empty.
    2. A house is placed on one side of the street.
    3. A house is placed on the other side of the street.
    4. Two houses are placed, one on each side of the street.
    Example 2:
    Input: n = 2
    Output: 9
    Explanation: The 9 possible arrangements are shown in the diagram above.
      Constraints:
    1 <= n <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int expected = 4;
        var result = solution.countHousePlacements(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int expected = 9;
        var result = solution.countHousePlacements(n);
        assertThat(result).isEqualTo(expected);
    }

}
